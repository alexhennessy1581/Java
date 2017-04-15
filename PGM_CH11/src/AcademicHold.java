// **********************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: AcademicHold.java
// Date: 11/02/20153
// Purpose: PGM_CH11-AcademicHold: Reads student data from a text file and 
// writes data to another text file based on accrued semester credit hours and GPA.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler
// in the design, construction, and debugging of this source code.
// **********************************************************************************

// **********************************************************************************
// AcademicHold.java
//
// Reads student data from a text file and writes data to another text
// file based on accrued semester credit hours and GPA.
// **********************************************************************************

//imported classes
import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

	public class AcademicHold
	{
	
		// -------------------------------------------------------------------
		// Reads student data (name, semester credit hours, quality points)
		// from a text file, computes the GPA, then writes data to another
		// text file based on student GPA and accrued semester credit hours.
		// -------------------------------------------------------------------
		
		public static void main (String[] args)
		{
			//Declared Variables
			int creditHours = 0;// number of semester hours earned
			double qualityPoints = 0;// number of quality points earned
			double gpa = 0;// grade point average
			String name;//Student's name
			String inputFileName = "records.dat";// takes information from the records.dat
			String outputFileName = "academic_hold.dat";// sends the information to academic_hold.dat
			
			DecimalFormat fmt = new DecimalFormat("0.0##");// formating GPA
	
			try
			{	
				// Set up scanner to input file
				Scanner dataFileIn = new Scanner(new File(inputFileName));
	
				// Set up the output file stream
				PrintWriter dataFileOut = new PrintWriter(new FileWriter(outputFileName));
	
				// Print a header to the output file
				dataFileOut.println ("-------------------------");
				dataFileOut.println ("Students on Academic Hold");
				dataFileOut.println ("-------------------------");
				dataFileOut.println ("Name\tHours\tPoints\tGPA");
	
				// Process the input data file, one token at a time
				while (dataFileIn.hasNext())
				{

					//Declare where to get the variables from records.dat
					name = dataFileIn.next(); // grabs the name.
					creditHours = dataFileIn.nextInt(); // grabs the credited hours.
					qualityPoints = dataFileIn.nextDouble(); // grabs the quality points.

					// ------------------------------------------------------------------------------------------------------
					// Get the credit hours and quality points and determine if the student is on academic hold. 
					// If so, write the student's data to the output file.
					// Calculate GPA; prevent divide by 0. Write to output data file based on GPA and semester credit hours
					// ------------------------------------------------------------------------------------------------------
					
					do
					{
						gpa = (qualityPoints/creditHours); // equation to calculate the GPA.
	
						if(gpa < 1.5 && creditHours < 30) // a GPA of less than 1.5 and has accrued less than 30 semester credit hours
						{
							//System.out.println(name +" does have an academic hold."); for troubleshooting.
							dataFileOut.println(name + "\t" + creditHours + "\t    " + qualityPoints + "\t" + fmt.format(gpa)); // prints the information to academic_hold.dat.
							break;
						}
	
						else if(gpa < 1.75 && creditHours < 60) // a GPA of less than 1.75 and has accrued fewer than 60 semester credit hours
						{
							//System.out.println(name +" does have an academic hold.");  for troubleshooting.
							dataFileOut.println(name + "\t" + creditHours + "\t    " + qualityPoints + "\t" + fmt.format(gpa)); // prints the information to academic_hold.dat.
							break;
						}
	
						else if(gpa < 2.0 && creditHours >= 60) // a GPA of less than 2.0 and has accrued at least 60 semester credit hours
						{
							//System.out.println(name +" does have an academic hold.");  for troubleshooting.
							dataFileOut.println(name + "\t" + creditHours + "\t    " + qualityPoints + "\t" + fmt.format(gpa)); // prints the information to academic_hold.dat.
							break;
						}
	
						else // the student does NOT have an academic hold.
						{
							//System.out.println(name + " does not have an academic hold."); for troubleshooting.
							break;
						}
						
					} while (dataFileIn.hasNext()); // ends the do loop
					
				}
				
			dataFileOut.close(); // Close output file
			
			dataFileIn.close(); // Close input file
			
			System.out.println("Output file has been created: " + outputFileName); // prints out the statement if the acdemic_hold.dat was created
		}
			
	// program exceptions
		catch (InputMismatchException e)
		{
			System.out.println ("Data format error in input file: " + e);
		}
	
		catch (NoSuchElementException e)
		{
			System.out.println ("No such element available: " + e);
		}
	
		catch (FileNotFoundException e)
		{
			System.out.println ("The file " + inputFileName + " was not found.");
		}
	
		catch (IOException e)
		{
			System.out.println (e);
		}
	
	}
} 