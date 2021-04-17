/*** When you are done, this program will draw an ice cream cone with 
     scoops of ice cream, sprinkles, and a cherry on top.
***/

void setup(){

     size(500,500);
     
     // Call the makeIceCreamCone() method below to draw the cone for your ice cream
       makeIceCreamCone();
     // Use the addScoop method below to add as many scoops of ice cream as you want
     // Choose a different flavor for each scoop  can I help you?yes
     // ok, let's review the "definition" of a method versus "using" a method.
     // way down below is the "definition" of addScoop() ... lets look at it a moment
     
     // to "use" a method, you say its name, followed by parentheses.  And if
     // the method has any parameters, you pass in values to those parameters.
     // then end the line with a semicolon.
     
     addScoop("chocolate");
     addScoop("Strawberry");
     addScoop("Vanilla");
     
        // why do this?i though it was is they asked for a flavor that was not added
        // so what you are doing here in lines 20-23 is *USING* the addScoop()
        // method.  if you use it with a flavor that the *definition* of addScoop()
        // can't handle, the *definition* prints out the error message...
        
        
    
     // Use the method provided to add some sprinkles to your ice cream
        addSprinkle(35);
     // Write code to add a cherry to the top of your ice cream. Hint: ellipse
        fill(#FA2121);
        ellipse(250,50,30,30);
//done  yeah!  do file-save
}

/***********  These are methods for you to use. DON'T CHANGE CODE BELOW THIS LINE !!!   *****************/

//Icecream recipe
int SCOOPSIZE = 150;
int scoops = 0;
int coneY = 320;


void makeIceCreamCone(){
     //noStroke();
     fill(188,126,49);
     triangle(190,320,310,300,255,500);
}

// here is the complete definition of the method.  the first line is
// called the "method signature".  it has a return type "void" meaning that
// it is not returning a value.  It has a name "addScoop".  It has one
// parameter "flavor" which is of type "String".  any questions so far?...no
// ok.  so then inside the curly braces {}, it has all the code that happends
// when you call ("use") this method.  so now, let's go back up above 
// and review how to properly "use" the method.o
// questions?so addScoop includes the fill  yep.  and it knows how to handle
// 3 ice cream flavors
void addScoop(String flavor){
     noStroke();
     if(flavor.equalsIgnoreCase("chocolate")){
         fill(116,71,16);
     }
     else if(flavor.equalsIgnoreCase("Strawberry")){
         fill( 232 ,144,129);
     }
     else if(flavor.equalsIgnoreCase("Vanilla")){
         fill(245, 243, 227);
     } else{
         println("ERROR: We don't have the flavor "+ flavor); 
         return;
     }
     ellipse(width/2,coneY - 50 - (SCOOPSIZE*scoops)/2,SCOOPSIZE,SCOOPSIZE);
     scoops++;
}


void addSprinkle(int numberOfSprinkles){
    for(int i = 0; i < numberOfSprinkles; i++){
         fill(random(256),random(256),random(256));
         int minX = width/2-SCOOPSIZE/2 + 10;
         int maxX = SCOOPSIZE/3 +width/2 +10;
         int minY = coneY-((SCOOPSIZE)*scoops)/2-40;
         int maxY = coneY;
         int sprinkleAreaX = (int)random(minX, maxX);
         int sprinkleAreaY = (int)random(minY, maxY);
         int sprinkleWidth = (int)random(2,9);
         int sprinkleHeight = (int)random(2,9);
         ellipse(sprinkleAreaX,sprinkleAreaY,sprinkleHeight,sprinkleWidth);
     }
}
