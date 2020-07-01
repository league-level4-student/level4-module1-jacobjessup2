package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		
		case "Monday":
		case "Thursday":
			JOptionPane.showMessageDialog(null, "Nothing special");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "D2 weekly reset");
				break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "Java Class");
				break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "Pizza Day");
			break;
		case "Saturday":	
		case "Sunday":
			JOptionPane.showMessageDialog(null, "Xur is up");
			break;
		}
	}
}
