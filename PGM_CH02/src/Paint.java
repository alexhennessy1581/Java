// ****************************************************************************
// File: PGM_CH02
// Date: 02/18/2015
// Author: Alexandra Hennessy
// Purpose: PGM_CH02 class: Paint.java
// Determine how much paint is needed to paint the walls
// of a room given its length, width, and height
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (no one)
// in the design, construction, and debugging of this source code.
// ****************************************************************************
import java.util.Scanner;
public class Paint
{
	// -------------------------------------------------------------------------
	// Determine how much paint is needed to paint the walls
	// of a room given its length, width, and height.
	//--------------------------------------------------------------------------

	public static void main(String[] args)
	{
		final int COVERAGE = 350;
		// paint covers 350 sq ft/gal
		// declare integers length, width, and height;
			int length; // length of the room
			int width; // width of the room
			int height; // height of the room
			int door; // number of doors
			int window; // number of windows
		// declare double totalSqFt;
			double TotalAreaSqFt; // the area of the room
			double ToalArea; // the paintable area
			double TotalNonarea; // the nonpaintable area
		// declare double paintNeeded;
			double PaintNeed; // the number of gallons needed
		// declare and initialize Scanner object
		Scanner scan = new Scanner(System.in);
		// Prompt for and read in the length of the room
			System.out.print("Input room length (feet): "); length = scan.nextInt();
		// Prompt for and read in the width of the room
			System.out.print("Input room width (feet): "); width = scan.nextInt();
		// Prompt for and read in the height of the room
			System.out.print("Input room height (feet): "); height = scan.nextInt();
		// Prompt for and read in the numbers of doors in the room
			System.out.print("Input the number of doors in room: "); door = scan.nextInt();
		//Prompt for and read in the numbers of windows in the room
			System.out.print("Input the number of windows in room: "); window = scan.nextInt();
		// Compute the total square feet to be painted--think
		// about the dimensions of each wall
			TotalAreaSqFt = length * width * height;
			TotalNonarea = (20 + 15);
			ToalArea = TotalAreaSqFt - TotalNonarea;
		// Compute the amount of paint needed
			PaintNeed = ToalArea / COVERAGE;
		// Print the length, width, and height of the room and
		// the number of gallons of paint needed.
			System.out.println ("The dimensions of the room are: "+
					"\n\tLength: "+ length +" feet\n\t" +
					"Width: " +width +" feet" +
					"\n\tHeight: " + height +" feet\n\t");
	}
}