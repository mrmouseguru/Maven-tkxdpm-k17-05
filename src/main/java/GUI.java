import javax.swing.JOptionPane;

public class GUI implements InputInterface{

	@Override
	public InputData input() {
		// TODO Auto-generated method stub
		String strNum1 = 
				JOptionPane.showInputDialog("[EM XIN SỐ 1]");
		String strNum2 = 
				JOptionPane.showInputDialog("[EM XIN SỐ 2]");
		
		InputData inData = new InputData
				(Integer.parseInt(strNum1), 
						Integer.parseInt(strNum2));
		return inData;
	}

}
