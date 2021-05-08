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
package _03_string_conversion._2_strings_cannot_add;

import javax.swing.JOptionPane;

public class StringsCannotAdd {

		// 1) Make a main method that includes all the steps below…. 
		
			// 2) Ask the user to enter number 4 and hold it in the variable fourAsString 
			int num1 = 4;
			// 3) Ask the user to enter number 6 and hold it in the variable sixAsString 
			int num2 = 6;
			// 4) Print the addition of fourAsString and sixAsString using JOptionPane 
			int num3 = num1 + num2;
			// Did you notice 46 instead of 4 + 6 = 10?
			
			// 5) Ask the user to enter number 5 and hold it in the variable fiveAsString 
			String num4 = "5";
			// 6) Print the addition of the variables fourAsString, sixAsString, and fiveAsString 
			int num5 = num1 + num2 + num4;
			//Did you notice 456 instead of 4 + 6 + 5 = 15?
			
			// Insert fourAsString inside the parenthesis of Integer.parseInt() and set the method equal to fourAsInt
			// Hint: int fourAsInt = Integer.parseInt(fourAsString);
			
			// 7) Do the same for sixAsString. 
			int num6 = 6;
			// 8) Print the addition of fourAsInt and sixAsInt using JOptionPane 
			//i'm i bit confused
			// Did you notice the value 10? If so, hurray! You just changed the type of your variable from String to int.
			
			// 9) Convert fiveAsString to fiveAsInt using Integer.parseInt();  
			
			// 10) Print the addition of fourAsInt, sixAsInt, and fiveAsInt using JOptionPane 
			
			// Is your value now 15 instead of 465?
}
