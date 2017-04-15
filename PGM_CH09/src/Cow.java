// ****************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: Cow
// Date: 10/01/2015
// Purpose: PGM_CH09-Cow: A class that holds a Cow's breed and its production.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler
// in the design, construction, and debugging of this source code.
// **************************************************************************** 

//****************************************************************
// Cow.java
//
// A class that holds a Cow's breed and its production.
//
//****************************************************************

public abstract class Cow

{
	protected String breed = "Unknown";
	protected int production = 0;
	
	// ------------------------------------------------------------
	// Constructor -- with Cow’s breed and production
	// ------------------------------------------------------------
	public Cow(String breed, int production)
	{
		this.breed = breed;
		this.production = production;
	}
	
	// ------------------------------------------------------------
	// Returns the Cow's breed
	// ------------------------------------------------------------
	public String getBreed()
	{
		return breed;
	}
	
	// ------------------------------------------------------------
	// Returns the Cow's production
	// ------------------------------------------------------------
	public abstract String getProduction();

	//------------------------EXTRA CREDIT-----------------------
	// Returns the approximate forage requirement
	//------------------------EXTRA CREDIT-----------------------
	public abstract String requiredForage();

}