// **************************************************************************
// NamesTest.java
// Author: Alexandra Hennessy
// Purpose: Demonstrates how to input some data, store it in an object, 
// and manipulate it in various ways.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (no one) in the design, construction, and debugging of this source code.
// **************************************************************************

	import java.util.Scanner;
	
public class NamesTest

{

// ------------------------------------------------------------------------------------------
// prompts for and receives two full names from the
// user (be sure to get the first, middle, and last names for each full name), 
// creates a FullName object for each full name, and uses the methods of the FullName class
// ------------------------------------------------------------------------------------------

	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	
	String studentFirstone, studentMiddleone, studentLastone;
	String studentFirsttwo, studentMiddletwo, studentLasttwo;
					
		System.out.println("Full Name Program"); //Program Title
		
		System.out.println(); // space between lines.
		
		System.out.println("Full name of first person..."); // Indicates the user to enter information for the first full name
		
		System.out.print("Enter the first name: "); // enter the first name
		studentFirstone = scan.nextLine();
		
		System.out.print("Enter the middle name: "); // enter middle name
		studentMiddleone = scan.nextLine();
		
		System.out.print("Enter the last name: "); //enter last name
		studentLastone = scan.nextLine();
		
		System.out.println(); // space between lines.
		
		System.out.println("Full name of second person..."); // Indicates the user to enter information for the second full name
		
		System.out.print("Enter the first name: "); // enter the first name
		studentFirsttwo = scan.nextLine();
		
		System.out.print("Enter the middle name: "); // enter middle name
		studentMiddletwo = scan.nextLine();
		
		System.out.print("Enter the last name: ");// enter last name
		studentLasttwo = scan.nextLine();
		
		System.out.println(); // space between lines.
		
		// declare new names
		FullName stud1 = new FullName(studentFirstone, studentMiddleone, studentLastone);
		FullName stud2 = new FullName(studentFirsttwo, studentMiddletwo, studentLasttwo);
		
		System.out.println("Information about the first person:"); // Title that lets the user know that it will return information base on the first full name entered
		System.out.println("Full Name: " + stud1.firstMiddleLast()); // prints out first middle and last name
		System.out.println("Last name first: " + stud1.lastFirstMiddle()); // prints out last, first and middle name
		System.out.println("Initials: " + stud1.initials()); // prints out the first full name's initials in caps
		System.out.println("Name length: " + stud1.length()); // prints out the length of the first full name without counting the spaces.
		
		System.out.println(); // space between lines.
		
		System.out.println("Information about the second person:"); // Title that lets the user know that it will return information base on the second full name entered
		System.out.println("Full Name: " + stud2.firstMiddleLast()); // prints out first middle and last name
		System.out.println("Last name first: " + stud2.lastFirstMiddle()); // prints out last, first and middle name
		System.out.println("Initials: " + stud2.initials()); // prints out the second full name's initials in caps
		System.out.println("Name length: " + stud2.length()); // prints out the length of the second full name without counting the spaces.
		
		System.out.println(); // space between lines.
		
		if (stud1.equals(stud2))
			System.out.println("The names are the same!"); // states if the two name are equal.
		else
			System.out.println("The names are not the same."); // states if the two name are not equal.
	}

}