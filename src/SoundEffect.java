import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */
 class SoundEffect implements ActionListener  {
	JFrame frame;
	JPanel panel;
	JButton sound1;
	JButton sound2;
	
	

	public static void main(String[] args) {
		SoundEffect Sounds = new SoundEffect();
		Sounds.makeGUI();
	}

	public void makeGUI() {
		frame = new JFrame();
		panel = new JPanel();
		sound1 = new JButton("Sound 1");
		sound2 = new JButton("Sound 2");

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(sound1);
		panel.add(sound2);
		frame.pack();
		
		sound1.addActionListener(this);
		sound2.addActionListener(this);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String whatSound = null ;
		
		if (e.getSource() == sound1)
		{	
			whatSound= "sawing-wood-daniel_simon.wav";
		}
		
		else if (e.getSource() == sound2)
		{
			whatSound = "homer-woohoo.wav";
		}	
	
		System.out.println(whatSound);
		playSound(whatSound);
		
		
	}
 
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
 
 
 
 }
 
 
 
 

