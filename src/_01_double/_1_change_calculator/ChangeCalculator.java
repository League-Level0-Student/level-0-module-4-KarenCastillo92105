package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {
//Integers -infinity, -10,-9....-1, 0 ,1 ,9,10, infinity
//Not an integer: 2.5, 3.8, 10.56 THESE ARENT INTEGERS THEY ARE FRACTIONAL VALUES
	//NUMBER LINE: 1  ----- 2 ----- 3
	//			   1.1,1.11,1.11
//We need a double to handle things that are not whole numbers (integers)
	public static void main(String[] args) {
		
		// Ask the user how many nickels they have
		//General format for variable declaration:
		//Datatype variableName = whatever data you want to set it to;
		String myNickels = JOptionPane.showInputDialog("How many nickels do you have", null); 
		//datatypes that we know : String, int, and in this lesson we will encounter double
	
		// Convert their answer to an int.   Hint: Integer.parseInt(variableName);  
		int myNickelsInt= Integer.parseInt(myNickels);
		// Ask the user how many dimes they have, and convert their answer
		String myRob= JOptionPane.showInputDialog("How many dimes do you have",null);
		int myRobInt=Integer.parseInt(myRob);
		// Ask the user how many quarters they have, and convert their answer
		String myRoss=JOptionPane.showInputDialog("How many quarters do you have", null);
		int myQuarterInt=Integer.parseInt(myRoss);
		// Calculate how much money the user has.  Hint: Use a double variable 
		double myPennys = 0.25*myQuarterInt+ 0.10*myRobInt+ 0.05*myNickelsInt;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		JOptionPane.showMessageDialog(null, "The amount of money that you have is "+ myPennys);
	}
}

