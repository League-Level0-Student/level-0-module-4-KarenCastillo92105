package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String myScores=JOptionPane.	showInputDialog(null, "What is your test score?");	
		double myDouble=Double.parseDouble(myScores);
		//  LOWEST < BIGGEST
		// BIGGEST > LOWEST
		//logic within the if statement evaluates to TRUE or FALSE
		//if it is true, the code block next to it runs, otherwise it moves onto the next statement
		if(myDouble >90 ) {
			JOptionPane.	showMessageDialog(null, "You got A on your test!");		
		} 
		
		else if(myDouble<=90) {
			JOptionPane.showMessageDialog(null, "You didn't get A!");
			
		}
		
		
		
	}
}
