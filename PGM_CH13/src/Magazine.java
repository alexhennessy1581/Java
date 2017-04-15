// **********************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: CollectionList.java
// Date: 11/23/20153
// Purpose: PGM_CH13-CollectionList: Defines magazine class.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler and Damon Leson.
// in the design, construction, and debugging of this source code.
// **********************************************************************************

//----------------------------------------------------------------------
// Constructor for magazine
//----------------------------------------------------------------------
public class Magazine
{
	public String title;
	final public String OBJECT_TYPE = "Magazine: ";

	//-----------------------------------------------------------------
	// Sets up the new magazine with its title.
	//-----------------------------------------------------------------
	public Magazine(String newTitle)
	{
		title = newTitle;
	}

	//-----------------------------------------------------------------
	// Returns this magazine as a string.
	//-----------------------------------------------------------------
	public String toString()
	{
		return OBJECT_TYPE + title;
	}
}