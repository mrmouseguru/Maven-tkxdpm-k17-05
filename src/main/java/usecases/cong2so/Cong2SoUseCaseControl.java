package usecases.cong2so;

import entities.cong2so.Cong2So;

public class Cong2SoUseCaseControl implements InputInterface {
	private OutputInterface out;
	private Cong2So c2so;
	private OutputData outData;
	
	public OutputData getOutData() {
		return outData;
	}

	public Cong2SoUseCaseControl(OutputInterface out, Cong2So c2so) {
		this.out = out;
		this.c2so = c2so;
	}
	
	public void execute(InputData inData) {
		c2so.setNumber1(inData.num1);
		c2so.setNumber2(inData.num2);
		int result = c2so.cong2So(); // 2. sai khiến Entity
		
		outData = new OutputData();
		outData.result = result;
		out.present(outData); // 3. sai khiến boundary
	}
}
