/*
 * Name: Kelcie Feeney
 * Course Number: CSC142
 * Date: 1/25/15
 * Assignment: Practice Exercises 3
 */

import java.util.*;

public class PrintNumbers {
	
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		// Obtain value from console
		int console_number = console.nextInt();
		
		// Call static function to print all numbers
		printNumbers(console_number);
		
		// Stop reading the console
		console.close();
	}
	
	/*
	 * accepts a maximum number as an 
	 * argument and prints each number from 1 up to that maximum
	 */
	public static void printNumbers(int n) {

		// Print out each number, boxed by square brackets
		for(int i = 1; i <= n; i++) {
			System.out.print("[" + i + "] ");
		}
		
	}
	
}