
package _99_extra;

import javax.swing.JOptionPane;

/* NASA wants to shoot a rocket into orbit. 
  * Somebody has to do the countdown or the rocket won't launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0. 
 * 
 * (example for '11': 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
	public static void main(String[] args) throws InterruptedException {
		// 2. Use a pop-up to ask the user where to start counting from
		String CountDown = JOptionPane.showInputDialog("where to start counting");

// when JOptionPane asks the user for input it reads it in as
// a string never as a number.  i know this is confusing but
// if the string is "245" for example, it is really storing a *list*
// of digits 2, 4, and 5.  we can't use that as a number so
		// we need to convert the string to an int.
// heres an example from an earlier program:.  can
		// you use this example to help you convert
		// String CountDown  to int m?  very close!
		// just one problem...any thoughts?no
		// ok.  CountDown is a variable of type String
		// and we only define a variable's type ONCE
		// in a program.so take out the word String below
		int m = Integer.parseInt(CountDown);
		//int fourAsInt = Integer.parseInt(fourAsString);
		
		// good.  now showInputDialog() is a method and it returns
		// a String with the user's answer, so we need to store it
		// in a Strin variable here give he Sring a name any name yes
		// but something descriptive helps!for example
		// like spongeBob is not descritive but countdown is
		// good now one thing is still missing. how do you give
		// variable CountDown a value?  like lets say i have
		// variable int x and i want to give it a value 5:
		
		//so now if we print out countdown it shows the value the user entered
		//lets' try that and then save work
		//System.out.println(CountDown);
// GOOD LET"S CONTINUE HERE NEXT CLASS OK?yes
		

		// 3. Change the countdown to use the new starting point
		// so lets say the user enters 5, then you should brint
		// 5 4 3 2 1 0 blastoff
		// i don't think the speak() method will work here tho
		// so just system.out.println stuff  ok?  need some more
		// help?yes  so the most important thing to realize is
		// that printing 5 4 3 2 1 0 is repetitive meaning print
		// a number then subtract 1 then do it again, etc. what
		// Java code lets you do repetitive things?loop  yep
		// can you set up a for loop that counts down?

		// NO thats already in the program at line 16 okay
		
		// what if you enter a number different than 5?
		// will it listen to you?no  ok lets figure out how to
		// fix that.  let me first explain something
		
				// so we don't need this here anymore
		// because you said 'int m' above ok?
		// try running the program
		// int m;  hmm one more thing needs
		// fixing.  this is a little confusing
		// but you gave 'm' its initial value above
		// and then you gave it a new initial value
		// below.  i'm going to take that one out and
		// we'll try again it worked! questions?no
		// do you want to do another program in
		// this _99_extra section or go on to the
		// next module?
		// i think going on to the next module would be
		// good :)sorry its cuz i wrote something on the notes
		// for you to see but u could'nt
		//here you go.. so Mariene texted me earlier but i didn't see.
ok
		
				for (; m>=0; m--) {	// this looks great!!
					System.out.println(m);
				}
					System.out.println("blastoff");	// this goes INSIDE the loop
				
				
		// 1. Print a countdown from 10 to 0 on the console
	
			// 4. Use the speak method to hear the countdown.
		
			// 6. Use the following code to make the program wait one second for each number: Thread.sleep(1000);
		
		// 5. when the counting is done, speak "blastoff!"
	}

static void speak(String words) {
		
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


