import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KnappeGUI{
		
	JFrame ramme;
	JPanel panel;
	JTextField inText;
	JLabel outText;
	JButton knapp;
	
	public KnappeGUI(){
		ramme = new JFrame("KnappeProg");
		panel = new JPanel();
		inText = new JTextField("", 10);
		outText = new JLabel("");
		knapp = new JButton();
		
		panel.add(inText);
		panel.add(knapp);
		panel.add(outText);
		
		inText.setText("inText");
		outText.setText("outText");
		knapp.setText("Klikk!");
		
		knapp.addActionListener(new Lytter());
		
		inText.setSize(90, 20);
		outText.setSize(90, 20);
		
		ramme.add(panel);
		
		ramme.setSize(100, 300);
		ramme.setVisible(true);
		ramme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class Lytter implements ActionListener {
		public void actionPerformed(ActionEvent e){
			String tastet = inText.getText();
			outText.setText("Du tastet " + tastet);
		}
	}
}
