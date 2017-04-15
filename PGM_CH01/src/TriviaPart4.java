// ****************************************************************************
// File: Project: PGM_CH01 and Class: TriviaPart4
// Date: 02/09/2015
// Author: Alexandra Hennessy
// Purpose: The following main method prints out questions and answers to trivia questions with whitespace.
// Code Integrity: I certify that this program is my own source code.
// I received help from: (no one)in the design, construction, and debugging of this source code.
// ****************************************************************************

public class TriviaPart4
{

 //-------------------------------------------------
 // The following main method prints out
 // answers to trivia questions
 // ------------------------------------------------- 

	public static void main(String[] args)
	
	{ 
		System.out.println("1. What precentage of US homes still has land lines?");
		
		//Answer found at: http://blogs.wsj.com/economics/2013/09/05/about-1-in-3-households-has-no-landline-phone/
		System.out.println("Just under 71% of households had landlines in 2011.");
		
		System.out.println(""); //whitespace
		
		System.out.println("2. How many families have had at least 3 siblings compete in the same Winter Olympics?");
		
		//Answer found at: http://onlyagame.wbur.org/2014/01/23/olympic-dreams-family
		System.out.println("5 families.");
		
		System.out.println(""); //whitespace
		
		System.out.println("3. What countries had 3 siblings competing in the most recent Olympics, and what in what events did they competing?");
		
		//Answer found at: http://onlyagame.wbur.org/2014/01/23/olympic-dreams-family
		System.out.println("In 1960, the French Leduc sisters competed in slalom Alpine skiing. In 1976, a trio of brothers from Argentina all competed in 15 km cross-country skiing. In 1980 when the Stanstny brothers of Czechoslovakia competed in ice hockey. In 2010, siblings Chris, Cathy, and Alison Reed competed in ice dancing, and the Dufour-Lapointe sisters compete in moguls a specific freestyle skiing event for America.");
		
		System.out.println(""); //whitespace
		
		System.out.println("4. Which mobile operating system has the most market share?");
		
		//Answer found at: https://www.netmarketshare.com/operating-system-market-share.aspx?qprid=8&qpcustomd=1
		System.out.println("Android has the most market share at 47.45%");
	
		System.out.println(""); //whitespace
		
		System.out.println("5. What is required in order to get Eclipse to run?");
		
		//Answer found at: https://wiki.eclipse.org/Eclipse/Installation
		System.out.println("Installing Eclipse is relatively easy, but does involve a few steps and software from at least two different sources. Eclipse is a Java-based application and, as such, requires a Java runtime environment (JRE) in order to run.");
		
		System.out.println(""); //whitespace
		
		System.out.println("6. What is the most popular bicycle company in the US?");
		
		//Answer found at: http://www.theactivetimes.com/best-bike-brands
		System.out.println("Trek leads the industry in all categories, including road bikes. It is the most popular bicylce company in the US as of today.");
	}
	/* 
	* a.Error message:
	* 	 Description	Resource	Path	Location	Type 
	* 	 The public type TriviaPartFour must be defined in its own file	
	* 	 TriviaPart4.java	/PGM_CH01/src	
	* 	 line 14	Java Problem
	* 
	* 	Reason: If the to class names are not a match then the code will not have the right path name, which will cause bigger problems down the road.
	* 
	* b. In this case there is no error message  because miss spelling is an operator error, not the computer's.
	* 
	* c.Error message:
	* 	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	*   String literal is not properly closed by a double-quote
	*
	*   at TriviaPart4.main(TriviaPart4.java:25)
	*   
	*   Reason: the end " tells the command that that's the end of the sentence that you want to print out
	* 
	* d. Error Message:
	*	  Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	*	  Syntax error, insert ")" to complete MethodInvocation
	*	  Syntax error, insert ";" to complete BlockStatements
	*	  What cannot be resolved to a type
	*	  Syntax error on token "of", ; expected
	*	  US cannot be resolved to a type
	*	  Syntax error on token "still", ; expected
	*	  has cannot be resolved to a type
	*	  Syntax error on token "land", = expected after this token
	*	  String literal is not properly closed by a double-quote
	*	  Syntax error, insert ": Expression" to complete Expression
	*
	*	  at TriviaPart4.main(TriviaPart4.java:25)
	*
	*    Reason: without the first " the command can not execute the print out line.
	*  
	*  e. Error Message:
	*  	   Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	*	   Syntax error, insert ";" to complete BlockStatements
	*
	*	   at TriviaPart4.main(TriviaPart4.java:25)
	*
	*     Reason: without the ; at the end the command code will not execute the code, because the ; is like an enter.
	*/
}