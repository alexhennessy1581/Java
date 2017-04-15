// ****************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: TestCow
// Date: 10/23/2015
// Purpose: PGM_CH10-RunSearchSort: A menu-driven program to exercise the StringList class.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler
// in the design, construction, and debugging of this source code.
// ****************************************************************************

//*****************************************************************************
// RunSearchSort.java
//
// A menu-driven program to exercise the StringList class.
//*****************************************************************************

import java.util.Scanner;

public class RunSearchSort
{
	static String Choice;
	// Create a static list
	static StringList list = new StringList(10);
	// Create a static scanner
	static Scanner scan = new Scanner(System.in);

 

	//-------------------------------------------------------------------------
	// Print the menu and then perform the selected operation.
	// Loop until User quits.
	//-------------------------------------------------------------------------
	public static void main(String[] args)
	{
		// fill the array
		System.out.println("You must first populate the list of strings.");
		list.fillStringList();
		System.out.println(""); //creates a blank line for readability.

		// Display menu and get User input
		showMenu();
		int selection = scan.nextInt();
		scan.nextLine();

		// Loop to perform menu operation or exit
		while (selection != 0)
		{
			runOp(selection);
			showMenu();
			selection = scan.nextInt();
			scan.nextLine();
		}

		System.out.println("\nExiting Poylmorphic Search and Sort\n");
	}


	//-------------------------------------------------------------------------
	// Menu
	//-------------------------------------------------------------------------


	public static void showMenu()
	{
		// Display menu and prompt for User selection

		System.out.println("Polymorphic Search and Sort");
		System.out.println("---------------------------");
		System.out.println("0. Exit Program");
		System.out.println("1. Fill the List");
		System.out.println("2. Display the List");
		System.out.println("3. Sort the List from A to Z");
		System.out.println("4. Sort the List from Z to A");
		System.out.println("5. Sequential Search - Find the First Matching String in the List");
		System.out.println("6. Binary Search - Find the First Matching String in the List");
		System.out.println("7. Swap the First Matching String in the List");
		System.out.println("8. Swap all Matching Strings in the List");
		System.out.println(""); //creates a blank line for readability.
		System.out.print("\tEnter Your Selection: ");
		
	}

