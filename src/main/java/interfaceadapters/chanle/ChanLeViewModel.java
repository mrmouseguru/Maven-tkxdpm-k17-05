package interfaceadapters.chanle;

import interfaceadapters.Publisher;

public class ChanLeViewModel extends Publisher {
	public String result;
	public String loaiKetQua; // "Chẵn" hoặc "Lẻ"
	public String mauSac; // "red" hoặc "blue"
	
	public String getResult() {
		return result;
	}
	
	public String getLoaiKetQua() {
		return loaiKetQua;
	}
	
	public String getMauSac() {
		return mauSac;
	}
}
