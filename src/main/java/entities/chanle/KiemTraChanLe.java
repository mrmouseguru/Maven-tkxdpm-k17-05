package entities.chanle;

public class KiemTraChanLe {
	private int number;
	
	public KiemTraChanLe() {
	}
	
	public KiemTraChanLe(int number) {
		this.number = number;
	}
	
	public boolean laChanHayle() {
		return number % 2 == 0;
	}
	
	public String layMauSac() {
		if (laChanHayle()) {
			return "red"; // Chẵn thì màu đỏ
		} else {
			return "blue"; // Lẻ thì màu xanh
		}
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
}
