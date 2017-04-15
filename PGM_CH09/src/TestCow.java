// ****************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: TestCow
// Date: 10/01/2015
// Purpose: PGM_CH09-TestCow: A simple test class that creates two cow objects, 
// sets their information, and then retrieves and displays that information.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler
// in the design, construction, and debugging of this source code.
// **************************************************************************** 

// ****************************************************************
// TestCow.java
//
// A simple test class that creates two cow objects, sets their
// information, and then retrieves and displays that information.
//
// ****************************************************************

public class TestCow

{

	public static void main(String[] args)
	{
		//-----------------------------------------------------------
		// Black Angus beef cattle
		//-----------------------------------------------------------
		Cow BeefCow = new BeefCow("BeefCow", 1410); 
		// saves the string for breed and int production for BeefCow
		
		//-----------------------------------------------------------
		// Average mature weight of 1,410 pounds at 5 years
		//-----------------------------------------------------------
		System.out.println(BeefCow.getProduction()); // calls the outputString from BeefCow
		
		System.out.println("");//Space between lines.

		//------------------------EXTRA CREDIT-----------------------
		//Black Angus Forage
		//------------------------EXTRA CREDIT-----------------------
		System.out.println(BeefCow.requiredForage()); // calls the outputString from BeefCow
		
		System.out.println("");//Space between lines.
		System.out.println("");//Space between lines.

		//-----------------------------------------------------------
		// Holstein dairy cattle
		//-----------------------------------------------------------
		Cow DairyCow = new MilkCow("DairyCow" , 18796);
		// saves the string for breed and int production for MilkCow
		
		//-----------------------------------------------------------
		// average annual milk production in pounds of milk
		//-----------------------------------------------------------
		System.out.println(DairyCow.getProduction()); // calls the ouputString from MilkCow
		
		System.out.println("");//Space between lines.

		//------------------------EXTRA CREDIT-----------------------
		//Holstein dairy cow Forage
		//------------------------EXTRA CREDIT-----------------------
		System.out.println(DairyCow.requiredForage()); // calls the ouputString from MilkCow
	}
} 