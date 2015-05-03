/*
 * Name: Kelcie Feeney
 * Course Number: CSC142
 * Date: 2/15/15
 * Assignment: Practice Exercises 6
 */

import java.util.*;

public class Problems {

	public static void main(String[] args) {
		
		// Self-Check Problems 1 (p. 297).
		System.out.println("****************************************");
		System.out.println("Self-Check Problems 1 (p. 297).");
		System.out.println("");
		LogicalTests();
		
		// Self-Check Problems 8 (p. 300)
		System.out.println("");
		System.out.println("****************************************");
		System.out.println("Self-Check Problems 8 (p. 300).");
		System.out.println("");
		System.out.println("DivisibleBySix()");
		System.out.println("Expected w/ 10: DivisibleBySix false, Odd false");
		DivisibleBySix();
		System.out.println("");
		System.out.println("DivisibleBySixFixed()");
		System.out.println("Expected w/ 10: DivisibleBySix false, Odd false");
		DivisibleBySixFixed();

		// Self-Check Problems 15 (p. 302)
		System.out.println("");
		System.out.println("****************************************");
		System.out.println("Self-Check Problems 15 (p. 302)");
		System.out.println("");
		System.out.println("sumTo(10) -- DOESN'T RUN IN ECLIPSE");
		System.out.println("");
		System.out.println("sumToFixed(10)");
		System.out.println("Expected: " + 55);
		System.out.println("Result: " + sumToFixed(10));
		
	}
	
	// Self-Check Problems 1 (p. 297).
	public static void LogicalTests() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter integer x: ");
		int x = s.nextInt();
		System.out.print("Enter integer y: ");
		int y = s.nextInt();
		System.out.print("Enter integer z: ");
		int z = s.nextInt();
		System.out.println("");
		

		// a) z is odd
		System.out.print("a) z is odd: ");
		System.out.print(": ");
		if( z % 2 == 1 ) {
			System.out.println( true );	
		}
		else {
			System.out.println( false );	
		}

		// b) z is not greater than y's square root
		System.out.print("b) z is not greater than y's square root");
		System.out.print(": ");
		if( z <= Math.sqrt(y) ) {
			System.out.println( true );	
		}
		else {
			System.out.println( false );	
		}

		// c) y is positive
		System.out.print("c) y is positive");
		System.out.print(": ");
		if( y > 0 ) {
			System.out.println( true );	
		}
		else {
			System.out.println( false );	
		}

		// d) Either x or y is even, and the other is odd (i.e. if x is even, y is odd or vice versa)
		System.out.print("d) Either x or y is even, and the other is odd (i.e. if x is even, y is odd or vice versa");
		System.out.print(": ");
		if( ( x % 2 == 0 && y % 2 == 1 ) 
				|| ( x % 2 == 1 && y % 2 == 0 )) {
			System.out.println( true );	
		}
		else {
			System.out.println( false );	
		}

		// e) y is a multiple of z
		System.out.print("e) y is a multiple of z");
		System.out.print(": ");
		if ( y % z == 0 ) {
			System.out.println( true );	
		}
		else {
			System.out.println( false );	
		}

		// f) z is not zero
		System.out.print("f) z is not zero");
		System.out.print(": ");
		if ( z != 0 ) {
			System.out.println( true );	
		}
		else {
			System.out.println( false );	
		}

		// g) y is greater in magnitude than z (i.e. disregarding sign)
		System.out.print("g) y is greater in magnitude than z (i.e. disregarding sign");
		System.out.print(": ");
		if ( Math.abs(y) > Math.abs(z) ) {
			System.out.println( true );	
		}
		else {
			System.out.println( false );	
		}

		// h) x and z are of opposite sign
		// Note: The Math.signum method is part of the java library
		// for math functions and is -1 for negative numbers
		// 0 for zero numbers and 1 for positive numbers.
		// It looks like a good candidate for this problem.
		// I looked it up online by searching "java sign function"
		System.out.print("h) x and z are of opposite sign");
		System.out.print(": ");
		if ( Math.signum(x) != Math.signum(z) ) {
			System.out.println( true );	
		}
		else {
			System.out.println( false );	
		}

		// i) y is a nonnegative one-digit number
		System.out.print("i) y is a nonnegative one-digit number");
		System.out.print(": ");
		if ( y >= 0 && y <= 9 ) {
			System.out.println( true );	
		}
		else {
			System.out.println( false );	
		}

		// j) z is nonnegative
		System.out.print("j) z is nonnegative");
		System.out.print(": ");
		if ( z >= 0 ) {
			System.out.println( true );	
		}
		else {
			System.out.println( false );	
		}

		// k) x is even
		System.out.print("k) x is even");
		System.out.print(": ");
		if ( x % 2 == 0 ) {
			System.out.println( true );	
		}
		else {
			System.out.println( false );	
		}

		// l) x is closer in value to y than z is
		System.out.print("l) x is closer in value to y than z is");
		System.out.print(": ");
		if ( Math.abs(x-y) < Math.abs(z-y) ) {
			System.out.println( true );	
		}
		else {
			System.out.println( false );	
		}
		
	}

	/**
	public static int sumTo(int n){

	    for (int i = 1; i <= n; i++){
	        int sum = 0;
	        sum += i;
	    }

	    return sum;

	}
	**/
	
	// Self-Check Problems 15 (p. 302)
	// This method is fixed by moving the first variable "sum" line
	// from inside the if statement to outside the if statement.
	// The original method had two problems:
	// 1. The variable declaration inside the loop made it invisible to the 
	//     return statement, so there would be an error.  Eclipse helped me
	//     find this one because it had me stuck for a little while.
	// 2. The variable initialization inside the loop lost the accumulation
	//     and only kept the last value.  I found this out by testing it out.
	public static int sumToFixed(int n){

        int sum = 0;
	    for (int i = 1; i <= n; i++){
	        sum += i;
	    }
	    
	    return sum;
	    
	}

	public static void DivisibleBySix() {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Type a number: ");
		int number = console.nextInt();
	
		if (number % 2 == 0){
		    if(number % 3 == 0){
		        System.out.println("Divisible by 6.");
		    } else {
		        System.out.println("Odd.");
		    }
		}
	
	}

	// Self-Check Problems 15 (p. 302)
	// This method is fixed by moving the first variable "sum" line
	// from inside the if statement to outside the if statement.
	// The original method had two problems:
	// 1. The variable declaration inside the loop made it invisible to the 
	//     return statement, so there would be an error.  Eclipse helped me
	//     find this one because it had me stuck for a little while.
	// 2. The variable initialization inside the loop lost the accumulation
	//     and only kept the last value.  I found this out by testing it out.

	public static void DivisibleBySixFixed() {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Type a number: ");
		int number = console.nextInt();
	
		if (number % 2 == 0){
		    if(number % 3 == 0){
		        System.out.println("Divisible by 6.");
		    }
	    } else {
	        System.out.println("Odd.");
		}
	
	}
	
}