package javaBasics;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {

	public static void main(String[] args) {
	
    //create window
	JFrame window = new JFrame();
	window.setVisible(true);
	window.setSize(800, 600);
	window.setTitle("my window");
	
	
	
	JLabel label = new JLabel();
	label.setText("my label");
	
	window.add(label);

	}

}
