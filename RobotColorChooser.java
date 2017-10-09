
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot kayla = new Robot();
		//3. ask the user what color they would like the robot to draw
		for (int i = 0; i < 1000; i++) {
			String color = JOptionPane.showInputDialog("What color would you like the robot to draw");
			if (color.equalsIgnoreCase("cyan")) {
				kayla.setPenColor(Color.CYAN);
			}else{
				kayla.setRandomPenColor();
			}	
		
		
		//4. use an if/else statement to set the pen color that the user requested

        //5. if the user doesn't enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
		
	    //1. make the robot draw a shape (this will take more than one line of code)
		
		kayla.setSpeed(10);
		kayla.penDown();
		kayla.setPenWidth(10);
		for (int x = 0; x < 4; x++) {
			kayla.move(150);
			kayla.turn(90);
			
		}
		}	


	}
}
