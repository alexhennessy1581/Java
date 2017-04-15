// ****************************************************************************
// File: RollDice.java
// Date: 03/06/2015
// Author: Alexandra Hennessy
// Purpose: A simulation that rolls a pair of dice. The
// program will roll a pair of dice and output the result of the roll. It uses random number generation to
// provide pseudo-random values for each die. 
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (no one) in the design, construction, and debugging of this source code.
// ****************************************************************************

// -------------------------------------------------------------------------------------------------------
// RollDice.java
//
// For each die in the pair, the program shall generate a random number between 1 and 6 (inclusive). It
// shall print out the result of the roll for each die and the total roll (the sum of the two dice), all
// appropriately labelled.
// -------------------------------------------------------------------------------------------------------

import java.util.Random;
public class RollDice

{
	public static void main (String[] args)
	{
		//Variables:
		Random generator = new Random();
		int die1; // random whole # between 1 and 6
		int die2; // another random whole # between 1 and 6
	
		die1 = generator.nextInt(6) + 1; // will randomly generate a whole number between 1 and 6
		System.out.println("Value of die 1: " + die1);
	
		die2 = generator.nextInt(6) + 1; // will randomly generate a whole number between 1 and 6
		System.out.println("Value of die 2: " + die2);
	
		System.out.println("The sum of both dice: " + (die1 + die2)); // the total of the values of die1 and die2
	}
	
}