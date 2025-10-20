package adapters;

import nhan2so.InputData;
import nhan2so.InputInterface;

public class Nhan2SoController {
	private InputInterface inBoundary;
	public void execute(InputDTO inDTO) {
		
	
		
		InputData inData = new InputData(
			Integer.parseInt(inDTO.num1), 
			Integer.parseInt(inDTO.num2));
		
		inBoundary.execute(inData);
	}
	public Nhan2SoController(InputInterface inBoundary) {
		super();
		this.inBoundary = inBoundary;
	}

}
