// **************************************************************************
// PayDay.java
// Author: Alexandra Hennessy
// Purpose: Determine whether a date entered by the user is a valid
// 3rd-millenium date.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (Austin) in the design, construction, and debugging of this source code.
// **************************************************************************
import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class PayDay
{
	//-----------------------------------------------------------------
	// Determines if the value input by the user is even or odd.
	// Uses multiple dialog boxes for user interaction.
	//-----------------------------------------------------------------
	
	public static void main(String[] args)
	{
		double again;
		do
		{
			String name, hrs, paid, result;
			double hours, pay, over, standardPay, totalPay, overHours;

			NumberFormat dollars = NumberFormat.getCurrencyInstance();
			
			name = JOptionPane.showInputDialog ("Employee Name: ");
			hrs = JOptionPane.showInputDialog ("Total hours worked this week: ");
			paid = JOptionPane.showInputDialog ("Employee hourly pay rate: ");
			hours = Double.parseDouble(hrs);
			pay = Double.parseDouble(paid);

			if(hours <= 40)
			{
				over = 0;
				standardPay = (hours * pay);
				totalPay = standardPay;
			}
			
			else
			{
				overHours = (hours - 40);
				over = (overHours * pay) * 1.5;
				standardPay = (hours - overHours) * pay;
				totalPay = over + standardPay;
			}

			result = "Weekly pay for:  " + name + "\n\nStandard Pay: " + dollars.format(standardPay) + "\nOvertime Pay: " + dollars.format(over) + "\nTotal Pay: " + dollars.format(totalPay);
			JOptionPane.showMessageDialog (null, result);		
			again = JOptionPane.showConfirmDialog (null, "Process another Employee's Time and Rate?");
		} while (again == JOptionPane.YES_OPTION);
	}
}