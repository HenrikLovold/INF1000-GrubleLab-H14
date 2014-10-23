import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUI extends JFrame{

	JLabel navn1, navn2, result;
	JTextField navn1In, navn2In;
	JButton scoreBtn;

	MyActionListener action = new MyActionListener();

	Logic log;

	GUI(Logic log){

		this.log = log;

		//Layout
		this.setLayout(new GridLayout(3, 2));
		this.setTitle("LoveCalculator IFI Edition v2.0");

		//Labels
		navn1 = new JLabel();
		navn1.setText("Navn 1:");
		this.add(navn1);

		navn2 = new JLabel();
		navn2.setText("Navn 2:");
		this.add(navn2);

		//TextFields
		navn1In = new JTextField();
		this.navn1In.setEditable(true);
		this.navn1In.setBounds(MAXIMIZED_BOTH, MAXIMIZED_BOTH, MAXIMIZED_BOTH, MAXIMIZED_BOTH);
		this.add(navn1In);

		navn2In = new JTextField();
		this.navn2In.setEditable(true);
		this.navn2In.setBounds(MAXIMIZED_BOTH, MAXIMIZED_BOTH, MAXIMIZED_BOTH, MAXIMIZED_BOTH);
		this.add(navn2In);

		//Button/result
		scoreBtn = new JButton();
		this.scoreBtn.setText("GenerateScore");
		this.scoreBtn.setEnabled(true);
		this.scoreBtn.addActionListener(action);
		this.add(scoreBtn);

		result = new JLabel();
		result.setText("Score: ???");
		this.add(result);

		//Mandatory stuff
		this.setSize(500, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e){
			int score = log.generateLoveScore(navn1In.getText(), navn2In.getText());
			result.setText("Score: " + score + "%");
		}
	}
}






