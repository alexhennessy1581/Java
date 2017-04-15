// ****************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: Item
// Date: 10/01/2015
// Purpose: PGM_CH08-Gone Shopping: Represents the end of shopping.
// Also Extra Credit with the date and time, and basket size.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler
// in the design, construction, and debugging of this source code.
// **************************************************************************** 

// ***************************************************************
// GoneShopping.java
//
// The result of Shopping. Checked out and the bill.
// *************************************************************** 

import java.util.*;
import java.text.*;
import java.util.Scanner;

public class GoneShopping 
{

	public static void main(String[] args) 

	{
		Scanner scan = new Scanner(System.in); // Allows user to enter data that is then later used in the program

		// ***************************************************************
		// Defining the terms, integers, and format.
		//****************************************************************
		String name;
		double price, totalPrice;
		int quantity;
		name =null;
		price = 0;
		quantity= 0;
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		Basket SteveWonder = new Basket(); // Creating the name for the basket.

		System.out.println("Silver Fox Trading Post"); // Name of store.

		System.out.println(""); // Space between lines.

		System.out.print("Enter the name of the first item or Q to quit: "); // Prompts the user to enter the first item.
		name = scan.nextLine(); // Saves entered item into the String name.

		do // Creating a loop.
		{

			if (name.equalsIgnoreCase("q")) // If user hits q or Q it doesn't matter.
			{
				break; // If the letter q, or Q is hit the loop ends and then continues on below the while statement. 
			}

			else // If q, or Q is NOT hit than the loop does this:
			{
				System.out.print("Enter the price: ");
				price = scan.nextDouble();  // Saves entered item into the Double integer price.

				System.out.print("Enter the quantity: ");
				quantity = scan.nextInt(); // Saves entered item into the integer quantity.
				
				scan.nextLine(); // clears line (Thanks again Steve!!! :D)

				SteveWonder.addToBasket(name, price, quantity); // Calls the addToBasket from program Basket.

				System.out.println(SteveWonder.updateBasket()); // Prints out items in the basket by calling updateBasket from Basket program.

				System.out.println(""); // Space between lines.

				System.out.print("Enter the name of the next item or Q to quit: ");
				name = scan.nextLine(); // saves entered item into the String name.
			}

		}while(name!= ("Q") && name!= ("q")); // The loop continues as long as the String name does not have the letter q, or Q saved into it.


		System.out.println(""); // Space between lines.

		System.out.println("------------------------------");

		System.out.println(""); // Space between lines.

		System.out.println("Done Shopping");

		System.out.println(""); // Space between lines.

		System.out.println("------------------------------");

		System.out.println(""); // Space between lines.
		System.out.println(""); // Space between lines.

		System.out.println(SteveWonder); // Prints out the baskets contents.

		totalPrice = SteveWonder.totalPrice(); // Sets up the totalPrice for the basket.

		System.out.println("Please pay... " + fmt.format(totalPrice)); // Prints out the totalPrice in the number format.

		System.out.println(""); // Space between lines.

		//****************************************************************
		// Extra Credit.
		//****************************************************************

		System.out.println("Extra Credit ------------------------------");

		System.out.println(""); // Space between lines

		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm"); // Makes the date and time print out correctly.
		Calendar cal = Calendar.getInstance(); // Calls the date and time from the calendar from the user's computer.

		System.out.println(dateFormat.format(cal.getTime())); //Prints out the date and time.

		System.out.println(""); // Space between lines.

		System.out.println("Extra Credit ------------------------------");

		System.out.println(""); // Space between lines.

		System.out.println("Basket Size: " + SteveWonder.basketSize()); // Prints out the basket size from basketSize in the Basket program.

		scan.close(); // closed the scanner class.
	}	
}