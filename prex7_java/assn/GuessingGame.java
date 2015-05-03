/*
 * Name: Kelcie Feeney
 * Course Number: CSC142
 * Date: 2/22/15
 * Assignment: Practice Exercises 7
 */

import java.util.Scanner;

public class GuessingGame {

	/****
	 * main is the entry point for GuessingGame.  It sets up the Scanner object,
	 * displays the rules and requests more guessing games.
	 * @param args: not used
	 */
	public static void main(String[] args) {
		final int maxNumber = 100;

		Scanner console = new Scanner(System.in);
		boolean doneAllGames = false;
		String userResponse; // Set by user input

		displayRules(maxNumber);
		while( !doneAllGames ) {
			System.out.print("Do you want to play a game? (y/n): ");
			userResponse = console.next();
			if( userResponse.compareToIgnoreCase("y") == 0 ) {
				playGame(console, maxNumber);
			}
			else {
				System.out.println("Thank you for playing.");
				doneAllGames = true;
			}
		}
	}

	/****
	 * playGame runs a guessing game.  It determines the secret number,
	 * processes the user number and requests more guesses.
	 * @param console: Scanner for console input
	 * @param maxNumber: Maximum number for secretNumber
	 */
	public static void playGame(Scanner console, int maxNumber) {
		boolean done = false;
		int secretNumber = (int)(Math.random() * maxNumber + 1);
		int userNumber; // Set by user input
		int userGuesses = 0;
		while( !done ) {
			System.out.print("Can you guess the number?: ");
			userNumber = console.nextInt();
			userGuesses = userGuesses + 1;
			done = processUserNumber(secretNumber, userNumber, userGuesses);
		}		
	}

	/****
	 * processUserNumber checks whether secretNumber and userNumber
	 * are a match or are not a match.
	 * @param secretNumber: Random number to be matched
	 * @param userNumber: User number that attempts to match
	 * @param userGuesses: Number of attempts
	 * @return: Result of matching
	 */
	public static boolean processUserNumber(int secretNumber,
			int userNumber, int userGuesses) {
		
		boolean done = false;
		
		if( secretNumber > userNumber ) {
			System.out.println("Incorrect.  The correct answer is higher.");
		}
		else if( secretNumber < userNumber ) {
			System.out.println("Incorrect.  The correct answer is lower.");
		}
		else {
			System.out.println("Correct.  The correct answer is " + secretNumber + ".");
			System.out.println("This took you " + userGuesses + " tries.");
			done = true;
		}

		return done;
	}

	/****
	 * displayRules shows the guessing game rules.
	 * @param maxNumber: Maximum number for secretNumber
	 */
	public static void displayRules(int maxNumber) {
		System.out.println("Let's play a guessing game together.");
		System.out.println("The program generates a random number between 1 and " + maxNumber + ".");
	}
	
}