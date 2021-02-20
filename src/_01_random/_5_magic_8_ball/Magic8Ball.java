//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

public class Magic8Ball {
	public static void main (String[] args) {
		Random randomMaker = new Random();
		// 1. Make a main method that includes all the steps below
		
		// you're almost done - next week you can add code to
		// allow user to ask the magic 8 ball a question for it to respond to 
		
		// i'll help you save your work.  good job!

		// 2. Get the user to enter a question for the 8 ball to answer
		// this made the 4 statements get repeated 3 times...
//		for (int i=1; i<1; i++) {	// this is a loop that repeats 0 times!!!
			
			int	number = randomMaker.nextInt(4);
			// 3. Make a variable and initialize it to a random number.
			//     ** You will need to make a random object!
			//     Limit the random numbers to be between 0 and 3

			// now do you know what to do in order to print just ONE statement
			// based on what random number was generated?  would it help to
			// look back at the program you just finished "validation"?	

			// 4. If the random number is 0

			// -- tell the user "Yes"
			// class is almost over - can i help you clean this up?yes

			if (number == 0) {
				System.out.println("yes");
			}

			else if (number == 1) {
				System.out.println("no");

			}
			else if (number == 2) {
				System.out.println("Maybe you should ask Google?");


			}
			else if (number == 3) {
				System.out.println("I don't know");
			}	
	//	}
	}
}
