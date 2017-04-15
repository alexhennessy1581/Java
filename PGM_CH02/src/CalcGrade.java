// ****************************************************************************
// File: PGM_CH02
// Date: 02/18/2015
// Author: Alexandra Hennessy
// Purpose: PGM_CH02 class: CalcGrade.java
// This program computes a student's assignment grade from the grades on the
// three components of the assignment: the pre-assignment, the assignment
// itself, and the post-assignment.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (no one)
// in the design, construction, and debugging of this source code.
// ****************************************************************************

	import java.util.Scanner;
public class CalcGrade
{
	// --------------------------------------------------------------------------
	// This program computes a student's assignment grade from the grades on the
	// three components of the assignment: the pre-assignment, the assignment
	// itself, and the post-assignment.
	// --------------------------------------------------------------------------
	
		public static void main (String[] args)
		{
			// Declare constants
			final int inWeight; // in-class weight
			final int outWeight; // out-of-class weight
			// Declare variables
			int preAssignmentPts; // total points earned, pre-assignment
			int preAssignmentMax; // total available points, pre-assignment
			int assignmentPts; // total earned points, assignment
			int assignmentMax; // total available points, assignment
			int postAssignmentPts; // total earned points, post-assignment
			int postAssignmentMax; // total available points, post-assignment
			int outPts; // total earned points, out-of-class
			int totalOutPts; // total available points, out-of-class
			int outClassAvg; // average, out-of-class work
			int inClassAvg; // average on the in-class work
			double assignmentGrade; // final assignment grade
		Scanner scan = new Scanner(System.in);
		// Get the input
				System.out.println("\nWelcome to the Assignment Grade Calculator\n");
			//Get the input of in weight and out weight
				System.out.print("You need to supply the weighting factor for "
						+ "the in-class portion of the "
						+ "\nassignment. The out-of-class weighting factor is calculated based on the"
						+ "\nin-class weighting factor: out-of-class weight = 100 - in-class weight. "
						+ "\nEnter the in-class weighting factor (0 - 100): "); inWeight = scan.nextInt();
				System.out.println("");
				System.out.println("The weighting factors for this assignment are:");
				System.out.println("In-Class:" + inWeight +"%");
				outWeight = 100 - inWeight;
				System.out.println("In-Class:" + outWeight +"%");
			// pre-assignment information
				System.out.print("Enter the number of pre-assignment points you "
						          + "earned: ");
			preAssignmentPts = scan.nextInt();
				System.out.print("Enter the maximum number of pre-assignment points "
								  + "possible: ");
			preAssignmentMax = scan.nextInt();
			// assignment information
				System.out.print("Enter the number of assignment points you "
								  + "earned: ");
			assignmentPts = scan.nextInt();
				System.out.print("Enter the maximum number of assignment points "
								  + "possible: ");
			assignmentMax = scan.nextInt();
			// post- information
				System.out.print("Enter the number of post-assignment points you "
								  + "earned: ");
			postAssignmentPts = scan.nextInt();
				System.out.print("Enter the maximum number of post-assignment points "
								  + "possible: ");
			postAssignmentMax = scan.nextInt();
			// Calculate the average for the out-of-class work
			outPts = preAssignmentPts + postAssignmentPts;
			totalOutPts = preAssignmentMax + postAssignmentMax;
			outClassAvg = 100 * outPts / totalOutPts;
			// Calculate the average for the in-class work
			inClassAvg = 100 * assignmentPts / assignmentMax;
			// Calculate the weighted average
			// 40% of the out-of-class average plus 60% of the in-class
			assignmentGrade = ((outWeight * outClassAvg) + (inWeight * inClassAvg)) / 100;
			// Print the results
					System.out.println();
				System.out.println("Your average on out-of-class work is "
									+ outClassAvg + "%");
				System.out.println("Your average on in-class work is "
									+ inClassAvg + "%");
				System.out.println("Your assignment grade is " + assignmentGrade + "%");
					System.out.println();
		}
}