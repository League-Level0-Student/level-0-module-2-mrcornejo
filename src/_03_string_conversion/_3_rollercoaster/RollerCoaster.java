package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {

//questions?
	//yea does it start with public static void main or am i wrong
	// correct.  all programs need one main method
	// 1) Make a main method that includes all the steps below…. 
		
		// 2) Ask the user to enter their height in inches using JOptionPane and set it to the variable heightToRide
	public static void main(String[] args) {
		// Uncomment the line below...
			//if( heightToRide > 42 ) { }
		//JOptionPane.showInputDialog("height in inches");   // can we review JOptionPane?yes
		// no.  inside the parentheses is the question you ask the user  ok, put in double quotes
		// good.  now this method returns the user's answer.  we need to
		// save it in a variable otherwise we lose it.  look at another one of
		// your programs...how does the user's answer get saved?
		String heightToRide = JOptionPane.showInputDialog("height in inches"); // good
		// this completes step 2
// can i tell you something?yes
		// roller coaster program - it already made a java file
		// for you.  the voting program did not.
		// want me to show you how to set that up?yes
		// you read in the user's height as a String.  now convert it here to an int
		
		// no.  	// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  
		// Hint: int heightAsInt = Integer.parse... maybe look at previous example?
		//int fourAsInt = Integer.parseInt(fourAsString);
		
		int heightAsInt = Integer.parseInt(heightToRide);  // good. now how do you fix
		// error on line 33?  need help?yes pls
		// Uncomment the line below...no
		if (heightAsInt > 42) { }	// right now, this line is comparing
				// a String heightToRide to an int 42.  it can't compare
		// "apples to oranges".  so we need to replace the string variable with an 
		// int variable.  can you do that?  want me to show you? good
		
		//String sixAsString = JOptionPane.showInputDialog("enter number 6");
		
		// it comes with oodles of methods!  the ones we've been using are:
		// showMessageDialog - just prints a message
		// showInputDialog - asks user to type some input YEP
		// showConfirmDialog - asks user a yes or no question
		// which one should we use here?...
		
		// Do you see the heightToRide > 42 underlined red? 
		// That is because you are comparing a STRING to an INTEGER.
		
		// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  Hint: int heightAsInt = Integer.parse... 
	
		// now do steps 4-6..okay but can I go to the restroom fast? of course!!be right back
		
		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
	    // "Hurray! You are tall enough to ride the coaster alone!" Hint: use JoptionPane

		// ok, you need to fix 2 ideas.  1) num is not the name of the variable
		// holding the user's height - can you fix?  not quite.  remember that's the
		// string version!  good.  now print is really System.out.print
		if (heightAsInt >= 48) {
			System.out.print("Hurray");// need help?maybe
			
		}
		else {
			if(heightAsInt >= 42) {
				System.out.print("You can ride the coaster with someone else!");
			}
			
			else {
				System.out.print("You must be at least 42 inches tall to ride the roller coaster pal!");
			}
		}
		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!" 
	
		// 6) else print: "You must be at least 42 inches tall to ride the roller coaster pal!"
// ok test it out!..what is that  yay!  questions?no let's save work
	}
} 
