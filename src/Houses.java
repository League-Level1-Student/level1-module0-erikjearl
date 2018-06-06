import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	static Robot rob = new Robot("mini");
	static Random ran = new Random();
	
	
	public static void main (String[] args)
	{
	
		
		
		rob.moveTo(54, 540);
		rob.setRandomPenColor();
		rob.penDown();
		rob.setSpeed(15);
		
		
		for (int i= 0 ; i <20; i++)
		{
		drawHouse(ran.nextInt(201) +100);
		}
	}
	
	public static void drawHouse(int height) {
		
		
		
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
