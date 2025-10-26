package frameworks.desktop.nhan2so;

import javax.swing.JOptionPane;

import interfaceadapters.nhan2so.Nhan2SoViewModel;
import frameworks.desktop.Subscriber;

public class ResultDialogView implements Subscriber {
	private Nhan2SoViewModel model;
	
	
	public void setModel(Nhan2SoViewModel model) {
		this.model = model;
		//đăng ký view với model
		model.addSubscriber(this);
	}
	
	@Override
	public void update() {
		
		JOptionPane.
		showInternalMessageDialog(null, 
				"Result: " +model.result);
		
	}

}
