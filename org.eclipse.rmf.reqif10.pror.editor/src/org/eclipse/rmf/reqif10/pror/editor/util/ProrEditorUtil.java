/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Lukas Ladenberger - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.common.util.ProrXhtmlSimplifiedHelper;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.common.util.ReqIF10XhtmlUtil;
import org.eclipse.rmf.reqif10.pror.configuration.Column;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.UnifiedColumn;
import org.eclipse.rmf.reqif10.pror.editor.IReqifEditor;
import org.eclipse.rmf.reqif10.pror.editor.ISpecificationEditor;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.PresentationEditorInterface;
import org.eclipse.rmf.reqif10.pror.util.ConfigurationUtil;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

public class ProrEditorUtil {

	private static String createHtmlHeader(Specification spec,
			AdapterFactory adapterFactory) {
		StringBuilder sb = new StringBuilder();
		String title = ConfigurationUtil.getSpecElementLabel(spec,
				adapterFactory);
		
		sb.append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
		sb.append("<html>\n");
		sb.append("<head>\n");
		sb.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
		sb.append("<meta name=\"GENERATOR\" content=\"ProR (www.pror.org)\">\n");
		sb.append("<title>" + title + "</title>\n");
		sb.append("<style type=\"text/css\">\n");
		sb.append("body {font-family: Arial, sans-serif;}\n");
		sb.append("h1 {text-align: center;}\n");
		sb.append("table, th, td { border-bottom: 1px solid #cccccc; }\n");
		sb.append("td { padding: 2pt; }\n");
		sb.append("table { border-collapse: collapse; }");
		sb.append("</style>\n");
		sb.append("</head>\n\n");
		sb.append("<body>\n");
		sb.append("<h1>" + title + "</h1>\n");

		return sb.toString();
	}
	
	private static String getDefaultValue(AttributeValue av) {
		Object value = av == null ? null : ReqIF10Util.getTheValue(av);
		String textValue;
		if (value == null) {
			textValue = "";
		} else if (value instanceof List<?>) {
			textValue = "";
			for (Iterator<?> i = ((List<?>) ((List<?>) value)).iterator(); i
					.hasNext();) {
				EnumValue enumValue = (EnumValue) i.next();
				textValue += enumValue.getLongName();
				if (i.hasNext()) {
					textValue += ", ";
				}
			}
		} else if (value instanceof XhtmlContent) {
			textValue = ProrXhtmlSimplifiedHelper
					.xhtmlToSimplifiedString((XhtmlContent) value);
			try {
				String xhtmlString = ReqIF10XhtmlUtil
						.getXhtmlString((XhtmlContent) value);
				xhtmlString = xhtmlString.replace("<xhtml:", "<");
				xhtmlString = xhtmlString.replace("</xhtml:", "</");
				textValue = xhtmlString;
			} catch (IOException e) {
			}
		} else if (value instanceof GregorianCalendar) {
			GregorianCalendar cal = (GregorianCalendar)value;
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss z");  
			textValue = formatter.format(cal.getTime());
		} else {
			textValue = value.toString();
		}
		return textValue;
	}

