package interfaceadapters.cong2so;

import usecases.cong2so.InputData;
import usecases.cong2so.InputInterface;

public class Cong2SoController {
	private InputInterface inBoundary;
	
	public void execute(InputDTO inDTO) {
		InputData inData = new InputData(
			Integer.parseInt(inDTO.num1), 
			Integer.parseInt(inDTO.num2));
		
		inBoundary.execute(inData);
	}
	
	public Cong2SoController(InputInterface inBoundary) {
		super();
		this.inBoundary = inBoundary;
	}
}
