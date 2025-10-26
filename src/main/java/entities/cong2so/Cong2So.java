package entities.cong2so;

public class Cong2So {
	private int number1;
	private int number2;
	
	 
	public Cong2So() {
	}

	public Cong2So(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}


	public int cong2So() {
		return  number1 + number2;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
}
