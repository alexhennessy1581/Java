// ****************************************************************************
// File: PGM_CH02
// Date: 02/18/2015
// Author: Alexandra Hennessy
// Purpose: PGM_CH02 class: BaseConvert.java
// Converts base 10 numbers to another base
// (at most 4 digits in the other base). The User inputs
// the new number base and the base 10 number.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (double checked the place0 - place3 from https://web.njit.edu/~dw59/Documents/BaseConversion.java.)
// in the design, construction, and debugging of this source code.
// ****************************************************************************

	import java.util.Scanner;
public class BaseConvert
{
	// -------------------------------------------------------------------------
	// Converts base 10 numbers to another base
	// (at most 4 digits in the other base). The User inputs
	// the new number base and the base 10 number.
	//---------------------------------------------------------------------------
	
	public static void main (String[] args)
	{
		int base; // the new base
		int base10Num; // the number in base 10
		int maxNumber; // the maximum number that will fit
		// in 4 digits in the new base
		int place0; // digit in the 1's (base^0) place
		int base1Num; // the quotient
		int place1; // digit in the base^1 place
		int base2Num; // the quotient
		int place2; // digit in the base^2 place
		int base3Num; // the quotient
		int place3; // digit in the base^3 place
		int base4Num; // the quotient
		// the number in the new base
	String baseBNum = new String ("");
	// prep for User input
	Scanner scan = new Scanner(System.in);
	// inform user about program
	System.out.print ("Base Conversion Program: ");
	System.out.println();
	System.out.println("Convert a number from base 10 to selected base.");
	// prompt for new base value and read input
	System.out.println();
	System.out.print ("Please enter a base (2-9): ");
	base = scan.nextInt();
	// Compute the maximum base 10 number that will fit in 4 digits
	// in the new base and tell the user what range the number they
	// want to convert must be in
	maxNumber = (base - 1) * (base * base * base + base * base + base + 1);
	System.out.println();
	System.out.println("The range of allowable base 10 numbers for conversion to base " + base + " is 0 to " + maxNumber);
	// prompt user for input and read input	
	System.out.println();
	System.out.print ("Please enter a base 10 number to convert: ");
	base10Num = scan.nextInt();
	// Do the conversion (see notes in lab)
	// First compute place0 -- the units place. Remember this comes
	// from the first division so it is the remainder when the
	// base 10 number is divided by the base (HINT %).
	// Then compute the quotient (integer division / will do it!) -
	//	You can either store the result back in base10Num or declare a 
	// new variable for the quotient
	// Now compute place1 -- this is the remainder when the quotient
	// from the preceding step is divided by the base.
	// Then compute the new quotient
	// Repeat the idea from above to compute place2 and the next quotient
	// Repeat again to compute place3
	
	place0 = base10Num % base;
	base1Num = base10Num / base;
	
	place1 = base1Num % base;
	base2Num = base1Num / base;
	
	place2 = base2Num % base;
	base3Num = base2Num / base;
	
	place3 = base3Num % base;
	base4Num = base3Num / base;

	// Print the result (see notes in lab)
	
	baseBNum = "" + place3 + place2 + place1 + place0;
	System.out.println();
	System.out.println(+base10Num +" (base 10) = " + baseBNum + " (base " + base +")");
	}
}