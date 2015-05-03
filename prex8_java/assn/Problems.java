import java.util.Scanner;

public class Problems {
	
	
	public static void main (String[] args) {

		// Problem #2
		String testInput = "5 7 2 8 9 10 12 98 7 14 20 22";
		Scanner testScanner = new Scanner(testInput);
		evenNumbers(testScanner);
		
		// Problem #5
		// Not able to finish this problem
	}
	
	/****
	 * evenNumbers checks input from Scanner s
	 * and prints information about the numbers read from there.
	 * @param s: Scanner, possibly from an input file
	 */
	public static void evenNumbers(Scanner s) {
		int numNumbers = 0;
		int sumNumbers = 0;
		int numEvenNumbers = 0;
		
		while( s.hasNextInt() ) {
			int n = s.nextInt();
			numNumbers = numNumbers + 1;
			sumNumbers = sumNumbers + n;
			if( n % 2 == 0 ) { // check if even
				numEvenNumbers = numEvenNumbers + 1;
			}
		}
		
		String printStr1 = String.format("%d numbers, sum = %d", 
				numNumbers, sumNumbers);
		System.out.println(printStr1);
		String printStr2 = String.format("%d evens (%.2f%%)", 
				numEvenNumbers, 
				100 * numEvenNumbers / (float)numNumbers);
		System.out.println(printStr2);
		
	}
}