import javax.swing.*;
import java.awt.*;

public class Task1 {

    JFrame frame;
    JTextField tField;
    JLabel label;
    BorderLayout bl = new BorderLayout();
    JPanel panel;

    public Testgui () {
	frame = new JFrame("GrubleProg");
	frame.setLayout(bl);

	panel = new JPanel(); //A little space before the label
	panel.setSize(20,20); // 20px x 20px

	label = new JLabel("Husk at grubling er sunt!");
	
	frame.add(panel, BorderLayout.WEST);
	frame.add(label, BorderLayout.CENTER);

	frame.setSize(200, 200);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
