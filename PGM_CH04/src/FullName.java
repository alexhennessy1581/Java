// ************************************************************
// FullName.java
// Author: Alexandra Hennessy
// Purpose:Demonstrates how to input some data, store it in an object, 
// and manipulate it in various ways.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (Steve, and Austin) in the design, construction, and debugging of this source code.
// ************************************************************

	
public class FullName

{
	
	// Declare Variables
	String fst, mid, lst, init, name;
	
// ------------------------------------
// Constructor = First, Middle, Last
// ------------------------------------
	
// ----------------------------------------------------------	
// Create a FullName object that stores a person’s first,
// middle, and last names
// ----------------------------------------------------------
		
	public FullName(String first, String middle, String last)
	
	{
		
		fst = first; // Variable fst = String first
		mid = middle; // Variable mid = String first
		lst = last; // Variable lst = String first
		name = fst + mid + lst; // Strings fst + mid + lst = String name
	
	}
	
	public String getFirst()
	
	{
	
		return fst; // Returns the first name.	
	
	}
	
	public String getMiddle()
	
	{
		
		return mid; // Returns the middle name.
	
	}

	public String getLast()
	
	{
		
		return lst; //Returns the last name.
	}
	
	public String firstMiddleLast()
	
	{	
		
		return (fst + " " + mid  + " " + lst); // Returns a string containing the person’s full name in order, e.g., “Mary Jane Smith”.
	
	}
	
	public String lastFirstMiddle()
	
	{
		
		return (lst + ", " + fst + " " + mid); // Returns a string containing the person’s full name with the last name first followed by a comma,
											   // e.g., “Smith, Mary Jane”.
	}
	

	public boolean equals(FullName otherName)
	
	{
		boolean tf = name.equalsIgnoreCase(otherName.name);// Returns true or false if name is the same as otherName. Comparisons should not be case sensitive.
		return tf; // returns the true/false boolean
	}
	
	public String initials()
	
	{
		String init = fst.substring (0,1) + mid.substring(0,1) + lst.substring(0,1);
		return init.toUpperCase(); // Returns the person’s initials (a 3-character string). The initials should be all in upper case,
								   // regardless of what case in which a name was entered.
	}
	
	public int length()
	
	{
		int nameLength = fst.length() + mid.length() + lst.length();
		return nameLength; // Returns the total number of characters in the full name; DO NOT include the spaces between
						   // the first, middle, and last names.
	}

}