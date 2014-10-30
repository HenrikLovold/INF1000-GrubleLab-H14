import javax.swing.*;

public class TestGUI{
	
	JFrame ramme;
	JLabel tekst;
	
	public TestGUI(){
		
		ramme = new JFrame("Hei-program");
		tekst = new JLabel("Hei, dette er et grafisk brukergrensesnitt");
		
		ramme.add(tekst);
		
		ramme.setSize(500, 500);
		ramme.setVisible(true);
		ramme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}