// **********************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: CollectionList.java
// Date: 11/23/20153
// Purpose: PGM_CH13-Book: Defines the Book class.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler and Damon Leson.
// in the design, construction, and debugging of this source code.
// **********************************************************************************

//----------------------------------------------------------------------
// Constructor for book
//----------------------------------------------------------------------
public class Book
{
	public String title;
	final public String OBJECT_TYPE = "Book: ";

	//-----------------------------------------------------------------
	// Sets up the new book with its title.
	//-----------------------------------------------------------------
	public Book(String newTitle)
	{
		title = newTitle;
	}

	//-----------------------------------------------------------------
	// Returns this book as a string.
	//-----------------------------------------------------------------
	public String toString()
	{
		return OBJECT_TYPE + title;
	}
}