// ****************************************************************************
// File: Project: PGM_CH01 and Class: TriviaPart2
// Date: 02/09/2015
// Author: Alexandra Hennessy
// Purpose: The following main method prints out questions and answers to trivia questions with white space.
// Code Integrity: I certify that this program is my own source code.
// I received help from: (no one) in the design, construction, and debugging of this source code.
// ****************************************************************************

public class TriviaPart2
{

 //-------------------------------------------------
 // The following main method prints out
 // answers to trivia questions
 // ------------------------------------------------- 

	public static void main(String[] args)
	
	{ 
		System.out.println("1. Who is credited as the first programmer in the modern era?");
		
		//Answer found at: http://www.todayifoundout.com/index.php/2011/02/in-1842-ada-lovelace-wrote-the-worlds-first-computer-program/
		System.out.println("Ada Lovelace was the world’s first computer programmer all the way back in the mid-1800s, writing the world’s first computer program in 1842.");
		
		System.out.println(""); //whitespace
		
		System.out.println("2. What is the most popular programming language in the world today?");
		
		//Answer found at: http://www.tiobe.com/index.php/content/paperinfo/tpci/index.html
		System.out.println("The C Programming Language.");
		
		System.out.println(""); //whitespace
		
		System.out.println("3. What is the longest movie ever made?");
		
		//Answer found at: http://geektyrant.com/news/72-minute-trailer-for-the-longest-movie-ever-made
		System.out.println("A trailer has been released for the longest movie ever made. The movie is called Ambiancé, and it's a 720-hour long film. That's 30 days. The trailer for the film alone is 72-minutes long.");
		
		System.out.println(""); //whitespace
		
		System.out.println("4. What movie has received the most Oscars?");
		
		//Answer found at: http://www.filmsite.org/oscars2.html
		System.out.println("Three films have won 11 Academy Awards. They are Ben-Hur (1959), Titanic (1997), and The Lord of the Rings: The Return of the King (2003)");
	
		System.out.println(""); //whitespace
		
		System.out.println("5. What is oldest national park in the United States?");
		
		//Answer found at: http://www.britannica.com/EBchecked/topic/652774/Yellowstone-National-Park
		System.out.println("Yellowstone National Park is the oldest national park in the United States.");
	}
	/* 
	* a.shown in the beginning of program and end of program.
	* 
	* b. whitespace is: System.out.printline (""); this allows the eye to rest and makes it much easier to read. 
	* 
	* c. Error message: 
	* 	  Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	* 	  Syntax error on token "/", @ expected 
	* 	  Answer cannot be resolved to a type found cannot be resolved to a type
	*     Syntax error on token ":", ; expected
	*     
	*     at TriviaPart2.main(TriviaPart2.java:27)
	*   
	*    Reason: code can not be executed without both // for comment, because without both // the script is waiting for a command that is not there.
	* 
	* d. There is no error because a comment is a comment.
	* 	  
	* e. Documentation Guidelines violations in code: Using the /(star symbol) (star symbol)/ without conforming to the javadoc.
	*/
}