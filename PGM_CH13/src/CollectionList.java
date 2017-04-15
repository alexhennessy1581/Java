// **********************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: CollectionList.java
// Date: 11/23/20153
// Purpose: PGM_CH13-CollectionList: Defines a class that represents a list of integers.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler and Damon Leson.
// in the design, construction, and debugging of this source code.
// **********************************************************************************

public class CollectionList

{
	private ObjectNode front; //first node in list

	//-----------------------------------------
	// Constructor. Initially list is empty.
	//-----------------------------------------
	public CollectionList()
	{
		front = null;
	}

	//-----------------------------------------
	// Adds given object to front of list.
	//-----------------------------------------
	public void addToFront(Object obj)
	{
		front = new ObjectNode(obj,front);
	}

	//-----------------------------------------
	// Adds given object to end of list.
	//-----------------------------------------
	public void addToEnd(Object obj)
	{
		ObjectNode newnode = new ObjectNode(obj,null);

		//if list is empty, this will be the only node in it
		if (front == null)
			front = newnode;

		else
		{
			//make temp point to last thing in list
			ObjectNode temp = front;
			while (temp.next != null)
				temp = temp.next;

			//link new node into list
			temp.next = newnode;
		}
	}

	//-----------------------------------------
	// Removes the first node from the list.
	// If the list is empty, does nothing.
	//-----------------------------------------
	public void removeFirst()
	{
		if (front != null)
			front = front.next;
	}

	//-----------------------------------------
	// Removes the last node from the list.
	// If the list is empty, does nothing.
	//-----------------------------------------
	public void removeLast()
	{
		if (front != null)
			front = front.next;
	}

	//------------------------------------------------
	// Prints the list elements from first to last.
	//------------------------------------------------
	public void displayList()
	
	{
		int count = 0;
		System.out.println("\n----------------------------------");
		System.out.print("List elements: ");
		ObjectNode temp = front;
		
		while (temp != null)
		{
			count++;
			System.out.print("\n\n" + count + ". " + temp.obj + " ");
			temp = temp.next;
		}
		System.out.println("\n----------------------------------\n");
	}

	//*****************************************************************
	// An inner class that represents a node in the object list.
	// The public variables are accessed by the CollectionList class.
	//*****************************************************************
	private class ObjectNode
	{
		public Object obj; //value stored in node
		public ObjectNode next; //link to next node in list

		//----------------------------------------------------------------------
		// Constructor; sets up the node given a value and ObjectNode reference
		//----------------------------------------------------------------------
		public ObjectNode(Object obj, ObjectNode next)
		{
			this.obj = obj;
			this.next = next;
		}
	}
}