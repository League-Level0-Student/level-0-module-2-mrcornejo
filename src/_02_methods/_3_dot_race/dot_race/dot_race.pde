/*** When you are done, this program will draw an ellipse 
     that travels across the screen when the mouse is pressed.
***/

  /***********  SOUND ***************
   * Some computers are unable to play sounds. 
   * If you cannot play sound on this computer, set canPlaySounds to false.
   * If you are not sure, ask your teacher 
   * *****************/
  boolean canPlaySounds = false;

int x, y; 

// good.  just to review. when you want to use a variable,
// first you need to "declare" it, meaning state what data type it is,
// here both x and y are of type 'init'.
// THEN you need to give the variable a value to store in it, and sometimes
// you may replace the value later with another value
// so right now in your program, on what line of code did you give 'y' its first
// value? yes

void setup() {
    size(800, 200);
    
    //1. Set the variable named x to 50.  
    x=50;  // good now lets have x change only when the mouse is pressed - go to code below
    y=100; 
    // ok now add variable y to line 12 
    // and on line 12 give y a value that's
    // halfway down the screen ?  look at the size on line 15
    
    // ok good start.  It's better to give y the initial value of 100
    // in the 'setup' method rather than on line 12
    
 }


void draw() {

	background(200,200,200);
 
    //2. Draw an ellipse of height and width 50. Make sure to use the x variable for its X position. 
    //   Pick a y value that places it half way down the window.
    ellipse(x,y,50,50);  // the answer to my question is here, yes.  what specifically on this line?
    // good try but no .... let me show you the documentation for ellipse
    // ellipse(x, y, width, height) ... so 50 is the width and the height, x is the x location and y is the y location
    // what values did you give x and y so far?x=50 y=100.  yes.  which of these values could
    // make the dot move to the right?x  good so just for grins change the x value about to some
    // other number and see where the dot is
    
    //3. Make the ellipse a nice color
         fill(#DAACDB);
    //4. If the mouse is pressed change the x value so that the dot moves to the right
         if (mousePressed) { // ok, so if some test condition is true then do an action.
                 // here is the code that is the action... how do you move the dot?  not sure? yea
                 // ok.  what controls the location where the dot shows up?  first lets run the
                 // program and see where the dot is  what made it show up on the left?yes i was thinking about ++ bc it moves to thr right
                 // that's not my question.  so far the dot is motionless and sitting on
                 // the left side of the screen, about halfway down.  what controls its location?
                 // question?well i was thinking that bc x is the one that can make the dot move to the right
                 //and ++ makes it increase then x++ and mouse press would do the work well try it!
                 x++;  // want to speed it up?  your choice ok so x++ is shorthand for:
                 // x = x + 1 .... so what would speed things up?
                  x=x+10; 
         }
    //5. If your dot moves slowly, make it move faster. If it moves too quickly, slow it down
    //  (you have to figure out what part of your code to change)
          // but this happens even when mouse is NOT pressed!  where should you move this code to?
    //6. Use an if statement to play a sound (ding) when your dot crosses the finish line (right side of window).
    //   A playSound() method is provided (you have to uncomment the code at the bottom of this program to get this to work)
    //do you think i could do this or is my conputer not going to work
    // i don't think you'll hear a sound BUT you could at least write code so when the dot
    // gets to the right side it stops moving (doesn't disappear) and maybe you could print "you won!"
   // what info tells you that the dot has reached the right side of the window?when u see it on the right
   // ok but your code doesn't have eyes!  how does the code know the dot is on the right side?when you stop?
   // no.  you could stop pressing the mouse when it gets to the middle, though
   // i'm still looking for the answer .... what controls where the ellipse is? (x,y)  yes. now,
   // what is the value of x all the way to the right of the screen?800  good. so when x gets close to the
   // value 800 it is towards the right side of the screen.  make sense?yes
   // so can you write code such that when the dot gets to the right, it doesn't go any further?
   // not sure?
   if (x>=770) {    // good start, let me show you ok?okay
      x = 770;  // so if the dot gets close to the right, make it get stucck there
      print("You won!");
   }
   // i'm going to check on Jay and tell him to wrap up...okay...actually I also have to go 
   //ok lets save work
}

/*
import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
  
  if (canPlaySounds) {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding.wav");
        sound.trigger();
        soundPlayed = true;
    }
  }
  fill(0);
  textSize(36);
  text("WINNER!!", width/2, height/2);
}
*/
