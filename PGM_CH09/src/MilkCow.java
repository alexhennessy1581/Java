// ****************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: MilkCow
// Date: 10/01/2015
// Purpose: PGM_CH09-MilkCow: A class derived from the Cow class that holds information about
// a Milk cow's annual milk production in pounds.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler
// in the design, construction, and debugging of this source code.
// **************************************************************************** 

// ****************************************************************
// MilkCow.java
//
// A class derived from the Cow class that holds information about
// a Milk cow's annual milk production in pounds.
//
// Overrides the Cow getProduction() methods.
//
// ****************************************************************
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MilkCow extends Cow

{
	DecimalFormat fmt = new DecimalFormat();
	NumberFormat tmi = new DecimalFormat("0.0%");
	final double dailyForage = 0.02;
	
	private String type = "Milk Production";
	
	public MilkCow(String breed, int production)
	{
		super(breed, production);
	}
	
	// ------------------------------------------------------------
	// Returns production weight as a formatted output string
	// ------------------------------------------------------------

	public String getProduction()
	{
		String outputString =  "- The typical " + type + " of the Holstein breed is " +
				fmt.format(production)+ " pounds of milk annually.";

		return outputString;
	}

	//------------------------EXTRA CREDIT-----------------------
	// Returns the approximate forage requirement
	//------------------------EXTRA CREDIT-----------------------
	public String requiredForage() 
	{
		String outputString = "- The typical " + type + " requirement for the Holstein breed is approximately " 
				+ tmi.format(dailyForage) +  " of body weight.";
		
		return outputString;
	}
}