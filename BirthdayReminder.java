
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 28th";
		String dadsBirthday = "March 11th";
		String myBirthday = "December 17th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog("Who birthday do you want to know?");
	
		// 3. Print out what the user typed
		//JOptionPane.showMessageDialog(null, birthday);
		if (birthday.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}else if (birthday.equalsIgnoreCase("dad")){
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}else if (birthday.equalsIgnoreCase("kayla")){
			JOptionPane.showMessageDialog(null, myBirthday);
		}else{
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
