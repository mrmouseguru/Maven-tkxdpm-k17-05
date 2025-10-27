package tinhtoan2so.nhan2so;

public class Nhan2SoUseCaseControl implements InputInterface{
	private OutputInterface out;
	//private Nhan2So n2so;
	private OutputData outData;
	
	public OutputData getOutData() {
		return outData;
	}

	public Nhan2SoUseCaseControl(OutputInterface out) {
		
		this.out = out;
		//this.n2so = n2so;
	}
	
	public void execute(InputData inData) {
		//validate
		if(!Nhan2So.isValidnumber(inData.num1) ||
				!Nhan2So.isValidnumber(inData.num2))
		{
			OutputData outError = new OutputData();
			outError.errorMessage = "Vui lòng nhập số trong khoảng 0-9";
			out.present(outError);
			return;
			
		}
		
		
		Nhan2So n2so = new Nhan2So(inData.num1, inData.num2);
		int result = n2so.tinh2so();//2. sai khiến Entity
		
		outData = new OutputData();
		outData.result = result;
		out.present(outData);//3. sai khiến boundary
	}



}
