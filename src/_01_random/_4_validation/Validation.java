//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {	// start of main()
		
		Random randomMaker = new Random();

		//ok try out the program so far  good!  now let's add some code
		// so that it gives out 3 random compliments, not just one...
		
		// you need to put your code in a loop.  can I clean this up a bit
		// so you see what I mean?  yes
		// ok now put lines 25 to 44 inside a for loop that repeats 3 times

			//for (int i=0; i<5; i++);	// fix this  ok try the program
		
		// how many random compliments did it give?5
		// what do you change to give just 3 compliments? the 5  good!  questions? no
		
		// what part of this code picks ONE compliment based on the random number?
	
		for(int i = 0; i < 3; i++) {	// ok now where does the } go?
			int	number = randomMaker.nextInt(6);
			System .out.println(number);
			if (number == 0) {
				System.out.println("You are a very nice person.");
			}
			else if (number == 1) {
				System.out.println("Your hair looks good.");
			}
			else if (number == 2) {
				System.out.println("I like your outfit.");
			}
			else if (number == 3) {
				System.out.println("I like your shirt.");
			}
			else if (number== 4) {
				System.out.println("I like your shoes.");
			}
			else if (number == 5) {	
				System.out.println("Your smile is really pretty.");
			}
		}	// end of for

	}	// this } was already in the code - end of main()
}
