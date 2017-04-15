// ****************************************************************************
// File: PgmCh04_EC_Panel.java
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
import java.awt.event.*;
import javax.swing.*;

public class PgmCh04_EC_Panel extends JPanel

{ 

	private JButton rPn;
	private JLabel Line1, Line2, Line3;
	private JTextField genNum;


	// ------------------------------------------------
	// Constructor: Sets up the GUI.
	// ------------------------------------------------

	public PgmCh04_EC_Panel()

	{

		Line1 = new JLabel("Generate");
		Line2 = new JLabel("Random Phone Numbers");
		Line3 = new JLabel("Alexandra Hennessy");
		genNum = new JTextField("XXX - XXX - XXXX");
		rPn = new JButton("New Phone Number");
		rPn.addActionListener(new PhoneButtonListener());
		add(Line1);
		add(Line2);
		add(Line3);
		add(genNum);
		add(rPn);
		setPreferredSize(new Dimension(192,160));
		setBackground(Color.yellow);


	}

			// **************************************************
			// Represents a listener for button push (action) events
			// **************************************************

		private class PhoneButtonListener implements ActionListener
		
		{

			//---------------------------------------------
			// Updates the counter and label when New Phone Number
			// button is pushed
			//---------------------------------------------

			public void actionPerformed(ActionEvent event)
			
			{
	
				Random rand = new Random();
		        int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8); // numbers can't include an 8, 9, and 0
		       		// 1st random number =  makes the first number be between 1 - 7 and in the hundredth place in the sequence
		       		// 2nd random number = makes the number 0 - 7 and in the tenth place in the sequence
		        	// 3rd random number = makes the number 0 - 7 and in the last place in the sequence
		        int num2 = rand.nextInt(556) + 100; // number has to be greater than 0 and less than OR equal to 655
		        int num3 = rand.nextInt(9000) + 1000; // makes the numbers 0 - 9999
		        String phoneNumber = (num1) + " - " + (num2) + " - " + (num3); // to create a string that has all the integers in it so a phone number is created
				genNum.setText(phoneNumber);
				
			}
	
		}
	
}