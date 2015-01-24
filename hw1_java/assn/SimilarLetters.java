
/*
 * Name: Kelcie Feeney
 * Course Number: CSC142
 * Date: 1/24/15
 * Assignment: Homework 1
 */

/*
 * Reflections: This exercise was a good learning experience for laying out
 * the program across several functions.  I had three main functions that
 * controlled the program.  They each called different functions to print out
 * the letter contents.  I felt this was a great time saver and keeps all the
 * information straight if we needed to write a lot more letters.  This idea
 * could be used for sending sales letters from a website, for example.
 * The hard part of this exercise was having the right line spacing between
 * sections.  I was not used to reusing so many functions, so sometimes
 * the output didn't look right.  But after some work, I figured it out.
 * This took me about an hour to complete.
 */

public class SimilarLetters {	
	
	public static void main(String[] args) {
		PrintAllLinesParents();
		PrintAllLinesFriends();
		PrintAllLinesBrother();
	}
	
	/* you might write to your parents to tell them about your classes,
	 * your friends, and your vacation plans
	 */
	public static void PrintAllLinesParents() {
		System.out.println("Letter to parents:");
		System.out.println("---------------------");
		System.out.println();
		PrintIntro();

		PrintClasses();
		PrintFriends();
		PrintVacation();
		
		PrintOutro();
	}
	
	/* you might write to a friend about
	 * your relationships, your classes, and your hobbies
	 */
	public static void PrintAllLinesFriends() {
		System.out.println("Letter to friends:");
		System.out.println("---------------------");
		System.out.println();
		PrintIntro();

		PrintRelationships();
		PrintClasses();
		PrintHobbies();
		
		PrintOutro();
	}
	
	/* you might write to your brother about your hobbies, your friends, 
	 * and your vacation plans. 
	 */
	public static void PrintAllLinesBrother() {
		System.out.println("Letter to brother:");
		System.out.println("---------------------");
		System.out.println();
		PrintIntro();

		PrintHobbies();
		PrintFriends();
		PrintVacation();
		
		PrintOutro();
	}
	
	public static void PrintIntro() {
		System.out.println("Hi! I hope you're doing great.");
		System.out.println("The weather here is really nice.");
		System.out.println("I miss you very much.");
		System.out.println(); // Blank space
	}
	
	public static void PrintOutro() {
		System.out.println(); // Blank space
		System.out.println("I hope to hear back from you soon.");
		System.out.println("Love, Kelcie");
		System.out.println(); // Blank space
		System.out.println(); // Blank space
	}
	
	public static void PrintClasses() {
		System.out.println("My classes are going really well!");
	}
	
	public static void PrintFriends() {
		System.out.println("My friends are doing great!");
	}
	
	public static void PrintVacation() {
		System.out.println("I can't wait to go camping on my vacation.");
	}
	
	public static void PrintRelationships() {
		System.out.println("My boyfriend Andrew is doing really well.");
	}
	
	public static void PrintHobbies() {
		System.out.println("I started reading a new book this week.");
	}
	
}