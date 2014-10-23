import javax.swing.*;
import java.awt.*;

public class Fakultet extends JFrame {

    private JFrame frame;
    private JButton btnKlikk;
    private JLabel label1;
    private BorderLayout bl;
    private JPanel panel;

    public Fakultet () {
		frame = new JFrame("Fakultetsregning");
		label1 = new JLabel();
		bl = new BorderLayout();
		panel = new JPanel();
		
		label1.setText("Summen av fibonacci-tall fra 10 = " + sumFib(10));

		panel.setSize(20, 20);
		frame.setLayout(bl);
		frame.add(panel, BorderLayout.WEST);
		frame.add(label1, BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setSize(300, 100);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    }
    public static int sumFib(int i) {
	if(i < 1) {
	    return 1;
	}
	return sumFib(i - 1) + sumFib(i - 2);
   }
	
	
}
