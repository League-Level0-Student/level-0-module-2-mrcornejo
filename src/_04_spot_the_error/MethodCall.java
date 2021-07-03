package _04_spot_the_error;

public class MethodCall {

	// This program is supposed to print the message "Hello World".
	// BUT it's not working. If you don't believe me, try running it.
	// Add ONE line of code to fix this program.
	// nothing printed out!  console window didn't even pop up
	// one moment can i peek at errors listed below?...
	// not important!
	
	public static void main(String[] args) {
		printMessage("I like computer programming", 5);
		// if I pass in 5 to the parameter x, what
		// number will print in printMessage()?
		//15 good try it questions? yes so what does this  3 * x is: and this do to call int x
		// i'm not sure i understand your question, but let me
		// try explaining something...
		
		// in line 13, there is the number 5 which
		// gets passed to the parameter x.
		// then line 34 prints " 3 * x is: " + 3*x
		// which is actually kinda complex.  so let's
		// break it down into pieces: 
		// this is in double quotes " 3 * x is: " which
		// means it literally prints everything inside the
		// quotes as is 
		// the next piece is a plus sign + which is NOT
		// addition, but IS a way of glueing 2 strings 
		// together
		// finally there is 3*x which does multiplication
		// like in algebra y = 3x
		
		// whew that's alot!  does this answer your question tho??
		//yes thats what i was asking but didn't know how
		// great.  learning programming involves understanding
		// a lot of rules!
		//i've seen that a lot ready for the next program? yes
		// want to do the "extras" if there are any or
		// go on to module 3?
		//in extras are they going through the same things or are
		//there new things.  i dunno but i assume more practice
		// with same ideas let me take a peek ..looks
		// like same stuff but more complex programs..i would like
		//to do some but before that may i please go to the restroom?yes
		// let me know when you're back okay..im back ok
		
	} // YEAH!  so what would you change to
	// print "I like computer programming"?
	
	// good.  do you see how printMessage() is
	// like an algebra function?yea
	// 'aMessage' is like a placeholder like 'x'.
	// in programming we give it a fancy name 'parameter'
	// so let's say we add another parameter
	
	static void printMessage(String aMessage, int x) {
		System.out.println(aMessage);
		System.out.println(" 3 * x is: " + 3*x);
	}
}
//is it still sistem out print the method printMessage()
// will do that for you

// can i help you? yes
// two important ideas here.  but first, a question to you
// have you had any algebra yet, like this is a function
// y = 3x ?  what math level are you at?  like what grade? Algebra
// ok great.
// some idea # 1.  printMessage() is called a function or method.
// it only runs here if you call it!
// where do you think you should call it?  what line above?
// no.  another guess? no.  another guess?  want me to tell you?
//yes line 13.  every program starts by running the code
// inside main()

// ok 2nd idea here.  y = 3x is an example of a function.
// x is a placeholder for any number you want.  so let's
// say x is 5, then y is 15, right?
// so if x is 10, then what is y?30 good.
// in programming, the things inside the parentheses of
// a method is like x - a placeholder.
// printMessage(String aMessage) - here aMessage is like x
// ...does that kinda make sense?yes
// so in y = 3x, if x is given the value 5, then y is 15.
// in programming, you give aMessage a value when you *call*
// the method, which I said you should do in line 13.
// do you want to try  yes





