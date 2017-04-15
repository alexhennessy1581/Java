// ****************************************************************************
// File: BlackJack.java
// Date: 03/06/2015
// Author: Alexandra Hennessy
// Purpose: to create an enumerated type and retrieve information about its
// contents.  
// Code Integrity:
// I certify that this program is my own source code.
// I received help from:
// (no one) in the design, construction, and debugging of this source code.
// ****************************************************************************

// ------------------------------------------------------------------------------------------------------
// BlackJack.java
//
// Recall that enumerated types are special variables that limit a user’s choices; the user can only
// choose from the choices given in the enumerated type. You will work with the enumerated variable’s
// value and its ordinal value. 
// ------------------------------------------------------------------------------------------------------

public class BlackJack
{
	enum Rank {ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king}
		//-----------------------------------------------------------------
		// Creates and uses variables of the Rank  type.
		//-----------------------------------------------------------------
		
	public static void main (String[] args)
	{
		//Variables:
		Rank highCard, faceCard, card1, card2;
		highCard = Rank.ace; // the high card is an ace
		faceCard = Rank.jack; // pick a jack for the face card
		card1 = Rank.seven; // pick a seven for the card one
		card2 = Rank.five; // pick a five for the card two
		int card1Val = 7; // value of card1
		int card2Val = 5; // value of card2
		
		System.out.println("A black-jack hand: " + highCard + " and " + faceCard);
		System.out.println("A two-card hand: " +card1 + " and " + card2);
		System.out.println("Hand value: " + (card1Val + card2Val));
	}
	
}