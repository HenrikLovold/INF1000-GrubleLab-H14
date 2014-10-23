import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Fakultet extends JFrame {

    private JFrame frame;
    private JButton btnKlikk;
    private JLabel label1;
	private JLabel information;
	private JTextField textF;
    private JPanel panel;
	private JPanel panel2; //For better layout
	private JButton btnButt;
	
    public Fakultet () {
	
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		textF = new JTextField(10);
		label1 = new JLabel();
		frame = new JFrame("Fakultetsregning: Skriv inn onsket tall");
		btnButt = new JButton("Regn ut");
		information = new JLabel("Skriv inn tall du onsker aa regne ut\n\n");
		
		panel = new JPanel();
		panel.setSize(20, 20);
		
		label1.setText("Skriv inn et tall");
		
		btnButt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label1.setText("Summen av fibbonacci tallet: " + sumFib(Integer.parseInt(textF.getText())) +"\n");
				
			}
		});
		
		panel2.add(information, BorderLayout.NORTH);
		panel2.add(label1, BorderLayout.SOUTH);
		panel2.add(textF, BorderLayout.CENTER);
		panel2.add(btnButt, BorderLayout.EAST);		
		
		frame.setLayout(new BorderLayout());
		frame.setResizable(false);
		frame.add(panel, BorderLayout.WEST);
		frame.add(panel2, BorderLayout.CENTER);
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
