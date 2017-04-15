// ****************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: Item
// Date: 10/01/2015
// Purpose: PGM_CH08-Item: contains the definition of a class named Item that models an item one would
// purchase. An item has a name, a price, and a quantity (the quantity purchased). 
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler
// in the design, construction, and debugging of this source code.
// **************************************************************************** 

// ***************************************************************
// Item.java
//
// Represents an item in a shopping basket.
// ***************************************************************

import java.text.NumberFormat;

public class Item
{
	private String name;
	private double price;
	private int quantity;

	// ---------------------------------------------------------
	// Create a new item with the given attributes.
	// ---------------------------------------------------------
	public Item (String itemName, double itemPrice, int numPurchased)

	{
		name = itemName;
		price = itemPrice;
		quantity = numPurchased;
	}

	// ---------------------------------------------------------
	// Return a string with the information about the item
	// ---------------------------------------------------------
	public String toString ()

	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t"
				+ fmt.format(price*quantity));
	}

	// -----------------------------------------------
	// Returns the unit price of the item
	// -----------------------------------------------
	public double getPrice()

	{
		return price;
	}

	// -----------------------------------------------
	// Returns the name of the item
	// -----------------------------------------------
	public String getName()

	{
		return name;
	}

	// -----------------------------------------------
	// Returns the quantity of the item
	// -----------------------------------------------
	public int getQuantity()

	{
		return quantity; 
	}

}
