//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot kayla = new Robot();
	
	public static void main(String[] args) {
		kayla.setSpeed(100);
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
String spin = JOptionPane.showInputDialog("How dizzy do you want the robot to be from 1-10");
int s = Integer.parseInt(spin);

 // 1. Use the dance method to make the robot spin.
dance(s);

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			kayla.turn(360);
			
		}
	}
}

