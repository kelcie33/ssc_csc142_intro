
/*
 * Name: Kelcie Feeney
 * Course Number: CSC142
 * Date: 2/6/15
 * Assignment: Homework 2
 */

// This program is meant to perform simple mathematical calculations
// However, it has several bugs... (11, to be exact)
// Your job is to debug the program so that it works as intended

import java.util.*;

public class Calculator {

	/****
	 * Function main was updated to correct 3 bugs (#1-3)
	 * 1. Missing return type, now using "void" return type
	 * 2. Missing java.util.* import for Scanner, now it is added above
	 * 3. Commented out displayMenu, now it is un-commented
	 * @param args
	 */
	public static void main(String[] args) {
		boolean done = false;
		Scanner console = new Scanner (System.in);
		while (!done){
			displayMenu();
			String selection = getUsersSelection(console);
			done = processSelection(selection, console);
		}
		System.out.println("Thank you for using this program");
	}

	/****
	 * Function processSelection was updated to correct 2 bugs (#4-5)
	 * 4. Variable "result" was not needed, now it is removed
	 * 5. Logic was not using "Q" for exit condition, now it is
	 * @param selection
	 * @param console
	 * @return
	 */
	private static boolean processSelection(String selection, Scanner console) {
		boolean done = false;
		if (!selection.equalsIgnoreCase("Q")){
			if (selection.equalsIgnoreCase("U")){
				calculateResults(console);
			}
			else if (selection.equalsIgnoreCase("H")){
				//nothing to do here...let the code loop around one more time
			}
			else {
				System.out.println("Incorrect entry...try again!");
			}
		}
		else {
			done = true;
		}
		return done;
	}

	/****
	 * Function calculateResults was updated to correct 5 bugs (#6-10)
	 * 6. Variable "result" was type int, but is now double to allow decimal math
	 *     which is a common feature of calculators
	 * 7. Line in "operator == "-"" section was missing semi-colon, now it is added
	 * 8. Line in "operator == "/"" section was using wrong symbol, now it is right
	 * 9. Line in "isOperatorValid" section was missing "+" before result, now it is right
	 * 10. Line in "operator == "-"" section was using addition, now it is right
	 * 
	 * Also, fixed 1 spelling typo that is not really a bug
	 * a. Function name has typo, now it is corrected
	 * 
	 * @param console
	 */
	//NOTE: the method header below is fine -- it contains NO BUG!
	private static void calculateResults(Scanner console) {
		displayCalculatorInstructions();
		double operand1 = console.nextDouble();
		char operator = console.next().charAt(0);
		double operand2 = console.nextDouble();
		double result = 0.0;
		boolean isOperatorValid = true;
		if (operator == '+'){
			result = operand1 + operand2;
		}
		else if (operator == '-'){
			result = operand1 - operand2;
		}
		else if (operator == '*'){
			result = operand1 * operand2;
		}
		else if (operator == '/'){
			if (operand2 != 0.0){
				result = operand1 / operand2;
			}
			else {
				result = Double.NaN;
			}
		}
		else if (operator == '^'){
			result = Math.pow(operand1, operand2);
		}
		else {
			isOperatorValid = false;
		}
		if (isOperatorValid){
			System.out.println(operand1 +" "+operator+" "+operand2+" = "+result);//would be nice use printf to control the precision of result 
		}
	}

	/****
	 * Function displayCalculatorInstructions has no bugs
	 */
	private static void displayCalculatorInstructions() {
		System.out.println("Enter a mathematical expression to evaluate");
		System.out.println("Valid operations are: +, -, /, *, ^ for power");
		System.out.println("Expression are entered with spaces between the values and operator");
		System.out.println("Here is the valid format:");
		System.out.println("\t<value><space><operator><space><value>");
		System.out.print("Your expression: ");
	}
	

	/****
	 * Function getUsersSelection has 1 bug (#11)
	 * 11. Variable "selection" had a type mismatch, now using Console.Next
	 *      to read a token from the user input
	 * @param console
	 * @return
	 */
	private static String getUsersSelection(Scanner console) {
		String selection = console.next();
		return selection;
	}

	/****
	 * Function displayMenu has no bugs
	 */
	private static void displayMenu() {
		System.out.println("Enter one these options:");
		System.out.println("\tH for Help");
		System.out.println("\tU for using calculator");
		System.out.println("\tQ for exiting this program");
		System.out.print("Your selection: ");
	}

}