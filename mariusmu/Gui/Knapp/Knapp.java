import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Knapp {

	JFrame frame;
	JButton btnButton;
	JTextField textF;
	JLabel textL;
	JPanel panel;
	
	public Knapp() {
		frame = new JFrame("Knappen");
		textF = new JTextField(20);
		textL = new JLabel();
		panel = new JPanel();
		
		btnButton = new JButton("Klikk");
		btnButton.addActionListener(new Lytter());
			
		
		panel.add(textF);
		panel.add(btnButton);
		panel.add(textL);
		
		frame.add(panel);
		frame.setSize(100, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		class Lytter implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				String inText = textF.getText();
				textL.setText("Du tastet: \"" + inText + "\"");
			}
		
		}
	
} 