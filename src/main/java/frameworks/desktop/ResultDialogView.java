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
		if(model.result != null) {
			JOptionPane.
			showInternalMessageDialog(null, 
					"Result: " +model.result);
			return;
		}
		
		JOptionPane.showMessageDialog(null, model.errorMessage);
		
		
		
		
		
		
	}

}
