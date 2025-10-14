import javax.swing.JOptionPane;

public class GUIViewOutput implements Subscriber{
    @Override
    public void update(String result) {
        JOptionPane.showMessageDialog(null, "Result: " + result);
    }
    
}
