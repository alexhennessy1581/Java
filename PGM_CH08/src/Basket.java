// ****************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: Item
// Date: 10/01/2015
// Purpose: PGM_CH08-Basket: Represents a shopping basket as an array of items.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler
// in the design, construction, and debugging of this source code.
// **************************************************************************** 

// ***************************************************************
// Basket.java
//
// Represents a shopping basket as an array of items.
// *************************************************************** 

import java.text.NumberFormat;

public class Basket 
{

	private Item[] myBasket;
	private int itemCount; // total number of items in the basket
	private double totalPrice; // total price of items in the basket
	private int capacity; // current basket capacity

	// ---------------------------------------------------------
	// Creates an empty shopping basket with a capacity of 3 items.
	// ---------------------------------------------------------
	public Basket()

	{
		capacity = 3;
		myBasket = new Item[capacity];
		itemCount = 0;
		totalPrice = 0.0;
	}

	// -----------------------------------------------------
	// Adds an item to the shopping basket.
	// -----------------------------------------------------
	public void addToBasket(String itemName, double price, int quantity)

	{
		Item temp = new Item(itemName, price, quantity);

		totalPrice += (price * quantity);
		myBasket[itemCount]= temp;
		itemCount += 1;

		if (itemCount == capacity)

		{
			increaseSize();
		}
	}

	// -----------------------------------------------------
	// Returns the contents of the basket together with
	// summary information.
	// -----------------------------------------------------
	public String toString()

	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String contents = "\n Your Shopping Basket\n";
		contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";

		for (int i = 0; i < itemCount; i++)
		{
			contents += myBasket[i].toString() + "\n";
			contents += "\t\t\t      ----------\n \t\t Basket Total:  " + fmt.format(totalPrice);
			contents += "\n";
		}
		return contents;
	}

	// -----------------------------------------------------
	// Returns the contents of the basket together with
	// summary information.
	// -----------------------------------------------------
	public String updateBasket()

	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String update = "\nBasket Contents\n";
		update += "\nItem\t\tUnit Price\tQuantity\t\n";

		for (int i = 0; i < itemCount; i++)
		{
			update += myBasket[i].getName() + " \t" + fmt.format(myBasket[i].getPrice()) + 
			" \t \t" + myBasket[i].getQuantity() + "\n";
		}
		return update;
	}

	// -----------------------------------------------------
	// Increases the capacity of the shopping basket by 3
	// -----------------------------------------------------
	private void increaseSize()

	{
		Item[] temp = new Item[myBasket.length + 3];

		for(int i = 0; i < myBasket.length; i++)
		{
			temp[i] = myBasket[i];

		myBasket = temp;
		temp = null;
		capacity = myBasket.length;
		}
	}

	//-----------------------------------------------------
	// Returns totalPrice
	//-----------------------------------------------------
	public double totalPrice()

	{
		return totalPrice;
	}

	//-----------------------------------------------------
	// Returns basket size
	//-----------------------------------------------------
	public int basketSize()

	{
		return capacity;
	}

}