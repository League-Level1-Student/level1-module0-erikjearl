/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
                int counter = 0 ;
		// 2. create a variable of type "Component" that will hold your image
          Component comp;
		// 3. use the "createImage()" method below to initialize your Component
          comp = createImage("https://upload.wikimedia.org/wikipedia/commons/f/ff/Domestic_goat_kid_in_capeweed.jpg");
		// 4. add the image to the quiz window
          quizWindow.add(comp);
		// 5. call the pack() method on the quiz window
          quizWindow.pack();
		
          
          
          // 6. ask a question that relates to the image
          String q1 = JOptionPane.showInputDialog("is the picture a goat");
		// 7. print "CORRECT" if the user gave the right answer
          
          if (q1.equals("yes")) {
          System.out.println("CORRECT");
          JOptionPane.showMessageDialog(null, "CORRECT");
          counter++;
          }
		// 8. print "INCORRECT" if the answer is wrong
          else {
          System.out.println("INCORRECT");
          JOptionPane.showMessageDialog(null, "INCORRECT");
          }
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
         
          quizWindow.remove(comp);
		// 10. find another image and create it (might take more than one line of code)
          Component pic2 = createImage("https://img.huffingtonpost.com/asset/581c1eab150000b700531aa2.jpeg?cache=u6ye1hoy5s&ops=1910_1000");
		// 11. add the second image to the quiz window
          quizWindow.add(pic2);
		// 12. pack the quiz window
          quizWindow.pack();
		// 13. ask another question
          String q2 = JOptionPane.showInputDialog("is the picture not a goat");
          // 14+ check answer, say if correct or incorrect, etc.
          if (q2.equals("yes")) {
        	  System.out.println("CORRECT");
        	  JOptionPane.showMessageDialog(null, "CORRECT");
        	  counter++;
              }
          else if (q2.equals("extra credit?"))
          {
        	  counter+=99;
          }
          
          else {
        	  System.out.println("INCORRECT");
        	  JOptionPane.showMessageDialog(null, "INCORRECT");
          }
          
          JOptionPane.showMessageDialog(null, "Your Finial Score was " + counter + " out of 2");
          double x = (double)counter / 2;
          
          JOptionPane.showMessageDialog(null, "That is " + x*100 + "%");
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
	
}





