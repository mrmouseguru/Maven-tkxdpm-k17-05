package frameworks.desktop;

import javax.swing.JOptionPane;

import adapters.Nhan2SoViewModel;

public class ResultDialogView implements Subscriber{
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
