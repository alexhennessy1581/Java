// ****************************************************************************
// File: PGM_CH03_EC.java
// Date: 03/13/2015
// Author: Alexandra Hennessy
// Purpose: Create a GUI that displays first name, last name, and a randomly generated phone #  
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (Austin) in the design, construction, and debugging of this source code.
// ****************************************************************************

import java.util.Random;
import java.awt.*;
import javax.swing.*;

public class PGM_CH03_EC
{
//--------------------------------------------------------------------
// Displays first name, last name, and a randomly generated phone #
//--------------------------------------------------------------------

	public static void main(String[] args)
	{
		
		//Variables         
        Random rand = new Random();
        int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8); // numbers can't include an 8, 9, and 0
       		// 1st random number =  makes the first number be between 1 - 7 and in the hundredth place in the sequence
       		// 2nd random number = makes the number 0 - 7 and in the tenth place in the sequence
        	// 3rd random number = makes the number 0 - 7 and in the last place in the sequence
        int num2 = rand.nextInt(556) + 100; // number has to be greater than 0 and less than OR equal to 655
        int num3 = rand.nextInt(10000); // makes the numbers 0 - 9999


        String phoneNumber = (num1) + " - " + (num2) + " - " + (num3); // to create a string that has all the integers in it so a phone number is created
		
	JFrame frame = new JFrame("FirstLastPhone"); // name of the frame

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // will close when user hits the x button in top right hand corner

	JPanel primary = new JPanel(); // declaring a frame
	primary.setBackground(Color.yellow); // background will be yellow
	primary.setPreferredSize(new Dimension(150, 75)); // size of the frame

	JLabel label1 = new JLabel ("Alexandra Hennessy"); // display name
	JLabel label2 = new JLabel (phoneNumber); // display randomly generated phone #

	primary.add (label1); // adds label1 to the pane
	primary.add (label2); // adds label2 to the pane

	frame.getContentPane().add(primary); // the content pane of the frame is obtained
	frame.pack();
	frame.setVisible(true); // allows in to be visible on screen
	}

}