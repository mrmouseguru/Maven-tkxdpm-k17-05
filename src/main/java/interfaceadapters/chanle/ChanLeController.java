package interfaceadapters.chanle;

import usecases.chanle.InputData;
import usecases.chanle.InputInterface;

public class ChanLeController {
	private InputInterface inBoundary;
	
	public void execute(InputDTO inDTO) {
		InputData inData = new InputData(
			Integer.parseInt(inDTO.num1), 
			Integer.parseInt(inDTO.num2));
		
		inBoundary.execute(inData);
	}
	
	public ChanLeController(InputInterface inBoundary) {
		super();
		this.inBoundary = inBoundary;
	}
}
