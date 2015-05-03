
/*
 * Name: Kelcie Feeney
 * Course Number: CSC142
 * Date: 2/27/15
 * Assignment: Homework 3
 */


import java.util.Scanner;

public class Birthday {

	/****
	 * main is the entry point for the program.  It reads user responses,
	 * prints out today and birthday and checks whether user already
	 * celebrated birthday
	 * @param args: not used
	 */
	public static void main(String[] args) {
		
		// Start birthday game with user input
		Scanner c = new Scanner(System.in);		
		StartBirthdayGame(c, false);
		
		// For this assignment I wanted to try something new with Scanners
		// so I am trying to reuse the function based on different
		// scanners to match different things.  The same function is used
		// both for normal running and for test running as well.
		// The lines below are for test running with test strings.
		
		// Start birthday game with test inputs 1
		String testInputs1 = "Kelcie 2 27 3 28";
		StartBirthdayGame(new Scanner(testInputs1), true);
		
		// Start birthday game with test inputs 2
		String testInputs2 = "Kelcie z z 2 27 -1 3 28";
		StartBirthdayGame(new Scanner(testInputs2), true);
		
		// Start birthday game with test inputs 3
		String testInputs3 = "Kelcie 3 28 3 28";
		StartBirthdayGame(new Scanner(testInputs3), true);
		
		// Start birthday game with test inputs 4
		String testInputs4 = "Kelcie 4 1 3 28";
		StartBirthdayGame(new Scanner(testInputs4), true);

	}
	
	/****
	 * StartBirthdayGame is the main logic for the game.  
	 * It reads user responses, prints out today and birthday 
	 * and checks whether user already celebrated birthday
	 * @param c: user input
	 * @param t: determines if we are testing, so we can print test input
	 */
	public static void StartBirthdayGame(Scanner c, boolean t) {
		
		// Define the month names
		final String[] mNames = {
				"January",
				"February",
				"March",
				"April",
				"May",
				"June",
				"July",
				"August",
				"September",
				"October",
				"November",
				"December"
		};
		
		// Define the month lengths
		final int[] mLengths = {
				31,
				28,
				31,
				30,
				31,
				30,
				31,
				31,
				30,
				31,
				30,
				31
		};

		// Print rules and testing status
		displayRules();
		if( t == true ) { // check for testing
			System.out.println("TESTING...");
		}
		
		// Read user name
		System.out.print("Enter your name: ");
		String userName = c.next(); // No input checking
		if( t == true ) { // check for testing
			System.out.println(userName);
		}
		
		// Read today month and day
		int todayM = readCheckUserInt(c, t, 1, 12, "today's month");
		int todayD = readCheckUserInt(c, t, 1, mLengths[todayM-1], "today's day");
		
		// Read birthday month and day
		int bdayM = readCheckUserInt(c, t, 1, 12, "your birthday month");
		int bdayD = readCheckUserInt(c, t, 1, mLengths[bdayM-1], "your birthday day");

		// Print today and birthday
		System.out.println("Today is " + mNames[todayM-1] + " " + todayD );
		System.out.println("Your birthday is on " + mNames[bdayM-1] + " " + bdayD );

		// Check whether user already celebrated birthday
		if( todayM < bdayM || ( todayM == bdayM && todayD < bdayD )) {
			System.out.println("You haven't celebrated your birthday yet this year.");
		}
		else if( todayM == bdayM && todayD == bdayD ) {
			System.out.println("Happy birthday " + userName + "!");
		}
		else {
			System.out.println("You already celebrated your birthday this year.");
		}

		// Add trailing whitespace
		System.out.println("");
	}

	/****
	 * readCheckUserInt prints display string, reads user response
	 * and checks for integer until a valid integer is entered.
	 * @param console: user input
	 * @param t: determines if we are testing
	 * @param min: minimum value for valid integer
	 * @param max: maximum value for valid integer
	 * @param printStr: part of display string
	 * @return: valid integer
	 */
	public static int readCheckUserInt(Scanner console, boolean t,
			int min, int max, String printStr) {
		
		int userResponseInt = 0; // Set by user input
		boolean doneResponse = false; // start reading
		while( !doneResponse ) {
			System.out.print("Enter " + printStr + " (" + min + "-" + max + "): ");

			// We can read userResponse as a string before
			// checking that it contains an integer.
			String userResponse = console.next();
			
			// Not only can Scanner read System.in, but it can also
			// read String variables.  We are looking for integers
			// so we will use the function hasNextInt
			Scanner s = new Scanner(userResponse);
			if( s.hasNextInt() ) {
				int n = s.nextInt();
				if( n >= min && n <= max ) {
					doneResponse = true;
					userResponseInt = n;
				}
				if( t == true ) { // check for testing
					System.out.println(n);
				}
			}
			else {
				System.out.println("Please try again");
			}
		}
		
		return userResponseInt;
	}
	
	/****
	 * displayRules prints rules for the birthday game
	 */
	public static void displayRules() {
		System.out.println("This program accepts the month and day of "
				+ "someone's birthday and determines whether the birthday "
				+ "has already occurred this year or not"); 
	}
}