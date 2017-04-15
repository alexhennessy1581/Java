	// *************************************************************************
	// VoteCounterPanel.java
	// Author: Alexandra Hennessy
	// Purpose: Panel for the GUI that tallies votes for two candidates,
	// Bill and Ted. And resets the votes to 0 when Reset button is pressed.
	// Code Integrity:
	// I certify that this program is my own source code.
	// I received help from:
	// (Austin) in the design, construction, and debugging of this source code.
	//**************************************************************************
	
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing. *;
	
	public class VoteCounterPanel extends JPanel
	{
		//Variables
		private int votesForBill, votesForTed, countReset;
		private JButton bill, ted, countVt;
		private JLabel labelBill, labelTed, genMessOne, genMessTwo;
		
	//-------------------------------------------------
	// Constructor: Sets up the GUI.
	//-------------------------------------------------
	
		public VoteCounterPanel()
		{
			// Everything for Bill
			votesForBill = 0; // sets the count to start at zero.
			bill = new JButton("Vote for Bill"); // sets the text for what's on the button
			bill.addActionListener(new VoteButtonListener());
			labelBill = new JLabel("Votes for Bill: " + votesForBill); // sets the text for the JLabel
			add(bill); // adds the button to the GUI interface
			add(labelBill); // adds the JLabel to the GUI interface
			
			// Everything for Ted
			votesForTed = 0; // sets the count to start at zero.
			ted = new JButton("Vote for Ted");  // sets the text for what's on the button
			ted.addActionListener(new VoteButtonListener());
			labelTed = new JLabel("Votes for Ted: " + votesForTed); // sets the text for the JLabel
			add(ted);// adds the button to the GUI interface
			add(labelTed); // adds the JLabel to the GUI interface
			
			// Everything for Reset button and new JLabels
			countReset = 0; // sets the count to start at zero.
			countVt = new JButton("Reset"); // sets the text for what's on the button
			countVt.addActionListener(new VoteButtonListener());
			genMessOne = new JLabel("  ... "); // sets the beginning text for the JLabel
			genMessTwo = new JLabel("  ... "); // sets the beginning text for the JLabel
			add(genMessOne); // adds the JLabel to the GUI interface
			add(genMessTwo); // adds the JLabel to the GUI interface
			add(countVt);// adds the button to the GUI interface
			
			// GUI color and size
			setPreferredSize(new Dimension(100, 200));
			setBackground(Color.cyan);
		
		}
		
	//********************************************************
	// Represents a listener for button push (action) events
	//********************************************************
		
		private class VoteButtonListener implements ActionListener
		{
	
			//----------------------------------------------------------
			// Updates the appropriate vote counter when a
			// button is pushed for one of the candidates and the reset.
			//-----------------------------------------------------------
				
				public void actionPerformed(ActionEvent event)
				{
					
					//---------------------------------------------------
					// Sets up the ActionListener events for all buttons
					//---------------------------------------------------
					
						if (event.getSource( ) == bill) // what happens when the vote bill button is pressed
						{
							votesForBill++; // keeps adding 1 to each time the button for bill is pressed
							labelBill.setText("Votes for Bill: " + votesForBill); // sets the text that appears in JLabel
							
						}
						
						else if (event.getSource() == ted) // what happens when the vote ted button is pressed
						{
							votesForTed++; // keeps adding 1 to each time the button for ted is pressed
							labelTed.setText("Votes for Ted: " + votesForTed); // sets the text that appears in JLabel
						
						}
							
						else // what happens when the vote reset button is pressed
						{
							votesForBill = countReset; // makes bill's count # to zero
							votesForTed = countReset; // makes ted's count # to zero
							labelTed.setText("Votes for Ted: " + countReset); // sets the text that appears in JLabel
							labelBill.setText("Votes for Bill: " + countReset); // sets the text that appears in JLabel
							
						}
						
								//---------------------------------------------------
								// Setting up the if, else if, else text statements 
								// that will appear when an event is met
								//---------------------------------------------------
						
						{
							if (votesForBill > votesForTed) // what message appears: if bill is ahead in the vote count
							{
								genMessOne.setText("Bill is ahead "); // sets the text that appears in JLabel
								genMessTwo.setText(" in the vote count!"); // sets the text that appears in JLabel
							}
							
							else if (votesForBill < votesForTed) // what message appears: if ted is ahead in the vote count
							{
								genMessOne.setText("Ted is ahead "); // sets the text that appears in JLabel
								genMessTwo.setText(" in the vote count!"); // sets the text that appears in JLabel
							}
							
							else // what message appears: if bill and ted are tied in the vote count
							{
								genMessOne.setText("Bill and Ted "); // sets the text that appears in JLabel
								genMessTwo.setText(" are tied!"); // sets the text that appears in JLabel
							}
						}
				}
		}
	}