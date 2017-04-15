//*******************************************************************************************************************
// Grades.java 
// Author: Alexandra Hennessy
// Purpose:  Use Student class to get test grades for two students
// and compute averages
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (Austin) in the design, construction, and debugging of this source code.
// ******************************************************************************************************************
	
	import java.util.Scanner;

public  class Grades

{

	//-------------------------------------------------------------------------------------------------------
	// In this exercise you will create two classes: the program Grades.java and its associated class
	// Student.java. The Student class creates Student objects which contain a student’s information and
	// grades, while the Grades class facilitates the input of student information and grades. Student name
	// information and grade calculations are part of the Student class.
	//-------------------------------------------------------------------------------------------------------

	public static void main (String[] args)
	{

		String studentOne, studentTwo;
		
		Scanner scan = new Scanner (System.in);
		
		// get student1 name
		System.out.print("Please enter first student's name: ");
		studentOne = scan.nextLine();
		
		System.out.println(); // space between lines
		
		// get student2 name
		System.out.print("Please enter second student's name: ");
		studentTwo = scan.nextLine();
		
		System.out.println(); // space between lines
		
		// create students
		Student stud1 = new Student(studentOne);
		Student stud2 = new Student(studentTwo);
		
		//input grades and print the average for student1
		stud1.inputGrades();
		
		System.out.println(); // space between lines
		
		stud1.getAverage();
		
		System.out.println(); // space between lines
		
		//input grades and print the average for student2
		stud2.inputGrades();
		
		System.out.println(); // space between lines
		
		stud2.getAverage();
		
		System.out.println(); // space between lines
		
		//print the Student variables directly
		System.out.println("Student 1 => " +stud1);
	
		System.out.println("Student 2 => " +stud2);
		
		scan.close();
	}
}