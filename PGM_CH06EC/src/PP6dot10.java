// **************************************************************************************
// PP6dot10.java or PP6.10.java
// Author: Alexandra Hennessy
// Purpose: Your output should display all twelve days of Christmas, beginning with the first day of Christmas and
// ending with the twelfth day of Christmas
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (Austin) in the design, construction, and debugging of this source code.
// **************************************************************************************

public class PP6dot10 
{
	//-----------------------------------------------------------------
	// Reads a grade from the user and prints comments accordingly.
	//-----------------------------------------------------------------
	public static void main(String[] args)
	{

		int song = 13;
		song--;


		switch (song)
		{

		case 12:
			System.out.println("On the 1st day of Christmas," +"\nmy true love gave to me," 
					+ "\nA partridge in a pear tree.");

		case 11:
			System.out.println ("\nOn the 2nd day of Christmas," + "\nmy true love gave to me" 
					+ "\nTwo turtle doves, and" + "\nA partridge in a pear tree.");

		case 10:
			System.out.println ("\nOn the 3rd day of Christmas," + "\nmy true love gave to me" + "\nThree French hens," 
					+ "\nTwo turtle doves, and" + "\nA partridge in a pear tree.");
			
		case 9:
			System.out.println ("\nOn the 4th day of Christmas," + "\nmy true love gave to me"+ "\nFour calling birds," 
					+ "\nThree French hens," + "\nTwo turtle doves, and" + "\nA partridge in a pear tree.");

		case 8:
			System.out.println ("\nOn the 5th day of Christmas," + "\nmy true love gave to me" + "\nFive golden rings,"
					+ "\nFour calling birds," + "\nThree French hens,"
					+ "\nTwo turtle doves, and" + "\nA partridge in a pear tree.");
			
		case 7:
			System.out.println ("\nOn the 6th day of Christmas," + "\nmy true love gave to me" + "\nSix geese a-laying," 
					+ "\nFive golden rings," + "\nFour calling birds," + "\nThree French hens,"
					+ "\nTwo turtle doves, and" + "\nA partridge in a pear tree.");

		case 6:
			System.out.println ("\nOn the 7th day of Christmas," + "\nmy true love gave to me" + "\nSeven swans a-swimming," 
					+ "\nSix geese a-laying," + "\nFive golden rings," + "\nFour calling birds," + "\nThree French hens,"
					+ "\nTwo turtle doves, and" + "\nA partridge in a pear tree.");

		case 5:
			System.out.println ("\nOn the 8th day of Christmas," + "\nmy true love gave to me" + "\nEight maids a-milking," 
					+ "\nSeven swans a-swimming," + "\nSix geese a-laying," + "\nFive golden rings,"
					+ "\nFour calling birds," + "\nThree French hens," + "\nTwo turtle doves, and" + "\nA partridge in a pear tree.");

		case 4:
			System.out.println ("\nOn the 9th day of Christmas," + "\nmy true love gave to me" + "\nNine ladies dancing,"
					+ "\nEight maids a-milking," + "\nSeven swans a-swimming," + "\nSix geese a-laying," + "\nFive golden rings,"
					+ "\nFour calling birds," + "\nThree French hens," + "\nTwo turtle doves, and" + "\nA partridge in a pear tree.");

		case 3:
			System.out.println ("\nOn the 10th day of Christmas," + "\nmy true love gave to me" + "\nTen lords-a-leaping," + 
					"\nNine ladies dancing," + "\nEight maids a-milking," + "\nSeven swans a-swimming," + "\nSix geese a-laying," + "\nFive golden rings,"
					+ "\nFour calling birds," + "\nThree French hens," + "\nTwo turtle doves, and" + "\nA partridge in a pear tree.");

		case 2:
			System.out.print("\nOn the 11th day of Christmas," + "\nmy true love gave to me" + "\nEleven pipers piping," 
					+ "\nTen lords-a-leaping," + "\nNine ladies dancing," + "\nEight maids a-milking," 
					+ "\nSeven swans a-swimming," + "\nSix geese a-laying," + "\nFive golden rings,"
					+ "\nFour calling birds," + "\nThree French hens," + "\nTwo turtle doves, and" + "\nA partridge in a pear tree.");
		
		case 1:
			System.out.print("\n\nOn the 12th day of Christmas,"  + "\nmy true love gave to me" + "\nTwelve drummers drumming," 
					+ "\nEleven pipers piping," + "\nTen lords-a-leaping," + "\nNine ladies dancing," + "\nEight maids a-milking," 
					+ "\nSeven swans a-swimming," + "\nSix geese a-laying," + "\nFive golden rings,"
					+ "\nFour calling birds," + "\nThree French hens," + "\nTwo turtle doves, and" + "\nA partridge in a pear tree.");
			
		default:
			System.out.println ();
		}
	}
}