// **********************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: CollectionList.java
// Date: 11/23/20153
// Purpose: PGM_CH13-DVD: Defines DVD class.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler and Damon Leson.
// in the design, construction, and debugging of this source code.
// **********************************************************************************

//----------------------------------------------------------------------
// Constructor for DVD
//----------------------------------------------------------------------
public class DVD
{
	public String title;
	final public String OBJECT_TYPE = "DVD: ";

	//-----------------------------------------------------------------
	// Sets up the new DVD with its title.
	//-----------------------------------------------------------------
	public DVD(String newTitle)
	{
		title = newTitle;
	}

	//-----------------------------------------------------------------
	// Returns this DVD as a string.
	//-----------------------------------------------------------------
	public String toString()
	{
		return OBJECT_TYPE + title;
	}
}