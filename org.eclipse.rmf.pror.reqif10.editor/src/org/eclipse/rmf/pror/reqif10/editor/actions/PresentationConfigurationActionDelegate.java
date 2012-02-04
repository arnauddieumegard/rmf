/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.pror.reqif10.editor.actions;

import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.rmf.pror.reqif10.configuration.ConfigFactory;
import org.eclipse.rmf.pror.reqif10.configuration.ConfigPackage;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfigurations;
import org.eclipse.rmf.pror.reqif10.configuration.ProrToolExtension;
import org.eclipse.rmf.pror.reqif10.editor.presentation.Reqif10Editor;
import org.eclipse.rmf.pror.reqif10.editor.presentation.SpecificationEditor;
import org.eclipse.rmf.pror.reqif10.presentation.service.PresentationPluginManager;
import org.eclipse.rmf.pror.reqif10.presentation.service.PresentationService;
import org.eclipse.rmf.pror.reqif10.util.ConfigurationUtil;
import org.eclipse.rmf.pror.reqif10.util.ProrUtil;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

public class PresentationConfigurationActionDelegate implements
		IEditorActionDelegate {

	private Reqif10Editor editor;

	/**
	 * Retrieves the {@link EditingDomain} from the Editor if present.
	 */
	@Override
	public void setActiveEditor(IAction action, IEditorPart editor) {
		if (editor instanceof Reqif10Editor) {
			this.editor = (Reqif10Editor) editor;
		} else if (editor instanceof SpecificationEditor) {
			this.editor = ((SpecificationEditor) editor).getReqifEditor();
		} else {
			this.editor = null;
		}
	}

	/**
	 * Opens the {@link ReqIFToolExtension} for the current
	 * {@link EditingDomain}.
	 */
	@Override
	public void run(IAction action) {
		if (editor == null)
			return;
		SubtreeDialog dialog = new SubtreeDialog(editor, getProrPresentationConfigurations(), "Presentation Configuration",
				"org.eclipse.rmf.pror.reqif10.editor.presentationConfiguration");
		dialog.setActions(buildAddPresentationActions(), true);
		dialog.open();
	}

	private IAction[] buildAddPresentationActions() {

		Set<Class<? extends ProrPresentationConfiguration>> configs = PresentationPluginManager
				.getPresentationServiceMap().keySet();
		IAction[] actions = new IAction[configs.size()];

		int i = 0;
		for (final Class<? extends ProrPresentationConfiguration> config : configs) {

			actions[i++] = new Action(ProrUtil.substractPrefixPostfix(config, "","ConfigurationImpl")) {
				@Override
				public void run() {
					PresentationService service = PresentationPluginManager
							.getPresentationServiceMap().get(config);
					ProrPresentationConfiguration config = service
							.getConfigurationInstance();
					Command command = AddCommand
							.create(editor.getEditingDomain(),
									getProrPresentationConfigurations(),
									ConfigPackage.Literals.PROR_PRESENTATION_CONFIGURATIONS__PRESENTATION_CONFIGURATIONS,
									config);
					editor.getEditingDomain().getCommandStack()
							.execute(command);
				}
			};
		}
		return actions;
	}

	/**
	 * Retrieves the {@link ProrToolExtension} and ensures that
	 * {@link ProrPresentationConfigurations} are not null.
	 */
	private ProrPresentationConfigurations getProrPresentationConfigurations() {
		final ProrToolExtension ext = ConfigurationUtil
				.getProrToolExtension(editor.getReqif(), editor.getEditingDomain());
		
		if (ext.getPresentationConfigurations() == null) {

			Command cmd = SetCommand
					.create(editor.getEditingDomain(),
							ext,
							ConfigPackage.Literals.PROR_TOOL_EXTENSION__PRESENTATION_CONFIGURATIONS,
							ConfigFactory.eINSTANCE
									.createProrPresentationConfigurations());
			editor.getEditingDomain().getCommandStack().execute(cmd);
		}
		return ext.getPresentationConfigurations();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// No action required.
	}

}