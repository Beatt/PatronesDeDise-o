package component;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Aplication extends JFrame {
	
	public void run(JPanel photo) {
		
		add(photo);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}//Fin class Aplication
