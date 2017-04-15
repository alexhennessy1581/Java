// **************************************************************************************
// PP6dot24.java or PP6.24.java
// Author: Alexandra Hennessy
// Purpose: Palindrome Tester using Dialog Boxes
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (Austin) in the design, construction, and debugging of this source code.
// **************************************************************************************

import javax.swing.JOptionPane;

public class PP6dot24
{

	public static void main (String[] args)
	{
		String str;
		int left, right, again;

		do
		{
			str = JOptionPane.showInputDialog ("Enter a potential palindrome:");

			left = 0;
			right = str.length() - 1;

			while (str.charAt(left) == str.charAt(right) && left < right)
			{
				left++;
				right--;
			}
			if (left < right)
			{
				JOptionPane.showMessageDialog (null,"The string " + str + " IS NOT a palindrome.");
			}
			else
			{
				JOptionPane.showMessageDialog (null,"The string " + str + " IS a palindrome.");
			}
			again = JOptionPane.showConfirmDialog (null, "Do Another?");
		}while (again == JOptionPane.YES_OPTION);

	}

}