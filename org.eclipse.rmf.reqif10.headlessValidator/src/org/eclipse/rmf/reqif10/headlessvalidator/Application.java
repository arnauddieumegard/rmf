package org.eclipse.rmf.reqif10.headlessvalidator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.constraints.validator.Issue;
import org.eclipse.rmf.reqif10.constraints.validator.ReqIFValidator;
import org.eclipse.rmf.reqif10.constraints.validator.ValidationResult;
import org.eclipse.rmf.reqif10.serialization.ReqIF10ResourceFactoryImpl;
import org.eclipse.sphinx.emf.serialization.XMLPersistenceMappingResourceImpl;
import org.eclipse.sphinx.emf.serialization.XMLPersistenceMappingResourceSetImpl;
import org.osgi.framework.Bundle;
import org.osgi.framework.Version;



/**
 * Load a ReqIF from a file and run the EMF-Validation on the reqif
 * 
 * The Validation results are dumped to stdout
 */
public class Application implements IApplication {

	
	private static final String PLUGIN_ID = "org.eclipse.rmf.reqif10.headlessValidator";
	
	XMLPersistenceMappingResourceSetImpl resourceSet;
	private List<ReqIF> reqifs;
	private List<String> files;
	private boolean resultAsXml = false;
	
	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
	 */
	public Object start(IApplicationContext context) throws Exception {
		files = new LinkedList<String>();
		
		final Map args = context.getArguments();  
		final String[] appArgs = (String[]) args.get("application.args"); 
		for (final String arg : appArgs) {  
			if ("-x".equals(arg)){
				resultAsXml = true;
			}else{
				files.add(arg);
			}
		}
		
		if (files.size() == 0){
			printUsage();
			System.err.println();
			System.err.println("ERROR: missing reqif file");
			return new Integer(1);
		}
		
		try{
			run();
		}catch (FileNotFoundException e){
			System.err.println("ERROR: File not found " + e.getMessage());
			printUsage();
			return new Integer(2);
		}catch (RuntimeException e){
			System.err.println("ERROR: " + e.getMessage());
			printUsage();
			return new Integer(3);
		}
		
		return IApplication.EXIT_OK;
		
	}
	
	
	private void printUsage() {
		Bundle bundle = Platform.getBundle(PLUGIN_ID);//$NON-NLS-N$
		Version version = bundle.getVersion();
		System.err.println("Consequent ReqIF Validation v." + version.toString());
		System.err.println("Usage: consequent [-consoleLog] [-x] FILE...");
		System.err.println("       -x: output validation result as xml");
		System.err.println("       -consolelog: Mirrors the error log to the console");
		System.err.println("More information at http://formalmind.com/consequent");
		System.err.println();
	}


	public List<Issue> run() throws IOException{
		
		resourceSet = new XMLPersistenceMappingResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("reqif", new ReqIF10ResourceFactoryImpl());
		reqifs = new LinkedList<ReqIF>();
		
		loadReqifs(files);
		
		List<Issue> allIssues = new LinkedList<Issue>();
		
		ReqIFValidator reqIFValidator = new ReqIFValidator();
		
		ValidationResult validationResult = new ValidationResult();
		validationResult.setFiles(files);
		
		for (ReqIF reqif : reqifs) {
			List<Issue> issues = reqIFValidator.validate(reqif);
			allIssues.addAll(issues);
			
			
		}
		validationResult.setIssues(allIssues);
		
		printResults(validationResult);
		
		return allIssues;
	}
	

	public void printResults(ValidationResult validationResult){
		if (resultAsXml){
			System.out.println(ValidationResult.getXMLResult(validationResult));
		}else {
			System.out.println(getTextResult(validationResult));
		}
	}
	
	
	public String getTextResult(ValidationResult validationResult){
	
		List<Issue> issues = validationResult.getIssues();
		
		StringBuilder sb = new StringBuilder();
		for (Issue issue : issues) {
			String errorPrefix = "";
			if (validationResult.getFiles().size()>1){
				errorPrefix = issue.getReqif().eResource().getURI().toFileString();
				errorPrefix = errorPrefix + " ";
			}
			sb.append(errorPrefix + issue.toString());
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}
	
	

	
	
	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
	}
	
	
	
	public void loadReqifs(List<String> filenames) throws IOException{
		for (String filename : filenames) {
			URI emfURI = URI.createFileURI(filename);
			
			if (!"reqif".equals(emfURI.fileExtension())){
				throw new IllegalArgumentException("Illegal File extension '" + emfURI.fileExtension() + "' for " + filename + "");
			}
			
			if (!new File(emfURI.toFileString()).exists() ){
				throw new FileNotFoundException(filename);
			}
			
			XMLPersistenceMappingResourceImpl resource = (XMLPersistenceMappingResourceImpl) resourceSet.createResource(emfURI);
			resource.load(null);
			EList<EObject> rootObjects = resource.getContents();
			if (!rootObjects.isEmpty()) {
				reqifs.add((ReqIF) rootObjects.get(0));
			}
			
		}
	}


	public void setFiles(LinkedList<String> files) {
		this.files = files;
	}
	
}