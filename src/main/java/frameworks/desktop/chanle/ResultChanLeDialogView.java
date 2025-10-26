package frameworks.desktop.chanle;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import interfaceadapters.chanle.ChanLeViewModel;
import frameworks.desktop.Subscriber;

public class ResultChanLeDialogView implements Subscriber {
	private ChanLeViewModel model;
	
	public void setModel(ChanLeViewModel model) {
		this.model = model;
		// Đăng ký view với model
		model.addSubscriber(this);
	}
	
	@Override
	public void update() {
		// Tạo JLabel để hiển thị kết quả với màu sắc
		JLabel label = new JLabel("<html><div style='font-size:14px;'>"
				+ "Kết quả: " + model.result + "<br>"
				+ "Loại: " + model.loaiKetQua + "</div></html>");
		
		// Đặt màu nền dựa trên màu sắc
		if ("red".equals(model.mauSac)) {
			label.setForeground(Color.RED);
		} else if ("blue".equals(model.mauSac)) {
			label.setForeground(Color.BLUE);
		}
		
		JOptionPane.showMessageDialog(null, label, "Kết quả", JOptionPane.INFORMATION_MESSAGE);
	}
}
