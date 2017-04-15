// ****************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: BeefCow
// Date: 10/01/2015
// Purpose: PGM_CH09-BeefCow: A class derived from the Cow class that holds information about
// a Beef cow's mature weight in pounds at 5 years.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler
// in the design, construction, and debugging of this source code.
// **************************************************************************** 

// *****************************************************************
// BeefCow.java
//
// A class derived from the Cow class that holds information about
// a Beef cow's mature weight in pounds at 5 years.
//
// Overrides the Cow getProduction() method.
//
// *****************************************************************
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BeefCow extends Cow

{
	DecimalFormat fmt = new DecimalFormat();
	NumberFormat tmi = new DecimalFormat("0.0%");
	final double dailyForage = 0.025;
	
	private String type = "Beef Production";
	
	public BeefCow(String breed, int production)
	{
		super(breed, production);

	}
	
	// ------------------------------------------------------------
	// Returns production weight as a formatted output string
	// ------------------------------------------------------------
	public String getProduction()
	{
		String outputString =  "- The typical " + type + " weight of the Black Angus breed is a weight of "
				+ fmt.format(production) +  " pounds at 5 years of age.";
		
		return outputString;
	}
	
	//------------------------EXTRA CREDIT-----------------------
	// Returns the approximate forage requirement
	//------------------------EXTRA CREDIT-----------------------
	public String requiredForage() 
	{
		String outputString = "- The typical " + type + " requirement for the Black Angus breed is approximately " 
	+ tmi.format(dailyForage) +  " of body weight.";
		
		return outputString;
	}
	
}