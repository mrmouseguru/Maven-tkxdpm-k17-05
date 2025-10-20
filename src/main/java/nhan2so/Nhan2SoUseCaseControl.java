package nhan2so;

public class Nhan2SoUseCaseControl implements InputInterface{
	private OutputInterface out;
	private Nhan2So n2so;
	private OutputData outData;
	
	public OutputData getOutData() {
		return outData;
	}

	public Nhan2SoUseCaseControl(OutputInterface out, Nhan2So n2so) {
		
		this.out = out;
		this.n2so = n2so;
	}
	
	public void execute(InputData inData) {
		n2so.setNumber1(inData.num1);
		n2so.setNumber2(inData.num2);
		int result = n2so.nhan2So();//2. sai khiến Entity
		
		outData = new OutputData();
		outData.result = result;
		out.present(outData);//3. sai khiến boundary
	}



}
