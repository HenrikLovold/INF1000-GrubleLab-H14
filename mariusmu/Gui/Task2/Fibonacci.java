import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** 
 * Display a program which can calculate fibbonacci-numbers 
 * @author mariusmu@uio.no
 * User can insert their number
 */
public class Fibonacci {

	private JFrame frame;
	private JLabel infoWrite;
	private JLabel infoCalc;
	private JLabel sum;
	private JButton btn;
	private JTextField textField;
	private GridBagConstraints grid;
	
	public Fibonacci () {
		frame = new JFrame("Kalkuler fibbonacci-tall");
		infoWrite = new JLabel("Skriv inn et tall");
		infoCalc = new JLabel("Utregnet tall");
		sum = new JLabel();
		btn = new JButton("Regn ut");
		btn.addActionListener(new ListenerBtn());
		textField = new JTextField(20);
		
		frame.setLayout(new GridBagLayout());
		grid = new GridBagConstraints();
		grid.insets = new Insets(10, 10, 10, 10);
		grid.fill = GridBagConstraints.HORIZONTAL;
		
		grid.gridx = 0;
		grid.gridy = 0;
		frame.add(infoWrite, grid);
		
		grid.gridx = 1;
		grid.gridy = 0;
		frame.add(textField, grid);
		
		grid.gridx = 0;
		grid.gridy = 1;
		frame.add(btn, grid);
		
		grid.gridx = 0;
		grid.gridy = 2;
		frame.add(infoCalc, grid);
		
		grid.gridx = 1;
		grid.gridy = 2;
		frame.add(sum, grid);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	/**
	 * Changes the sum-text with the calculated number if the number doesn't exceed 60 
	 */
	class ListenerBtn implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if(Integer.parseInt(textField.getText()) > 60 ) {
					sum.setText("Feil. Tallet er for stort");
				} else {
					int calculatedFib = sumFib(Integer.parseInt(textField.getText()));
					sum.setText("" + calculatedFib);
				}
			} catch(Exception ex) {
				sum.setText("Feil! Du maa angi et gyldig tall");
			}
		}
		
	
	}
	/**
	* Calculate the fibbonacci-number 
	* @return int the fibonacci sum of the spesific number given
	*/
	public static int sumFib(int i) {
		if(i < 1) {
			return 1;
		}
		return sumFib(i - 1) + sumFib(i - 2);
	}
	
	
}