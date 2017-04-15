// ************************************************************
// CountVotes.java
// Author: Alexandra Hennessy
// Purpose: Demonstrates a graphical user interface and event listeners to
// tally votes for two candidates, Joe and Sam.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (no one) in the design, construction, and debugging of this source code.
// ************************************************************

	import javax.swing.JFrame;
	
public class CountVotes

{

// --------------------------------------------
// Creates the main program frame.
// --------------------------------------------

	public static void main(String[] args)
	{
		
		JFrame frame = new JFrame("Count Votes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new CountVotesPanel());
		frame.pack();
		frame.setVisible(true);
	
	}

}