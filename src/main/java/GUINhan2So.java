import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUINhan2So extends JFrame{
	
	public GUINhan2So() {
		GridLayout grid = new GridLayout(3,2);
		setLayout(grid);
		
		JLabel lbl1 = new JLabel("Number 1:");
		add(lbl1);//dòng 1 cột1
		JTextField tf1 = new JTextField(20);
		add(tf1);//dòng 1 cột 2
		
		JLabel lbl2 = new JLabel("Number 2:");
		add(lbl2);//dòng 1 cột1
		JTextField tf2 = new JTextField(20);
		add(tf2);//dòng 1 cột 2
		
		JLabel lbl3 = new JLabel("");
		add(lbl3);//dòng 1 cột1
		JButton btX = new JButton("X");
		btX.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						//submit
						//JOptionPane.showMessageDialog(null, "Hello");
						//lấy num1 và num2 từ tf1 và tf2
						
					}
				}
				);
		add(btX);//dòng 1 cột 2
		
		pack();//gói gọn
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		///setSize(400, 400);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		GUINhan2So n2so = new GUINhan2So();
	}
}
