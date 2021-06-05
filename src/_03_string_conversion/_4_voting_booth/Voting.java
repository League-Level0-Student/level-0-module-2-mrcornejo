package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting {

	public static void main(String[] args) {
		//  put code here
		
	
			// questions?i know its a showInputdialog right?
		// yes.  and that will read in user's age as a
		// string.  but to see if age is at least 18,
		// you need to convert string to int.
		String age = JOptionPane.showInputDialog("how old are you (in years)");

		// you made 2 different variables with the same
		// name 'age'.  rename one of them.  like 'ageAsInt'
		int ageAsInt = Integer.parseInt(age);		
			// after the user entered their age, this code changes it from
		// a string to an int.  now try your code i did...it worked
		// good.  do you understand why this fixed the problem?a little could...
		//I'm sorry but my mom is telling me that we need to go.
		//could we save  ok.  one moment...
		
		// use this idea: Integer.parseInt(heightToRide);
		// not sure?yea
		
		if (ageAsInt >= 18)	// to test "greater than or equal to"
			System.out.println("who should be next president");
		else {
			
			// 'else' happens when 'if' above
			// it is false.  'else' does not have its own test
			System.out.println("vote as soon as you turn 18!");
		}
		// ok test it
		
		// I CARE!! I would put instesad "vote as soon as you turn 18!"okay
		//i think something is wrong i put 15 and said line 21
		
		// ah yes.  something you need to fix!  in line 15, you
		// stored user's age.  but then you ignored it and in line 19
		// set age to 18.  do you see the problem?  you need to
		// fix line 18.  convert 'age' to 'ageAsInt'.  lets see how
		// the last program did that...
		
		
		// I think voting is a privilege and a responsibility
		// in this country we're lucky we can vote!!
		
		// ok... can I help you with the red x problems above?yes
		
		// I'm helping Mariene set up..okay but i just have one little 
		//question would i still put string on the bottom
		// bottom of what?
		// this program is like roller coaster:
		// 1) use JOptionPane to ask user their age -> save as a string
		// 2) convert string to int
		// 3) if at least 18, say ....
		//    else say ...okay thanks
	}

}
