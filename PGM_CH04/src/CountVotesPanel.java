// ************************************************************
// CountVotesPanel.java
// Author: Alexandra Hennessy
// Purpose:Demonstrates a graphical user interface and event listeners to
// tally votes for two candidates: Bill and Ted.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (Austin) in the design, construction, and debugging of this source code.
// ************************************************************

	import java.awt.*;
	import java.awt.event.*;
	import javax. swing. *;
	
public class CountVotesPanel extends JPanel
{ 

		private int votesForBill;
		private JButton bill;
		private JLabel labelBill;
		
		private int votesForTed;
		private JButton ted;
		private JLabel labelTed;


		// ------------------------------------------------
		// Constructor: Sets up the GUI.
		// ------------------------------------------------

		public CountVotesPanel()

		{

			votesForBill = 0;
			bill = new JButton("Vote for Bill");
			bill.addActionListener(new BillButtonListener());
			labelBill = new JLabel("Votes for Bill: " + votesForBill);
			add(bill);
			add(labelBill);
			votesForTed = 0;
			ted = new JButton("Vote for Ted");
			ted.addActionListener(new TedButtonListener());
			labelTed = new JLabel("Votes for Ted: " + votesForTed);
			add(ted);
			add(labelTed);
			setPreferredSize(new Dimension(300, 80));
			setBackground(Color.cyan);

		}
	
				// **************************************************
				// Represents a listener for button push (action) events
				// **************************************************

			private class BillButtonListener implements ActionListener
			{

				//---------------------------------------------
				// Updates the counter and label when Vote for Bill
				// button is pushed
				//---------------------------------------------

				public void actionPerformed(ActionEvent event)
				{
		
					votesForBill++;
					labelBill.setText("Votes for Bill: " + votesForBill);
				}
		
			}
			// **************************************************
			// Represents a listener for button push (action) events
			// **************************************************

			private class TedButtonListener implements ActionListener
			{

			//---------------------------------------------
			// Updates the counter and label when Vote for Ted
			// button is pushed
			//---------------------------------------------

			public void actionPerformed(ActionEvent event)
				{
					votesForTed++;
					labelTed.setText("Votes for Ted: " + votesForTed);
				}
			}

	}