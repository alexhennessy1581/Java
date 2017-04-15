// ****************************************************************************
// File: PGM_CH02
// Date: 02/18/2015
// Author: Alexandra Hennessy
// Purpose: PGM_CH02 class: PlusTest.java
// Demonstrate the different behaviors of the + operator
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (no one)
// in the design, construction, and debugging of this source code.
// ****************************************************************************

public class PlusTest
{
	// -------------------------------------------------------------------------
	// main prints some expressions using the + operator.
	//--------------------------------------------------------------------------
	
	public static void main (String[] args)
	{
	System.out.println ("10 robins plus 13 canaries is 23 birds.");
	System.out.println ("This is a long string that is the "
							+ "concatenation of two shorter strings.");
	System.out.println ("The first computer was invented about "
							+ 55 + " years ago.");
	System.out.println ("8 plus 5 is " + 8 + 5);
	System.out.println ("8 plus 5 is " + (8 + 5)) ;
	System.out.println (8 + 5 + " equals 8 plus 5.");
	}
/*
 * For line 24 it prints out "8 plus 5 is 85", because without the ( ) it just puts the two numbers together creating 85.
 * For line 25 it prints out "8 plus 5 is 13", because with the ( ) the program knows to add the two numbers 
 * instead of putting them together, creating 13 instead of 85.
 * For line 26 it prints out "13 equals 8 plus 5.", because the program searches for the last time "8+5" was used which was
 * (8 + 5) which equaled 13. 
*/
}