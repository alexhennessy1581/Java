// ****************************************************************************
// File: WrapInt.java
// Date: 03/13/2015
// Author: Alexandra Hennessy
// Purpose: uses the constants and methods of the Integer class to perform the
// following tasks; be sure to clearly label and identify your output, and to test your code for each task
// before proceeding.   
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (my Instructor, and Damon) in the design, construction, and debugging of this source code.
// ****************************************************************************

// ------------------------------------------------------------------------------------------------------
// WrapInt.java
//
// Refer to Figure 3.9 for a short list of the methods available for the Integer class; a full
// listing of the class methods (Java SE8) is available at http://docs.oracle.com/javase/8/docs/api/.  
// ------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class WrapInt
{

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		//Variables
		int in1; // first integer entered
		String bin; // the name for the binary wrapper string
		String oct; // the name for the octal wrapper string
		String hex; // the name for the hexadecimal wrapper string
		String myOther; // second integer entered
		String myLast; // third integer entered
		
	//Prompt user for an integer
	System.out.print("Enter an integer: ");
	in1 = scan.nextInt(); // enter integer
	Integer myNum = new Integer(in1); // the wrapper main equals integer in1
	
	System.out.println(); // Space between lines
	
	//Compute the binary, octal, and hexadecimal of integer
	bin = Integer.toBinaryString(myNum); // to calculate the binary number of the integer myNum
	oct = Integer.toOctalString(myNum); // to calculate the octal number of the integer myNum
	hex = Integer.toHexString(myNum); // to calculate the hexadecimal number of the integer myNum
	
	System.out.println("The binary representation of " + myNum +" is " + bin + ".");
	System.out.println("The octal representation of " + myNum + " is " + oct + ".");
	System.out.println("The hexadecimal representation of " + myNum + " is " + hex +".");
	
	System.out.println(); // Space between lines
	
	//The maximum and minimum java int from the integer
	System.out.println("The maximum Java int is " + Integer.MAX_VALUE);
	System.out.println("The minimum Java int is " + Integer.MIN_VALUE);
	
	System.out.println(); // Space between lines
	
	// Prompt user for two integers
	System.out.print("Enter two integers: ");
	myOther = scan.next(); // enter integer
	myLast = scan.next(); // enter integer
	
	// Sum of the two integers
	System.out.println("The sum of " + myOther +" and " + myLast + " is " + (Integer.parseInt(myOther) + Integer.parseInt(myLast)) + "."); // takes the Strings myOther and myLast, and adds them together to get the sum.
	}

}