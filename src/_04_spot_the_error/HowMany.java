package _04_spot_the_error;

import java.util.Random;

public class HowMany {
	
	// This program is supposed to print a random number between 1 and 100.
	// BUT it's not working. If you don't believe me, try running it.
	// Change one line of code to fix this program.  questions?im just thinking
	//about the 0 because it should go from 1...100 not from 0...100  in other words
	//it should go from 1...101 right? almost.  let's reivew.
	// the goal is between 1 and 100.  how many numbers is that?100
	// right.  so we start with nextInt(100).  now we need to do a shift
	// because we don't want 0 ... 99, we want 1..100 .  so that means
	// adding what value? 1.  right.  now it turns out that code
	// is in line 25 and it's correct!  so there must be a different
	// problem here. let's try an experiment...
	
	
	// every program starts by executing main().  inside main(),
	// it runs thru the lines of code.  let see what's inside of this
	// main()...
	public static void main(String[] args) {
		int number = getRandomNumber();		// here is a good spot
		// this will call the method below, do the code inside there and
		// then the returned value gets stored inside the variable 'number'
		// try running the code
		
		// we want to call it *before* printing number
		System.out.println(number);
		// all that's in here are 2 lines of code.  the first line
		// makes a variable called 'number' and stores a 0 in it.
		// the second line prints the value of 'number"  which is zero.
		// so ... does the code below ever get called?no
		// THAT's the problem!  so we need to call getRandomNumber()
		// *and* save the number it generated.
		// but first i think i need to fix an error ok.
		// so how do we call the method? if statement no
		// maybe we can look at one of your methods programs for a hint?
		// want to try?  or want me to show you?
		// sorry.  i'm going to heelp mariene a bit.  i'll be back okay 
		// i'm here.  want me to show you how to call the method? yes
		
		// it works.  questions?
	}
	
	public static int getRandomNumber() {
//		static void showMessage()
		System.out.println("the code got here");  // this didn't get printed
		// why not? because of random no.  other ideas?number? 
		// i don't understand.  let me review another concept
		Random random = new Random();
		int number = random.nextInt(100)+1;
		// this code properly generated a number in range 1...100
		return number;	// this code returned that number up to line 24
	}
	//sorry but i might need to leave in around 5 minutes becuse i have a doc 
}
// class is about over anyway.  lets save work
