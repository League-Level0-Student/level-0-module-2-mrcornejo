/*** When you are done, this program will draw a mole in 
     each of the holes.
***/

void setup() {
     size(400, 400);
     background(78, 166, 51); // green grass
     
     // This code draws the holes. Run the program to see them.
     
     fill(0, 0, 0);
     ellipse(200, 200, 100, 30);
     ellipse(70, 119, 100, 30);
     ellipse(300, 60, 100, 30);
     ellipse(297, 350, 100, 30);  // here you are *using* method "ellipse"
                           // and it needed 4 arguments ...x, y, width, height
}

void draw() {  

/* Write code here that uses the drawMole method to put a mole in each of the holes */
     // ok so up here we will *use* the drawMole method.  To *use* a method,
     // you say the name of the method, followed by parentheses, and then any
     // needed arguments inside the parentheses.  so let me show you another
     // place where you used a method...
     // so now go ahead and *use* method drawMole once here:
     drawMole(70,110); // when you *use* a method, there are no curly braces
     drawMole(300,50);
     drawMole(201,190);
     drawMole(298,340);
        //done  good!  just want to review a bit about methods...
        // so a method is a way of packaging a bunch of lines of code
        // Processing comes with a number of built-in methods such as ellipse
        
        // a programmer can define new methods.  so below is the defnition
        // of a new method called drawMole
        
        // whenevery you use drawMole - which you did 4 times above, it
        // runs the lines of code inside that method.. does that make sense?yes
        
        // did this help you understand a bit more about methods?...yes at first i though
        //thatit i would have put in one code and it would dring down the lines of code
        //to make the moles in the holes  i see. ready to do next program?yes
}

// ok so below is the "definition" of a method called "drawMole".  it does all
// the work of drawing the mole for you.  to use a method, you need to pass
// in arguments to the parameters.  here the paramenters are moleX and moleY.
// what do you think those parameters do here?...tell to use the method
// ok, but more specifically I figure that they are controlling *where* to
// draw the mole on the screen - make sense?yes
void drawMole(int moleX, int moleY) {
     noStroke();
     fill(125, 93, 43);
     ellipse(moleX, moleY, 60, 60); // face
     fill(255, 237, 209);
     ellipse(moleX, moleY+10, 33, 28); 
     fill(0, 0, 0);
     ellipse(moleX-10, moleY-15, 10, 10); // eyes
     ellipse(moleX+10, moleY-15, 10, 10);
     ellipse(moleX, moleY-5, 10, 10); // nose
     ellipse(moleX, moleY+10, 20, 5); // mouth
}
