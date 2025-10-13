import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestUseCaseNhan2So {
	
	@Test
	public void testExecute() {
		//input: InputData
		//xử lý
		//output: ???
		InputData inData = new InputData(2, 2);
		Nhan2SoPresenter presenter = new Nhan2SoPresenter();
		InputInterface inputBoundary;
		Nhan2So n2so = new Nhan2So();
		//Nhan2SoUseCaseControl inputBoundary;
		inputBoundary = new 
				Nhan2SoUseCaseControl(presenter, n2so);
		inputBoundary.execute(inData);
		
		Nhan2SoUseCaseControl ucControl =
				(Nhan2SoUseCaseControl) inputBoundary;
		
		OutputData outData = ucControl.getOutData();
		assertEquals(4, outData.result);
		
		//Test Presenter
		Nhan2SoViewModel model = presenter.getModel();
		
		
		
		assertEquals("4", model.result);
		
		
		
	}

}
