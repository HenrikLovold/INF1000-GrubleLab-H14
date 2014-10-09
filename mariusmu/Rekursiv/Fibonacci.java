import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;

class Fibonacci {
	

	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(100,100);
		JPanel panel = new JPanel();
		JTextField field = new JTextField();
		
		field.setText("Summen av fibonacci-tall fra 10 = " + sumFib(10));
		panel.add(field);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		

		
		
	}
	
	
	public static int sumFib(int i) {
		if(i < 1) {
			return 1;
		}
		return sumFib(i - 1) + sumFib(i - 2);
	}
	
	

	

}