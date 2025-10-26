package interfaceadapters.chanle;

import usecases.chanle.OutputDataChanLe;
import usecases.chanle.OutputInterfaceChanLe;

public class ChanLePresenter implements OutputInterfaceChanLe {
	private ChanLeViewModel model;
	
	public ChanLePresenter() {
	}
	
	public ChanLePresenter(ChanLeViewModel model) {
		this.model = model;
	}
	
	public ChanLeViewModel getModel() {
		return model;
	}
	
	@Override
	public void present(OutputDataChanLe outData) {
		model.result = String.valueOf(outData.result);
		model.loaiKetQua = outData.laChan ? "Chẵn" : "Lẻ";
		model.mauSac = outData.mauSac;
	}
}
