// **************************************************************************
// ExamScores.java
// Author: Alexandra Hennessy
// Purpose: a program reads in a sequence of student exam grades and then computes the
// following:
// • the average score of the exam
// • the number of students who passed the exam (received a score of at least 60)
// • the number who failed the exam
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (Austin) in the design, construction, and debugging of this source code.
// **************************************************************************

import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class ExamScores
{

	public static void main(String[] args) 
	{
		String exName, exScore, result;
		int  again;
		int testFail = 0;
		int testNumber = 0;
		int testPass = 0;
		double score, average;
		double scAverage = 0;

		DecimalFormat end = new DecimalFormat("0.00");

		do
		{
			{

				exName = JOptionPane.showInputDialog ("Name of Exam: ");

				scAverage = 0;
				testFail = 0;
				testNumber = 0;
				testPass = 0;


				do
				{
					exScore = JOptionPane.showInputDialog("Student Exam Score (0 to 100): ");
					score = Double.parseDouble(exScore);

					while (score < 0 || score > 100)
					{

						JOptionPane.showMessageDialog (null, "Invalid score. \n Score must be between 0 to 100 inclusive.");

						exScore = JOptionPane.showInputDialog("Student Exam Score (0 to 100):");
						score = Double.parseDouble(exScore);

					}

					if (score >= 60)
					{

						testPass++;
						scAverage = score + scAverage;
						testNumber++;

					}

					else
					{

						testFail++;
						scAverage = score + scAverage;
						testNumber++;

					}

					again = JOptionPane.showConfirmDialog (null, "Enter another student score?");

				}while (again == JOptionPane.YES_OPTION);


				average = scAverage / testNumber;
				result = exName + "\n\nAverage Score: " + end.format(average) + "\n Number Passed: " + testPass + "\n Number Failed: " + testFail;
				JOptionPane.showMessageDialog (null, result);

				again = JOptionPane.showConfirmDialog (null, "Process another set of exam scores?");

			}

		}while (again == JOptionPane.YES_OPTION);
	}
}