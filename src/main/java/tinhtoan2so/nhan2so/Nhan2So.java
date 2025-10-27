package tinhtoan2so.nhan2so;

import tinhtoan2so.TinhToan2So;

public class Nhan2So extends TinhToan2So {
	public Nhan2So(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public int tinh2so() {
		// TODO Auto-generated method stub
		return num1 * num2;
	}
	
	public static boolean isValidnumber(int num) {
		if(num >=0 && num <=9) {
			return true;
		}
		
		return false;
	}
	/*
	 * false: chẵn
	 * true: lẻ
	 */
	public boolean isResultOdd(int result) {
		if(result % 2 !=0) {
			return true;//lẻ
		}
		return false;
	}

}
