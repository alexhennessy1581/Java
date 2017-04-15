// **********************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: CollectionTest.java
// Date: 11/23/20153
// Purpose: PGM_CH13-COllectionTest: Driver to test CollectionList methods.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler and Damon Leson.
// in the design, construction, and debugging of this source code.
// **********************************************************************************

import java.util.Scanner;

public class CollectionTest
{
	private static Scanner scan;
	private static CollectionList list = new CollectionList();
	//public static String stop;
	public static int pick;

	//----------------------------------------------------------------
	// Creates a list, then repeatedly prints the menu and does what
	// the user asks until they quit.
	//----------------------------------------------------------------
	public static void main(String[] args)
	{
		scan = new Scanner(System.in);
		printMenu();
		int choice = scan.nextInt();


		while (choice != 0)
		{
			runOps(choice);
			printMenu();
			choice = scan.nextInt();
		}
	}

	//----------------------------------------
	// Does what the menu item calls for.
	//----------------------------------------
	public static void runOps(int choice)
	{

		switch(choice)
		{

		case 0:
			System.out.println("Bye!");
			break;

		case 1: //add to end
			System.out.println("\nAdding an object node at the end of the Collection list.");
			addObject(true);
			list.displayList();
			break;

		case 2: //add to front
			System.out.println("\nAdding an object node at the front of the Collection list.");
			addObject(true);
			list.displayList();
			break;

		case 3: //remove last element
			System.out.println("\nRemoving the last object node of the Collection list.");
			list.removeLast();
			list.displayList();
			break;

		case 4: //remove first element
			System.out.println("\nRemoving the first object node of the Collection list.");
			list.removeFirst();
			list.displayList();
			break;

		case 5: //print
			list.displayList();
			break;

		default:
			System.out.println("Sorry, invalid choice");
		}
	}


	//-----------------------------------------
	// Prints the user's choices.
	//-----------------------------------------
	public static void printMenu()
	{
		System.out.println("\n Menu of Operations");
		System.out.println("\n ==================");
		System.out.println("0: Quit.");
		System.out.println("1: Add an object node to the end of the list.");
		System.out.println("2: Add an object node to the front of the list.");
		System.out.println("3: Remove the last object node from the list.");
		System.out.println("4: Remove the first object node from the list.");
		System.out.println("5: Display the list.");
		System.out.print("\nEnter your choice: ");
	}

	//--------------------------------------------
	// Prints the user's choices for object menu.
	//--------------------------------------------
	public static void printObjectMenu()
	{

		System.out.println("\nWhich type of object would you like to add?");
		System.out.println("1: Book");
		System.out.println("2: DVD");
		System.out.println("3: Magazine");
		System.out.print("\nEnter your choice: ");
		scan.nextLine();
		pick= scan.nextInt();
	}

	//--------------------------------------------
	// A boolean for chosen option 1 or 2
	//--------------------------------------------
	public static void addObject(boolean why)
	{
		String title;
		printObjectMenu();

		switch(pick)
		{
		case 0:

			System.out.println("Bye!");
			break;

		case 1:// Chosen Book

			if (why == true)
			{
				System.out.print("\nEnter the Book title: ");
				scan.nextLine();
				title = scan.nextLine();
				list.addToEnd(new Book(title));
			}
			else
			{
				System.out.print("\nEnter the Book title: ");
				scan.nextLine();
				title = scan.nextLine();
				list.addToFront(new Book(title));
			}
			break;

		case 2: // Chosen DVD

			if (why == true)
			{
				System.out.print("\nEnter the DVD title: ");
				scan.nextLine();
				title = scan.nextLine();
				list.addToEnd(new DVD(title));
			}
			else
			{
				System.out.print("\nEnter the DVD title: ");
				scan.nextLine();
				title = scan.nextLine();
				list.addToFront(new DVD(title));
			}
			break;

		case 3: // Chosen Magazine

			if (why == true)
			{
				System.out.print("\nEnter the Magazine title: ");
				scan.nextLine();
				title = scan.nextLine();
				list.addToEnd(new Magazine(title));
			}
			else
			{
				System.out.print("\nEnter the Magazine title: ");
				scan.nextLine();
				title = scan.nextLine();
				list.addToFront(new Magazine(title));
			}
			break;

		default:
			System.out.println("\nSorry, invalid choice");
			pause();
		}
	}

	//--------------------------------------------
	// A pause statement
	//--------------------------------------------
	public static void pause()
	{
		System.out.println("\nPress (Enter) to continue...");
		scan.nextLine();
	}
}