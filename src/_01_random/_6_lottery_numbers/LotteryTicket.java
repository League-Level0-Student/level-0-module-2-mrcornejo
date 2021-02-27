package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		String allSixNumbers = "";	// this is an empty string
		for (int i=0; i<6; i++) {
			int number = ran.nextInt(100); //0 to 6 ...like that
		// close! that's 0..98 good try the program
	// great!  now some of the numbers might be 1-digit
	// like the '2' below.  are you ok with that?yes
		// change this to: the range of 2-digit numbers: 00 .. 99
			System.out.println(number);
			
			allSixNumbers = allSixNumbers + " " + number;
				// this "glues" the latest number you
				// generated to the string
		}	// end of 'for'
		System.out.println(allSixNumbers); // see if it worked
		
		JOptionPane.showMessageDialog(null, allSixNumbers);
			// are we asking for input or printing output?i don't remember how to print
	}	// end of 'main'
}  // end of 'LotteryTicket' class

// now we print the lottery ticket.  the pop up
// box is a JOptionPane.  want to try figuring out that code?okay
//do i start here no.  the code is all in the main() method,
// and down here is not in main!  let me label some things

// the next step is to save up all 6 numbers so you can
// "print the lotter ticket" at the end, ok?

// you can either make 6 number variables or you can
// "glue" them together in a string.  I think the
// "gluing" is easier.  can I show you?yes
// questions?no but i would like to write it down


