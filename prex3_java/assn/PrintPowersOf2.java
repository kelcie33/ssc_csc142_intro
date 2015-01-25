/*
 * Name: Kelcie Feeney
 * Course Number: CSC142
 * Date: 1/25/15
 * Assignment: Practice Exercises 3
 */

import java.util.*;

public class PrintPowersOf2 {
	
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		// Obtain value from console
		int console_number = console.nextInt();
		
		// Call static function to print all numbers
		printPowersOf2(console_number);
		
		// Stop reading the console
		console.close();
	}
	
	/*
	 * accepts a maximum number as an argument 
	 * and prints each power of 2 from 0 up to that maximum power
	 */
	public static void printPowersOf2(int n) {

		// Print out each number, boxed by square brackets
		for(int i = 0; i <= n; i++) {
			System.out.print((int)Math.pow(2,i) + " ");
		}
		
	}
	
}