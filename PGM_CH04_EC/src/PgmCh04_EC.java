// ****************************************************************************
// File: PgmCh04_EC.java
// Date: 03/13/2015
// Author: Alexandra Hennessy
// Purpose: Create a GUI that displays first name, last name, and a randomly generated phone #  
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (Austin) in the design, construction, and debugging of this source code.
// ****************************************************************************

	import javax.swing.JFrame;
	
public class PgmCh04_EC

{

// --------------------------------------------
// Creates the main program frame.
// --------------------------------------------

	public static void main(String[] args)
	{
		
		JFrame frame = new JFrame("PgmCh04_EC");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PgmCh04_EC_Panel panel = new PgmCh04_EC_Panel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}