	private static void printRecursive(StringBuilder html,
			ProrSpecViewConfiguration config, int indent,
			EList<SpecHierarchy> children,
			AdapterFactory adapterFactory) {
		for (SpecHierarchy child : children) {
			if (child.getObject() != null) {
				SpecObject specObject = child.getObject();
				boolean first = true;
				html.append("<tr>");
				for (Column col : config.getColumns()) {
					html.append("<td valign='top'>");

					// Handle indenting
					if (first) {
						html.append("<div style='margin-left: " + (indent * 20)
								+ "px;'>");
					}
					
					AttributeValue av;
					if (col instanceof UnifiedColumn) {
						av = ReqIF10Util.getAttributeValueForLabel(
								specObject, "ReqIF.Text");
						if (av == null || ReqIF10Util.getTheValue(av) == null) {
							av = ReqIF10Util.getAttributeValueForLabel(
									specObject, "ReqIF.ChapterName");							
						}
					} else {
						av = ReqIF10Util.getAttributeValueForLabel(
								specObject, col.getLabel());
					}
					DatatypeDefinition dd = ReqIF10Util
							.getDatatypeDefinition(av);
					ProrPresentationConfiguration configuration = ConfigurationUtil
							.getPresentationConfiguration(dd);

					Object itemProvider = ProrUtil.getItemProvider(
							adapterFactory, configuration);

					if (itemProvider instanceof PresentationEditorInterface) {
						PresentationEditorInterface presentationEditor = (PresentationEditorInterface) itemProvider;
						IProrCellRenderer renderer = presentationEditor
								.getCellRenderer(av);
						if (renderer != null) {
							String content = renderer.doDrawHtmlContent(av);
							if (content != null) {
								html.append(content);
							} else {
								html.append(getDefaultValue(av));
							}
						}

					} else {
						html.append(getDefaultValue(av));
					}

					if (first) {
						first = false;
						html.append("</div>");
					}
					html.append("</td>");
				}
				html.append("</tr>\n");
			}
			printRecursive(html, config, indent + 1, child.getChildren(),
					adapterFactory);
		}
	}

	public static String createHtmlContent(Specification spec,
			EditingDomain domain, AdapterFactory adapterFactory) {

		ProrSpecViewConfiguration config = ConfigurationUtil
				.createSpecViewConfiguration(spec, domain);

		StringBuilder html = new StringBuilder();

		// Draw the header
		html.append(ProrEditorUtil.createHtmlHeader(spec, adapterFactory));
		html.append("<table><tr>");
		EList<Column> cols = config.getColumns();
		for (Column col : cols) {
			html.append("<td><b>" + col.getLabel() + "</b></td>");
		}
		html.append("</tr>\n");
		printRecursive(html, config, 0, spec.getChildren(),
				adapterFactory);
		html.append("</table>");

		return html.toString();

	}

	public static Command getAffectedObjectCommand(final Object element,
			Command cmd) {
		return new CommandWrapper(cmd) {
			public java.util.Collection<?> getAffectedObjects() {
				List<Object> list = new ArrayList<Object>();
				list.add(element);
				return list;
			}
		};
	}
	
	/**
	 * Attempts to find the {@link IReqifEditor} or {@link ISpecificationEditor}
	 * for the given EObject by walking up the parent hierarchy to the enclosing
	 * {@link ReqIF} or {@link Specification}. If the {@link IReqifEditor} is
	 * found for a Specification, the corresponding editor will be opened.
	 * 
	 * @return the Editor or null if none found.
	 */
	public static IEditorPart getEditor(EObject eObject) {
		ReqIF reqif = null;
		Specification spec = null;
		while (eObject != null) {
			if (eObject instanceof Specification) {
				spec = (Specification) eObject;
			}
			if (eObject instanceof ReqIF) {
				reqif = (ReqIF) eObject;
				break;
			}
			eObject = eObject.eContainer();
		}
		if (reqif == null) return null;
		
		// Find the editor(s)
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage();

		IEditorReference[] eRefs = activePage.getEditorReferences();
		for (IEditorReference eRef : eRefs) {
			IEditorPart editor = eRef.getEditor(false);
			if (editor instanceof ISpecificationEditor) {
				ISpecificationEditor specEditor = (ISpecificationEditor) editor;

				// Case 1: We found the right SpecificationEditor
				if (specEditor.getSpecification().equals(spec)) {
					return specEditor;
				}
			}
			if (editor instanceof IReqifEditor) {
				IReqifEditor reqifEditor = (IReqifEditor) editor;
				if (reqifEditor.getReqif().equals(reqif)) {
					
					// Case 2: We found the right Reqif10Editor
					if (spec == null) return reqifEditor;
					
					// Case 3: We found the Reqif10Editor, but need the SpecificationEditor
					return reqifEditor.openSpecEditor(spec);
				}
			}
		}
		// Case 4: Nothing found
		return null;		
	}

	
}
