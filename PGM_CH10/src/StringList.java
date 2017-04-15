// ****************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: StringSearch
// Date: 10/23/2015
// Purpose: PGM_CH10-StringSearch: Create a StringList class with the necessary 
// methods to create, fill, sort, and search an array of strings.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler
// in the design, construction, and debugging of this source code.
// ****************************************************************************

// ****************************************************************************
// StringList.java
//
// Create a StringList class with the necessary methods to
// create, fill, sort, and search an array of strings.
//
// ****************************************************************************

import java.util.Scanner;

public class StringList
{
	// array of strings
	static String[] list;

	//-------------------------------------------------------------------------
	// Create a StringList object (array) of the specified size.
	//-------------------------------------------------------------------------
	public StringList(int size)
	{
		list = new String[size];
	}

	//-------------------------------------------------------------------------
	// Fill the StringList object with strings.
	//-------------------------------------------------------------------------
	public void fillStringList()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Filling a list of " + list.length + " strings.");
		System.out.println(); //creates a blank line for readability.
		
		//Declared Variables
		String just = null;
		int student = 0;

		// loop to fill the list
		while(student < list.length)
		{
			System.out.println("Enter a string: ");
			just = scan.nextLine();
			System.out.println("");
			list[student] = new String(just);
			student++;
		}
	}

	//-------------------------------------------------------------------------
	// Display the StringList object
	// Display all array elements and their index value, index value first
	//-------------------------------------------------------------------------
	public void showStringList()
	{
		// loop to display all list items and their index
		int theirIndex = 0;

		for (String list : list)
		{
			System.out.println(theirIndex + " " + list);
			theirIndex++;
		}
	}

	//-------------------------------------------------------------------------
	// Return the index of the first occurrence of the target value in the
	// StringList object.
	// Return -1 if the target is not found.
	//-------------------------------------------------------------------------
	public int searchStringList(String targetString)
	{
		// set location index variable value to “not found” value
		// loop to search for the first occurrence of target
		// return index location

		//Declared Variables
		int index = 0;
		boolean found = false;

		while (!found && index < list.length)
		{
			if (list[index].equals(targetString))
			{
				found = true;
			}
			else
			{
				index ++;
			}
		}

		if (found)
		{
			return index;
		}
		else
		{
			return -1;
		}

	}


	//-------------------------------------------------------------------------
	// Sort the list in ascending order using the selection sort algorithm.
	// Returns nothing.
	//-------------------------------------------------------------------------
	public void sortStringAscending()
	{
		//Declared Variables
		int min;
		String temp;

		// loop to sort
		for (int index = 0; index < list.length-1; index++)
		{
			min = index;
			
			for(int scan = index+1; scan < list.length; scan++)
			{
				if(list[scan].compareToIgnoreCase(list[min]) < 0)
					min = scan;
			}

			//Swap the values
			temp = list[min];
			list[min] = list[index];
			list[index] = (String) temp;
		}
	}

	//-------------------------------------------------------------------------
	// Sort the list in descending order order using the selection sort algorithm.
	// Returns nothing.
	//-------------------------------------------------------------------------
	public void sortStringDescending()
	{
		//Declared Variables
		int min;
		String temp;

		// loop to sort
		for (int index = 0; index <= list.length-1; index++)
		{
			min = index;
			for(int scan = index+1; scan < list.length; scan++)
			{
				if(list[scan].compareToIgnoreCase(list[min]) > 0)
					min = scan;
			}

			//Swap the values
			temp = list[min];
			list[min] = list[index];
			list[index] = (String) temp;
		}
	}

	//-------------------------------------------------------------------------
	// Swap the first occurrence of target string in the StringList object
	// with swap string.
	// Returns the index of the swap location, or returns -1 if the swap does
	// not take place.
	//-------------------------------------------------------------------------
	public int swapString(String targetString, String swap)
	{
		//Declared Variables
		int count = 0;
		boolean found = false;

		while (!found && count < list.length)
		{
			if (list[count].equals(targetString))
			{
				found = true;
				list[count] = swap;
			}
			else
			{
				count ++;
			}
		}

		if (found)
		{
			return count;
		}
		else
		{
			return -1;
		}
	}

	//-------------------------------------------------------------------------
	// Swap all occurrences of target string in the StringList object with
	// swap string.
	//
	// Returns the number of swaps, or returns 0 if no swaps take place.
	//-------------------------------------------------------------------------
	public int swapAllStrings(String target, String swap)
	{
		//Declared Variables
		int count = 0,index = 0;
		boolean found = false;
		
		while (index < list.length)
		{
			if (list[index].equals(target))
			{
				found = true;
				count ++;
				list[index] = swap;
			}
			else
			{
				index ++;
			}
		}

		if (found)
		{
			return count;
		}
		else
		{
			return 0;
		}
	}


	//------------------------EXTRA CREDIT-----------------------
	// Return the index of the first occurrence of the target 
	// binary value in the StringList object.
	//------------------------EXTRA CREDIT-----------------------
	public int BinarySearch(String targetString)
	{
		//Declared Variables
		int min = 0, max = list.length-1, mid = 0;
		boolean found = false;
		
		while (!found && min <= max)
		{
			mid = (min+max) / 2;

			if (list[mid].compareTo(targetString) == 0)
			{
				found = true;
			}
			else
			{
				if (targetString.compareTo(list[mid]) < 0)
				{
					max = mid - 1;
				}
				else
				{
					min = mid + 1;
				}
			}

		}

		if(found)
		{
			return mid;
		}
		else
		{
			return -1;
		}
	}
}