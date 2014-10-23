import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FacGUI{

	JFrame frame;
	JLabel result, integerInText;
	JTextField integerIn;
	JButton calculateButton;
	JPanel panel;

	public FacGUI(){
		frame = new JFrame();
		
		// Layout
		frame.setLayout(new GridLayout(2,2));
		frame.setTitle("Calculating Faculty");
		panel = new JPanel();

		// label
		integerInText = new JLabel();
		integerInText.setText("Input number to calculate faculty:");
		panel.add(integerInText);

		//TextField
		integerIn = new JTextField("", 20);
		integerIn.setEditable(true);
		integerIn.setSize(200, 20);
		panel.add(integerIn);


		//Button
		calculateButton = new JButton();
		calculateButton.setText("Calculate!");
		calculateButton.setEnabled(true);
		calculateButton.addActionListener(new Listener());
		panel.add(calculateButton);

		// result
		result = new JLabel();
		result.setText("result");
		panel.add(result);

		frame.add(panel);

		

		// mandatory
		frame.setSize(500, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class Listener implements ActionListener{

		public void actionPerformed(ActionEvent e){
			String resultText = ("Faculty of " + integerIn.getText() + " is: ");

			resultText = resultText + "" + calculateFac(Integer.parseInt(integerIn.getText()));

			result.setText(resultText);
		}
	}

	public int calculateFac(int number){

		if (number > 0){
			return number * calculateFac(number - 1);
		}

		return 1;
	}
}