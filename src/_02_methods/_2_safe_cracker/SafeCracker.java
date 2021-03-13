//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _02_methods._2_safe_cracker;

import java.io.File;
import java.util.Random;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class SafeCracker {

	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = true;
	
	
	public static void main(String[] args) {
		new SafeCracker().crackTheSafe();
	}

	void crackTheSafe() {
		/*
		 * Your mission: use the tryCode method to crack the safe by trying all possible
		 * combinations
		 */		
		
		// ok it's time to work on this program
		
		// the guess can be a random number between 0..99 I think ...one moment
		
		// so up here your code should try all the possible random numbers in
		// the range 0 .. 99 until it finds the matching code ("cracks it")
		
		// what code can you use to try something repetitively?loop yep
		
		// do a loop - in side the loop call tryCode() first with 0 then 1
		// then 2 etc until you find the match which is stored in
		// variable wekncrzpasfdkjhcfjse .... can you try writing the code now?
		// i'm checking on mariene now ... i think she's stuck...okay
		Random ran = new Random();
		for (int i=0; i<99; i++) {
			//i don't remember how to make a loop inside another
			//I have to go
			// sorry i was workign with mariene - she's missed som many
			// classes lately!// i hope to help you with this code next week
			// let's save work ok?okay and again sorry the internet is really slow
		}
		

	}

	 void tryCode(int guess) {
		System.out.println("trying " + guess);

		int secretCode = 9999999 - wekncrzpasfdkjhcfjse;

		if (guess == secretCode) {
			JOptionPane.showMessageDialog(null, "Congratulations! You cracked the safe with " + guess);
			playTheSoundOfSuccess();
			System.exit(0);
		}
	}
// hi miranda i was helping mariene set up her work
	 // can i answer any questions now?
	 // let me look around a bit to remind myself...one moment
	private void playTheSoundOfSuccess() {
		
		String path = "src/_02_methods/_2_safe_cracker/";
		if (canPlaySounds) {	
			File sound = new File(path+"me-gusta.wav");
			if (sound.exists()) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}
			}
		}
	}

	final int wekncrzpasfdkjhcfjse = new Random().nextInt(100);
			// see this code? it gives a number between 0 to 99
}
