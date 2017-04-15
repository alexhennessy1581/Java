// **************************************************************************************
// CheckDate.java
// Author: Alexandra Hennessy
// Purpose: program that checks to see if a date entered by the user is a valid date in
// 3rd-millenium date.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (Austin) in the design, construction, and debugging of this source code.
// **************************************************************************************

import java.util.Scanner;

public class CheckDate
{
	public static void main(String[] args)
	{
		// data input from user
		int month, day, year;

		// number of days in user input month
		int daysPerMonth;

		// true if input from user is valid
		boolean isValidDay, isValidMonth, isValidYear, isValidDate;

		// true if user's year is a leap year
		boolean isLeapYear;

		// output message
		String validDateStr;

		Scanner scan = new Scanner(System.in);

		//Get integer month, day, and year from user

		System.out.print("Enter month of year (1 - 12): ");
		month = scan.nextInt();

		System.out.print("Enter day of year (1 - 31): ");
		day = scan.nextInt();

		System.out.print("Enter year (2000 - 2999): ");
		year = scan.nextInt();
		
		System.out.println("");

		//Check to see if month is valid

		isValidMonth = (month >= 1 && month <= 12);

		//Check to see if year is valid

		isValidYear = (year >= 2000 && year <= 2999);

		//Determine whether it's a leap year

		if (year % 4 == 0 && year % 100 !=0)
		{
			isLeapYear = true;
		}

		else if (year % 400 == 0)
		{
			isLeapYear = true;
		}

		else
		{
			isLeapYear = false;
		}

		//Determine number of days in month

		switch(month)
		{
		// February
		case 2:
			if(isLeapYear == true)
			{
				daysPerMonth = 29;
			}
			else
			{
				daysPerMonth = 28;
			}
			break;
			
			//April
		case 4:
			{
				daysPerMonth = 30;
			}
			
			//June
		case 6:
			{
				daysPerMonth = 30;
			}
			break;

			//September
		case 9:
			{
				daysPerMonth = 30;
			}
			break;

			
			//November
		case 11:
			{
				daysPerMonth = 30;
			}
			break;
			
			default:
			{
				daysPerMonth = 31;
			}
		}

		//User number of days in month to check to see if day is valid
		
		if (day <= daysPerMonth)
		{
			isValidDay = true;
		}
		else
		{
			isValidDay = false;
		}
		
		//Determine whether date is valid and print appropriate message
		
		if (isValidDay == true && isValidMonth == true && isValidYear == true)
		{
			isValidDate = true;
		}
		else
		{
			isValidDate = false;
		}
		
		if(isValidDate == true && isLeapYear == true)
		{
			validDateStr = ("Input Date: " + month + "/" + day + "/" + year + "\nThe date is valid" + "\nThe year is a leap year.");
		}
		else if (isValidDate == true && isLeapYear == false)
		{
			validDateStr = ("Input Date: " + month + "/" + day + "/" + year + "\nThe date is valid" + "\nThe year is not a leap year.");
		}
		else
		{
			validDateStr = ("Input Date: " + month + "/" + day + "/" + year + "\nThe year is not a leap year.");
		}

		System.out.println(validDateStr);
		
		scan.close();
	}
}