// ****************************************************************************
// Student.java
// Author: Alexandra Hennessy
// Purpose: Define a student class that stores name, score on test 1, and
// score on test 2. Methods prompt for and read in grades,
// compute the average, and return a string containing student's info.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (Austin) in the design, construction, and debugging of this source code.
// *****************************************************************************

	import java.util.Scanner;

public class Student

{
	
	Scanner scan = new Scanner (System.in);
	
	//Declared Variables
	String name;
	double test1, test2;
	

// ---------------------------------------------
// constructor
// ---------------------------------------------

	public Student(String studentName)
	
	{
		
		name = studentName;
	
	}
	
// ------------------------------------------------------------------------------
// inputGrades: prompt for and read in student's grades for test1 and test2.
// Use name in prompts, e.g., "Enters John Doe's score for test 1".
// ------------------------------------------------------------------------------
	public void inputGrades()
	
	{
		System.out.print("Enter " + name + "'s score for test 1: ");
		test1 = scan.nextDouble();
		
		System.out.print("Enter " + name + "'s score for test 2: ");
		test2 = scan.nextDouble();
	}
		
	

// -----------------------------------------------------------
// getAverage: compute and return the student's test average
// -----------------------------------------------------------
	public void getAverage() // header for getAverage
	
	{
	
		System.out.println("The average for "+ name + " is: " + (test1 +test2)/2);
	
	}
	
// -----------------------------------
// getName: print the student's name
// -----------------------------------
	public String toString() // header for printName

	{
	
	return ("Name: " + name + "\t" + "Test 1: " + test1 + "\t" + " Test 2: " + test2);
	
	}

}
