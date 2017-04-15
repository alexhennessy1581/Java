// ************************************************************
// ComputingFactorials.java
// Author: Alexandra Hennessy
// Purpose: Write a program that asks the user for a non-negative integer 
// and computes and prints the factorial of that integer. 
// You will need a while loop to perform the factorial calculation.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (Austin) in the design, construction, and debugging of this source code.
//***********************************************************

import java.util.Scanner;

public class ComputingFactorials 

{

	//------------------------------------------------------
	// Computes The factorial of any number n (written n!) 
	// is the product of the integers between 1 and n.
	//------------------------------------------------------

	public static void main (String [] args)
	{
		//Variables
		long number;
		long numFact;
		long factor = 1; // makes it so when a user inputs 0 the answer will be 1.

		Scanner scan = new Scanner(System.in); //setting up for user inputs to be saved

		System.out.println("Computing Factorials");

		System.out.println(""); //space between lines for readability

		System.out.println("Enter a non-negative number: ");
		number = scan.nextLong(); // user enters a number

		while (number < 0) // setting up a while statement for a consistent loop for a negative entered integer for int number
		{

			System.out.println(number + " is a negative number. It is an invalid input!"); // error statement
			System.out.println(""); //space between lines for readability
			System.out.println("Enter a non-negative number:  ");// reenter a correct number statement
			number = scan.nextLong();

		}

		numFact = number; // the int numFact will equal the previously entered number for int number that is positive

		while (numFact > 0)// setting up a while statement for a consistent loop
		{

			factor = factor * numFact; // formula
			numFact--; // formula

		}

		System.out.println("The factorial of " + number + " is " + factor); // end statement
		scan.close(); // closed scanner class

	}

}
