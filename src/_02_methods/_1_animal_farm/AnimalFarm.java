//    Copyright (c) The League of Amazing Programmers 2013-2020
//    Level 0
// this looks done

package _02_methods._1_animal_farm;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AnimalFarm {
	
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = false;

	
	public static void main(String[] args) {
		new AnimalFarm().animals();
	}
	
	void animals() {

		/* 1. Ask the user which animal they want, then see and hear 
		 *    the animal they chose using one of the methods below.
		*/			 
			
		/* 2. Make it so that the user can keep entering new animals. */
		// do you want to add this code to keep allowing the user
		// to enter new animals? okay
		
		// you can add a loop that keeps repeating forever
		
		while(true) {
			// put all your other code below in here
		// don't forget the code to ask the user for the animal
		String Animal = JOptionPane.showInputDialog("What animal would you want to..");	
		System.out.println(Animal);
		if (Animal.equals("cow")) { 
			moo(); 
		} else if (Animal.equals("duck")) {
			quack();
		} else if (Animal.equals("dog")) {
			woof();
		} else if (Animal.equals("cat")) {
			meow();
		} else if (Animal.equals("llama")) {
			llamaScream();
		}
		 }	
		
		// can I make some suggestions?okay
		
		// start with JOptionPane input dialog - ask for an animal
		// like: "what animal do you want?" DONE
		
	
		
		// once you get that working ok you can add a loop to
		// let user keep entering new animals ... and maybe if
		// they enter an animal not in the list, your program
		// could stop the loop??  let eclipse help you!
		// after you enter the period '.' and you find the method
		// you want in the list, click on it.  try that now sorry you try it
//		String Animal = JOptionPane.showInputDialog("What animal would you want to..");	//do i get rid of this
		
		// let's test this by doing a syso of Animal question? i don't know what syso is
		// it's an Eclipse abbreviation for System.out.println...can we finish next week 
//		System.out.println(Animal);
		
		// if (the animal the user entered is "cow") then call method moo() below
		// else if (...duck) then call quack() ...etc	
		
		if (Animal.equals("cow")) { 
			moo(); // here we are calling a method from below
		} else if (Animal.equals("duck")) {
			quack();
		} else if (Animal.equals("dog")) {
			woof();
		} else if (Animal.equals("cat")) {
			meow();
		} else if (Animal.equals("llama")) {
			llamaScream();
		}
		
		// there!
		
		// YEEAH!!
		
		
		//would I just put ..if ("cow"), will it understand 
		// good question - the short answer is no.
		// I'd like to review the 'if' here:
		// inside the parentheses of an 'if' is a test condition that must be
				// true or false.  for example if you test a number like
				// did you get 100 on a test it looks like this:
				// if (test == 100)  where 'test' is an 'int'
				// on the other hand if you are testing a string which is
				// a more complex type of data you need an equals method, not the == sign
				// for example if (name.equals("Miranda")
				
				// so in this program, what is the name of the string variable where
				// the user's answer is stored - in other words which animal they chose?
		
		// look at line 52 for the answer to my question...Animal
		// correct ... so that is what needs to be tested inside the if (...)
		
		
		// also == only works for simple variables of type 'int' or 'double'
		// but here we have Animal which is of type String.  look at my notes
		// above that shows how to test a String
		
				
				
		// yes ... just one fix - the question needs to be in quotes
		// no you are giving a
		// message to the user asking them what animal they want
		// and your code will read in their answer... now you
		// need to save the anwer in a variable.  what data type
		// should it be?  like 'int', 'double', 'String' ...right
		// do you know how to add code to line 46 so the answer is
		// saved in a String? close!  you need to give the String variable
		// a name in line 46 yes but what name.  your choice, it can it be animal yes
	}

	void moo() {
		playNoise(mooFile);
		showImage(cowIcon);
	}

	void quack() {
		playNoise(quackFile);
		showImage(duckIcon);
	}

	void woof() {
		playNoise(woofFile);
		showImage(dogIcon);
	}
	
	void meow() {
		playNoise(meowFile);
		showImage(catIcon);
	}
	
	void llamaScream() {
		playNoise(llamaFile);
		showImage(llamaIcon);
	}
	


	

	/* Ignore this stuff */
	String path = "src/_02_methods/_1_animal_farm/";
	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";
	ImageIcon llamaIcon;
	ImageIcon catIcon;
	ImageIcon dogIcon;
	ImageIcon duckIcon;
	ImageIcon cowIcon;
	
	private void showImage (ImageIcon icon) {
			JOptionPane.showMessageDialog(null, "", "You chose", 0, icon);
	}
	
	private void playNoise(String soundFile) {
		if (canPlaySounds) {	
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		}
	}
	public AnimalFarm() {
		try {
			llamaIcon = new ImageIcon(path+"llama.jpg");
			cowIcon = new ImageIcon(path+"cow.jpg");
			dogIcon = new ImageIcon(path+"dog.jpg");
			catIcon = new ImageIcon(path+"cat.jpg");
			duckIcon = new ImageIcon(path+"duck.jpg");

		} catch (Exception e) {
					
		}
	}
}