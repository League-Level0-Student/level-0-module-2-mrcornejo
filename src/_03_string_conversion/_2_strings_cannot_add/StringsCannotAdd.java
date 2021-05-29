// notes:  is this what you wanted?


// hi miranda.  i thin 03_string_conversion-1_intro is just a
// lesson for you to read, but no code for you to write
// questions?  you there? sorry i was told to do something but i'm back... okay i just finished reading...
//so i'm done with module 2?
// sorry i'm also helping marienne.  no you are not done.  this below is a program assignment

// maybe i can explain what you are supposed to learn here?okay

// the program stores info in variables.  you need to say what "data type" a variable is.
//  we've worked with 'int', 'double' and 'String' data types.
//  it turns out that you can store a number like an integer as an 'int' or as a 'String'.
// the program works with 'int' and 'String' differently, for example when you do addition.
// for example, lets add 4 and 5...

// int num1 = 4;
// int num2 = 5;
// int num3 = num1 + num2;	... num3 will be 9, as we expected
// but ..
// String num1 = "4";	... I need to put double quotes around a string
// String num2 = "5";
// String num3 = num1 + num2; .... this does NOT do math addition, instead it "glues"
//                           the strings together ..what do you think String num3
//                          will be?....3 or don't it not count but instead put them together
//like this  12  the answer is "45", meaning that it "glues" together "4" and "5"
// questions?ooooo okay  so now try doing the program below.  i'm going to check on marienne okay

// hi miranda class is over. can you save your work?  next class i hope i can 

// need help saving work?

package _03_string_conversion._2_strings_cannot_add;

import javax.swing.JOptionPane;

public class StringsCannotAdd {

		// 1) Make a main method that includes all the steps below…. 
	public static void main(String[] args) {
// you worked on some of this already
	// but it's missing code to "ask the user to enter..."
	// that means using JOptionPane  want help?yes please
	
	
			String fourAsString = JOptionPane.showInputDialog("enter number 4");
			// 2) Ask the user to enter number 4 and hold it in the variable fourAsString 
			String sixAsString = JOptionPane.showInputDialog("enter number 6");
			// 3) Ask the user to enter number 6 and hold it in the variable sixAsString 
			// can you do 3)?  it's like line 43..
		
			
			// 4) Print the addition of fourAsString and sixAsString using JOptionPane 
		// easier to use System.out.println()
			System.out.println("glueing strings 4 and 6:");
			System.out.println(fourAsString + sixAsString);
// it "GLUED" strings 4 and 6 together	.  yes
			
			// Did you notice 46 instead of 4 + 6 = 10?
			
			int fourAsInt = Integer.parseInt(fourAsString);
			int sixAsInt = Integer.parseInt(sixAsString);
			System.out.println("adding int values 4 and 6:");
			System.out.println(fourAsInt + sixAsInt);			
//okay so the first to are lets say the names and the third is calling them to add together? 
			// one moment
			// got it?can I copy
			
			// steps 5 and 6 will show the same idea
			// 5) Ask the user to enter number 5 and hold it in the variable fiveAsString 
			String num4 = "5";
			// 6) Print the addition of the variables fourAsString, sixAsString, and fiveAsString 
		
			// I think you're done with this.  The purpose is to understand that
			// 1) JOptionPane reads everything in as type 'String'
			// 2) You can't add "Strings" ... they just glue together
			// 3) if you want to add, you need to convert to 'int' and then add
			// Questions??  ready for next program?yes
			
		
			//Did you notice 456 instead of 4 + 6 + 5 = 15?

			// these steps below show that if you really WANT
			// addition, you need to convert the Strings that
			// JOptionPane gave you into int values using Integer.parseInt() 
			// want to try that?
			// I need to help another student

			// checking in ... questions? no 
			//am I finished?  up to you.. officially I would try
			// the steps below to show how you can add 2 int values
			// instead of gluing them as strings.  what do you think?okay
			//But which ones do I add?
			
			// let's work on the strings you already have above:
			// fourAsString and sixAsString
			
			//int fiveAsString = Integer.parseInt(fiveAsString);
			
			// Insert fourAsString inside the parenthesis of Integer.parseInt() and set the method equal to fourAsInt
			// Hint: int fourAsInt = Integer.parseInt(fourAsString);
			
			// can i show you?  class is over soon...
			
			// 7) Do the same for sixAsString. 
			int num6 = 6;
			// 8) Print the addition of fourAsInt and sixAsInt using JOptionPane 
			//i'm i bit confused
			// Did you notice the value 10? If so, hurray! You just changed the type of your variable from String to int.
			
			// 9) Convert fiveAsString to fiveAsInt using Integer.parseInt();  
			
			// 10) Print the addition of fourAsInt, sixAsInt, and fiveAsInt using JOptionPane 
			
			// Is your value now 15 instead of 465?
	}
}
