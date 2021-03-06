/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     Lukas Ladenberger - ProR GUI     
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.propertiesview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.pror.editor.ISpecificationEditor;
import org.eclipse.rmf.reqif10.pror.editor.presentation.Reqif10EditorPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.views.properties.IPropertySheetPage;

/**
 * This is a custom/modified property sheet page in order to use agile grid to
 * display the content/properties.
 * 
 * @author Lukas Ladenberger
 * @author Michael Jastram
 */
public class ProrPropertySheetPage extends Page implements IPropertySheetPage {

	protected EditingDomain editingDomain;

	protected TabFolder tabFolder;
	protected ProrPropertyControl allProperties;
	protected ProrPropertyControl standardProperties;

	protected IAction locateValueAction = new LocateValueAction();

	protected AdapterFactory adapterFactory;

	private List<AttributeValue> objectsToSelect = new ArrayList<AttributeValue>();

	private CommandStackListener commandStackListener;

	protected TabItem tabStandard;
	protected TabItem tabAll;

	public ProrPropertySheetPage(EditingDomain editingDomain,
			AdapterFactory adapterFactory) {
		super();
		this.editingDomain = editingDomain;
		this.adapterFactory = adapterFactory;
		registerCommandStackListener();

	}

	/**
	 * We register a command stack listener in order to listen on changes on
	 * attributes values in the specification editor.
	 */
	protected void registerCommandStackListener() {
		if (editingDomain != null) {
			editingDomain.getCommandStack().addCommandStackListener(
					getCommandStackListener());
		}
	}

	protected void unRegisterCommandStackListener() {
		if (editingDomain != null) {
			editingDomain.getCommandStack().removeCommandStackListener(
					getCommandStackListener());
		}
	}

	protected CommandStackListener getCommandStackListener() {
		if (commandStackListener == null) {
			commandStackListener = new CommandStackListener() {
				public void commandStackChanged(final EventObject event) {
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
							// Try to select the affected objects.
							Command mostRecentCommand = ((CommandStack) event
									.getSource()).getMostRecentCommand();
							if (mostRecentCommand != null) {
								Collection<?> affectedObjects = mostRecentCommand
										.getAffectedObjects();
								if (!affectedObjects.isEmpty()) {
									Object firstItem = affectedObjects
											.toArray()[0];
									if (firstItem instanceof Identifiable
											|| firstItem instanceof AttributeValue) {
										update();
									}
								}
							}
						}
					});
				}
			};
		}
		return commandStackListener;
	}

	/**
	 * Create new ProR Properties Viewer if we don't have one yet.
	 */
	@Override
	public void createControl(Composite parent) {
		if (tabFolder == null) {
			tabFolder = new TabFolder(parent, SWT.BOTTOM);

			standardProperties = new ProrPropertyControl(tabFolder,
					adapterFactory, false);
			tabStandard = new TabItem(tabFolder, SWT.NONE);
			tabStandard.setText(Reqif10EditorPlugin.getPlugin().getString(
					"_UI_Standard_Properties"));
			tabStandard.setControl(standardProperties);

			allProperties = new ProrPropertyControl(tabFolder, adapterFactory,
					true);
			tabAll = new TabItem(tabFolder, SWT.NONE);
			tabAll.setText(Reqif10EditorPlugin.getPlugin().getString(
					"_UI_All_Properties"));
			tabAll.setControl(allProperties);
		}
	}

	/**
	 * This method is called if a selection was changed in the
	 * {@link ProrPropertySheetPage}.
	 */
	private void handleEntrySelection(ISelection selection) {
		objectsToSelect.clear();
		if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1) {
				AttributeValue atrVal = (AttributeValue) structuredSelection
						.getFirstElement();
				objectsToSelect.add(atrVal);
			} else {
				Object[] atrVals = structuredSelection.toArray();
				for (Object obj : atrVals) {
					objectsToSelect.add((AttributeValue) obj);
				}
			}
		}
		locateValueAction.setEnabled(!selection.isEmpty());
	}

	@Override
	public Control getControl() {
		return tabFolder;
	}

	@Override
	public void setFocus() {
		if (!getControl().isDisposed()){
			getControl().setFocus();
		}
	}

	/**
	 * This method is called if a selection was changed in the
	 * {@link ISpecificationEditor}.
	 */
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		EditingDomain newEditingDomain = null;
		if (part instanceof IEditingDomainProvider) {
			newEditingDomain = ((IEditingDomainProvider) part)
					.getEditingDomain();
		} else if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1) {
				newEditingDomain = AdapterFactoryEditingDomain
						.getEditingDomainFor(structuredSelection
								.getFirstElement());
			}
		}
		updateEditingDomain(newEditingDomain);
		if (allProperties != null && !allProperties.isDisposed()) {
			allProperties.setSelection(selection);
		}
		if (standardProperties != null && !standardProperties.isDisposed()) {
			standardProperties.setSelection(selection);
		}
	}

	protected void updateEditingDomain(EditingDomain newEditingDomain) {
		if (editingDomain != newEditingDomain) {
			unRegisterCommandStackListener();
			editingDomain = newEditingDomain;
			registerCommandStackListener();
		}

	}

	private void update() {
		if (allProperties != null && !allProperties.isDisposed()) {
			allProperties.update();
			standardProperties.update();
		}
	}

	/**
	 * This method should be overridden to set the selection.
	 */
	private void setSelectionToViewer(List<?> selection) {
		handleEntrySelection(new StructuredSelection(selection));
	}

	@Override
	public void makeContributions(IMenuManager menuManager,
			IToolBarManager toolBarManager, IStatusLineManager statusLineManager) {
		super.makeContributions(menuManager, toolBarManager, statusLineManager);
		toolBarManager.add(locateValueAction);
	}

	protected class LocateValueAction extends Action {

		public LocateValueAction() {
			setText(EMFEditUIPlugin.INSTANCE
					.getString("_UI_LocateValue_action"));
			setToolTipText(EMFEditUIPlugin.INSTANCE
					.getString("_UI_LocateValue_action_tool_tip"));
			setImageDescriptor(ExtendedImageRegistry.INSTANCE
					.getImageDescriptor(EMFEditUIPlugin.INSTANCE
							.getImage("full/elcl16/LocateValue")));
			setDisabledImageDescriptor(ExtendedImageRegistry.INSTANCE
					.getImageDescriptor(EMFEditUIPlugin.INSTANCE
							.getImage("full/dlcl16/LocateValue")));
		}

		@Override
		public void run() {
			setSelectionToViewer(objectsToSelect);
		}

	}

	@Override
	public void dispose() {
		if (commandStackListener != null) {
			if (editingDomain != null) {
				editingDomain.getCommandStack().removeCommandStackListener(
						commandStackListener);
			}
			commandStackListener = null;
		}
		super.dispose();
	}


	
}