	//-------------------------------------------------------------------------
	// Perform selected menu operation
	//-------------------------------------------------------------------------
	public static void runOp(int selection)
	{
		//Declared Variables
		String targetString;
		String newString;
		int indexLocation;
		
		System.out.println();

		// Use switch to perform User-selected operation

		switch(selection)
		{
		case 0: //to exit the program
			System.out.println("Exiting Program!");
			
			break;
			
		default:
			System.out.println("Invalid Menu Selection");

		case 1: // create a new list to fill
			list.fillStringList();
			
			System.out.println(""); //creates a blank line for readability.
			System.out.println("Hit “Enter” to continue...");
			Choice = scan.nextLine();
			
			break;

		case 2: //to display the list
			System.out.println("Display the List");
			System.out.println(""); //creates a blank line for readability.
			
			list.showStringList();

			System.out.println(""); //creates a blank line for readability.
			System.out.println("Hit “Enter” to continue...");
			Choice = scan.nextLine();
			
			break;

		case 3: //to sort in ascending order
			System.out.println("Sort the List from A to Z (Ascending)");
			System.out.println(""); //creates a blank line for readability.
			
			list.sortStringAscending();

			System.out.println("Hit “Enter” to continue...");
			Choice = scan.nextLine();
			
			break;

		case 4: //to sort in descending order
			System.out.println("Sort the List from Z to A (Decending)");
			System.out.println(""); //creates a blank line for readability.
			
			list.sortStringDescending();

			System.out.println("Hit “Enter” to continue...");
			Choice = scan.nextLine();
			
			break;

		case 5: //to perform a linear search
			System.out.println("Sequential Search - Find the First Matching String in the List");
			System.out.println(""); //creates a blank line for readability.
			
			String target = getUserString();
			
			int index = list.searchStringList(target);
			RunSearchSort.displayTargetIndex(index);

			System.out.println(""); //creates a blank line for readability.
			System.out.println("Hit “Enter” to continue...");
			Choice = scan.nextLine();
			
			break;

		case 6: //to perform a binary search
			System.out.println("Binary Search - Find the First Matching String in the List");
			System.out.println(""); //creates a blank line for readability.
			
			String binTarget = getUserString();
			int match = list.BinarySearch(binTarget);
			RunSearchSort.displayTargetIndex(match);
			System.out.println(""); //creates a blank line for readability.
			
			System.out.println("Hit “Enter” to continue...");
			Choice = scan.nextLine();
			
			break; 
			
		case 7: //to swap a string's value
			System.out.println("Swap the First Matching String in the List");
			
			targetString = getUserString();
			
			System.out.print("Input a string to swap for the target string: ");
			newString = scan.nextLine();
			System.out.println(targetString + " " + newString);
			
			int swap = list.swapString(targetString, newString);
			RunSearchSort.displaySwapInfo(swap, targetString, newString);
			System.out.println(""); //creates a blank line for readability.
			
			System.out.println("Hit “Enter” to continue...");
			Choice = scan.nextLine();
			
			break;

		case 8: //to swap all strings value
			System.out.println("Swap all Matching Strings in the List");
			System.out.println(""); //creates a blank line for readability.
			
			targetString = getUserString();
			System.out.print("Input a string to swap for the target string: ");
			newString = scan.nextLine();
			System.out.println(""); //creates a blank line for readability.
			System.out.println(targetString + " " + newString);
			System.out.println(""); //creates a blank line for readability.
			
			int swapped = list.swapAllStrings(targetString, newString);
			RunSearchSort.displayAllSwapInfo(swapped, targetString, newString);
			System.out.println(""); //creates a blank line for readability.
			
			System.out.println("Hit “Enter” to continue...");
			Choice = scan.nextLine();
			
			break;
		}
		System.out.println(); 
	}

	// ------------------------------------------------------------------------
	// Get User target string
	// ------------------------------------------------------------------------
	public static String getUserString()
	{
		System.out.print("\nInput target string: ");
		String target = (scan.nextLine());
		System.out.println(""); //creates a blank line for readability.
		return target;
	}

	// ------------------------------------------------------------------------
	// Display target index
	// ------------------------------------------------------------------------
	public static void displayTargetIndex(int target)
	{
		// If target is found, display "found" message containing target and
		// target index location in the list. If not found, display "not found"
		// message containing target.
		
		if (target == -1)
		{
			System.out.println("Your string was not found!");
		}
		
		else
		{
			System.out.println("Your string was found at: " + target);
		}
	}

	// ------------------------------------------------------------------------
	// Display Single-Swap information
	// ------------------------------------------------------------------------
	public static void displaySwapInfo(int index, String target, String swap)
	{
		// If target is found, display "swap" message containing target and
		// target index location in the list. If not found, display "no swap"
		// message containing target.
		
		if (index == -1)
		{
			System.out.println("The string \"" + target + "\" was not found, therefore the string was unableto be swapped.");
		}
		else
		{
			System.out.println(" Your string \"" + swap +"\" was swapped for \"" + target + "\" at index: " + index);
		}
	}

	// ------------------------------------------------------------------------
	// Display All-Swap information
	// ------------------------------------------------------------------------
	public static void displayAllSwapInfo(int count, String target, String swap)
	{
		// If targets are found, display "swap" message containing target and
		// the count of swaps that occurred. If not found, display "no swap"
		// message containing target.
		
		if (count > 0)
		{
			System.out.println("The string \"" + target + "\" was found " + count + " time(s).");
		}
		else
		{
			System.out.println("The string \"" + target + "\" was NOT found so you are a Bad Monkey");
		}
	}
}