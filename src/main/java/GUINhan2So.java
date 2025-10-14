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
						InputDTO inDTO = new InputDTO();
						inDTO.num1 = tf1.getText();
						inDTO.num2 = tf2.getText();
						Nhan2So n2so = new Nhan2So();
						Nhan2SoViewModel model = new Nhan2SoViewModel();
						Nhan2SoPresenter presenter = new Nhan2SoPresenter(model);
						Nhan2SoUseCaseControl uc = new 
								Nhan2SoUseCaseControl(presenter, n2so);
						
						Nhan2SoController controller =
								new Nhan2SoController(uc);
						controller.execute(inDTO);
						
						GUIViewOutput view = new GUIViewOutput();
						model.subscribe(view);
						model.notifySubscribers(model.result);
						
						
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
}
