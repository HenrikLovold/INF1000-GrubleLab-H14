import javax.swing.*;

public class TestGUI{

	JFrame ramme;
	JLabel tekst;

	public TestGUI(){
		ramme = new JFrame("GrubleProg"); //ramme-tekst
		tekst = new JLabel("Husk at grubling er sunt!"); // tekst som kommer opp i vindu

		// legg teksten inn i rammen
		ramme.add(tekst);


		// Always do:
		ramme.setSize(500, 500); // two ints
		ramme.setVisible(true);
		ramme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
