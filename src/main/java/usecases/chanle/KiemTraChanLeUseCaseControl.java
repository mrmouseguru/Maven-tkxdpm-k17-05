package usecases.chanle;

import entities.chanle.KiemTraChanLe;
import entities.nhan2so.Nhan2So;

public class KiemTraChanLeUseCaseControl implements InputInterface {
	private OutputInterfaceChanLe out;
	private Nhan2So n2so;
	private KiemTraChanLe kiemTra;
	private OutputDataChanLe outData;
	
	public OutputDataChanLe getOutData() {
		return outData;
	}
	
	public KiemTraChanLeUseCaseControl(OutputInterfaceChanLe out, Nhan2So n2so, KiemTraChanLe kiemTra) {
		this.out = out;
		this.n2so = n2so;
		this.kiemTra = kiemTra;
	}
	
	public void execute(InputData inData) {
		// 1. Nhân 2 số
		n2so.setNumber1(inData.num1);
		n2so.setNumber2(inData.num2);
		int result = n2so.nhan2So();
		
		// 2. Kiểm tra chẵn lẻ và lấy màu sắc
		kiemTra.setNumber(result);
		boolean laChan = kiemTra.laChanHayle();
		String mauSac = kiemTra.layMauSac();
		
		// 3. Tạo output data
		outData = new OutputDataChanLe();
		outData.result = result;
		outData.laChan = laChan;
		outData.mauSac = mauSac;
		
		// 4. Gửi kết quả qua boundary
		out.present(outData);
	}
}
