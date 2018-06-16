import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

public class FortuneCookie implements ActionListener{
	JFrame frame;
	JButton button;
	int counter = 0;

	public static void main(String[] args) {
		FortuneCookie Cookie = new FortuneCookie();
		Cookie.makeGUI();
	}

	
	public void makeGUI() {
	
	frame = new JFrame();
	button = new JButton("Eat Cookie");
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	
	frame.add(button);
	button.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	int rand = new Random().nextInt(4);
	
	if(counter > 4) {
	JOptionPane.showMessageDialog(null, "You will be fat if you keep eating these cookies");
	
	counter = 0;
	
	}
	else {
		counter++;
		
		if (rand == 1) {
		JOptionPane.showMessageDialog(null, "You will be poor");
		}
		else if (rand == 2) {
		JOptionPane.showMessageDialog(null, "This is your fortune");
		}
		else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will be rich");
		}
	
	}
	
	}
	

}

