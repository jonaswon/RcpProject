package rcpproject;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

public class ViewPart1 extends ViewPart {

	public static final String ID = "rcpproject.views.view1";
	
	public ViewPart1() {
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void createPartControl(Composite parent) {
//		Composite container = new Composite(parent, SWT.NONE);
//		createActions();
//		initializeToolBar();
//		initializeMenu();
		
		Composite composite = new Composite(parent, SWT.NONE);
		
		Label label = new Label(composite, SWT.NONE);
		label.setBounds(10, 10, 84, 21);
		label.setText("��ͼ1");
	}

	@Override
	public void setFocus() {
		// TODO �Զ����ɵķ������

	}

	private void createActions() {
    }
    private void initializeToolBar() {
        IToolBarManager toolBarManager =
            getViewSite().getActionBars().getToolBarManager();
    }
    private void initializeMenu() {
        IMenuManager manager =
           getViewSite().getActionBars().getMenuManager();
    }
}
