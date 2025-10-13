import java.io.PrintWriter;
import java.util.Scanner;

public class UIConsole implements InputInterface{
	private Scanner in;
	private PrintWriter out;

	public UIConsole(Scanner in, 
			PrintWriter out) {
		this.in = in;
		this.out = out;
	}
	
	@Override
	public InputData input() {
		out.print("[EM XIN SO 1]:");
		out.flush();
		int num1 = in.nextInt();
		out.print("[EM XIN SO 2]:");
		out.flush();
		int num2 = in.nextInt();
		InputData input =new InputData(num1, num2);
		return input;
	}
	
	

}
