/*** When you are done, this program will draw an ellipse 
     that jumps to new location each time you click on it.
***/
 
 
 // 1. Create three integer variables to represent the x, y, and the size of the ellipse
 
 // good start ... some improvements needed ... first, i don't see
 // code for step 1 - create some variables that will be used by your code below
 // questions?what do u mean by variables  great question! 
 // a variable is something that has a name and holds a value of a certain data type
 // lets start with x
 int x = 20;  // name is x; data type is int, current value is 0
 int y = 37;
 int s = 30;  //
 //would i put int w and int h  you could but i think we're drawing circles which
 // hav the same w and h values so that's why the instructions just said 'size'
       
    void setup() {
      // now, lets use those variables here...  no, use the variable names
      ellipse(x,y,s,s);
      // 2. Set the size of your sketch
      size(300,300);
    }
    
    void draw() {
    
      // 3. Set the background color of your sketch
      background(#FCD4F4);
      // 4. Draw an ellipse using the variables created at the top of the sketch for the location and size of your ellipse. 
      //    Make sure it fits in the window. Change the variables if it does not.
    ellipse(x,y,s,s);    // good ... i hope the wording of step 4 makes more sense to you now...
    
    }
    
    /******** This method gets called automatically when you press the mouse ************/
    void mousePressed() {
      //5. Create an integer variable called distance  .. can you try this now?
      int distance;
      // you have some options here: don't give it a value yet
      // or give it a temporary value and the code below is
      // going to change it  good  now step 6
      
      // ok.... but perhaps you should do steps 1 thru 4 first?i already did ooh
      
      //6. The getDistanceFromMouse() method below returns a number.
      //   Set the value of your distance variable to the value returned by the getDistance method
      //   You will need to pass the x and y location of your ellipse to this method.
      // like in the ice cream program ... you need to *use* the method here:
        distance = getDistanceFromMouse(x,y);  // good start... we'll leave it like this for a moment...
              // NOW unlike addScoop() method, this method returns an 'int' value and we want to
              // use it.  let me show you.  questions?no, do we finish next class it's 30
              // yeah it's just that we're in the middle of an idea I want you to understand :)
              // ok one thing to fix.  this program when finished will keep changing the location
              // of the ellipse using the variables you made up top: x and y
              // we need to use them here ..  otherwise the circle will be stuck at the same location
              // questions before we save your work?so u are saing that it would have stayed as  20 and 37
              // yesokay no questions
          
      //7.  Use an if statement to check if your distance variable is < the radius of the ellipse
      //    If it is, make a new x AND y for the ellipse, for a new random location on the window
      //    Hint: Use code like this      x = (int) random(width);
       
      
    }
    
    /********  This method gives you the number of pixels between the mouse and the x,y point ***********/
    int getDistanceFromMouse(int x, int y) {
      return (int)Math.sqrt(Math.pow((mouseX-x),2) + Math.pow((mouseY-y),2));
    }
