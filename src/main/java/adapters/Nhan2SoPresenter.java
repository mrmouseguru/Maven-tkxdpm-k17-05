package adapters;

import nhan2so.OutputData;
import nhan2so.OutputInterface;

public class Nhan2SoPresenter implements OutputInterface{
	private Nhan2SoViewModel model;
	
	public Nhan2SoPresenter() {
		
	}
	
	
	public Nhan2SoPresenter(Nhan2SoViewModel model) {
		
		this.model = model;
	}
	public Nhan2SoViewModel getModel() {
		return model;
	}
	@Override
	public void present(OutputData outData) {
		//model = new Nhan2SoViewModel();
		model.result = String.valueOf(outData.result);
	}

}
