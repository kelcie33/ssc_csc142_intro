/*
 * Name: Kelcie Feeney
 * Course Number: CSC142
 * Date: 2/8/15
 * Assignment: Practice Exercises 5
 */

public class ReverseWord {
	
	/****
	 * main is the entry point for the program
	 * @param args
	 */
	public static void main(String[] args) {
		reverseWord("Test string sequence"); // IS NOT a palindrome
		reverseWord("Kelcie is good at writing Java code"); // IS NOT a palindrome
		reverseWord("kayak"); // IS a palindrome
		reverseWord("kayak       "); // IS a palindrome
		reverseWord("kayak kayak kayak"); // IS a palindrome
	}
	
	/****
	 * reverseWord processes a string and determines if it is a palindrome
	 * @param OrigString
	 */
	public static void reverseWord(String OrigString) {		
		
		String FwdString = ""; // starts empty
		String BwdString = ""; // starts empty
		
		// Cumulative Text Algorithm to reverse order of OrigString
		// and build BwdString by skipping space characters
		for(int i = OrigString.length() - 1; i >= 0; i--) {
			char c = OrigString.charAt(i);
			if (c != ' ') {
				BwdString += OrigString.charAt(i);
			}
		}		

		// Normal order of OrigString forms FwdString 
		// by skipping space characters
		for(int i = 0; i <= OrigString.length() - 1; i++) {
			char c = OrigString.charAt(i);
			if (c != ' ') {
				FwdString += OrigString.charAt(i);
			}
		}

		// Display the original, forward and backward strings
		System.out.println("The original string was: \"" + OrigString + "\"");
		System.out.println("This forward string was received: \"" + FwdString + "\"");
		System.out.println("This backward string was formed: \"" + BwdString + "\"");
		
		// Determine if the original string was a palindrome
		// which is the same order forwards and backwards
		if(FwdString.equalsIgnoreCase(BwdString)) {
			System.out.println("The original string IS a palindrome!");
		}
		else {
			System.out.println("The original string IS NOT a palindrome!");
		}
		
		// Add new line at end of the program
		System.out.println("");
	}
}