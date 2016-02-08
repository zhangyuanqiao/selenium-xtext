package selpluginproj.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.xtext.example.mydsl.myDsl.Main;



import org.eclipse.jface.dialogs.MessageDialog;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class InterpretorHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public InterpretorHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		XtextEditor editor = (XtextEditor) window.getActivePage().getActiveEditor();
		//MessageDialog.openInformation( window.getShell(),"SelPluginProj","Hello, Eclipse world");
		editor.getDocument().readOnly(
				  new IUnitOfWork<String, XtextResource>(){
				  @Override
				  public String exec(XtextResource xr) throws Exception {
				    xr.getAllContents();
				    (new Interpretor()).execute((Main) xr.getContents().get(0));
				    return null;
				  }
				});
		return null;
	}
}
