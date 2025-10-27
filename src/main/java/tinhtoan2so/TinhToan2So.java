package tinhtoan2so;

public abstract class TinhToan2So {
	protected int num1;
	protected int num2;
	
	protected TinhToan2So(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public abstract int tinh2so();
	
	

}
