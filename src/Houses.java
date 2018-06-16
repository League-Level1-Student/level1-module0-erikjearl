import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	static Robot rob = new Robot("mini");
	static Random ran = new Random();
	
	static String small = "60";
	static String medium = "120";
	static String large = "250";
	
	public static void main (String[] args)
	{
	
		
		
		rob.moveTo(54, 540);
		rob.setRandomPenColor();
		rob.penDown();
		rob.setSpeed(15);
		
		
		for (int i= 0 ; i <20; i++)
		{ 
			int rand = ran.nextInt(4);
					
			if (rand == 1) {
				drawPointyHouse(small);	
			}
			else if (rand == 2) {
				drawPointyHouse(medium);	
			}
			else if (rand == 3) {
				drawPointyHouse(large);	
			}
				
		}
		
		

		
		
	}
	
	public static void drawPointyHouse(String height) {
		
		if (height.equals(small)) {
			drawPointyHouse(60);
		}
		else if (height.equals(medium)) {
			drawFlatHouse(120);
		}
		else if (height.equals(large)) {
			drawFlatHouse(250);
		}
			
		

	}
	
	public static void drawPointyHouse(int height) {
		
		
		
		rob.setRandomPenColor();
		rob.move(height);
		rob.setAngle(45);
		rob.move(15);
		rob.setAngle(135);
		rob.move(15);
		rob.setAngle(180);
		rob.move(height);
		
		rob.setAngle(90);
		rob.setPenColor(0, 255, 0);
		rob.move(15);;
		
		rob.setAngle(0);
	}
		
	public static void drawFlatHouse(int height) {
		rob.setRandomPenColor();
		rob.move(height);
		rob.setAngle(90);
		rob.move(25);
		rob.setAngle(180);
		rob.move(height);
		
		rob.setAngle(90);
		rob.setPenColor(0, 255, 0);
		rob.move(15);;
		
		rob.setAngle(0);
		
	}
		
		

	
	
			
	
	
}
