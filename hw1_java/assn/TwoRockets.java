/*
 * Name: Kelcie Feeney
 * Course Number: CSC142
 * Date: 1/24/15
 * Assignment: Homework 1
 */

/*
 * Reflections:This assignment took me a little over an hour to finish. 
 * I had the most difficulty while trying to plan how to build the shapes.
 * After I realized that I can repeat lines to make shapes
 * this assignment became much more enjoyable.
 * 
 */

public class TwoRockets {

	public static void main(String[] args) {
		PrintAllLines();
	}

	public static void PrintAllLines() {
		/*
		 * Question 1: I broke down the shapes of the rocket into sections
		 * of strings, then I reused those sections on other areas of the rocket.
		 * This avoided having to redundantly describe each line separately.
		 * 
		 * Question 2: I had to add the strings together on each line. 
		 * I could not come up with a solution to make one rocket and then
		 * just copy it.
		 */
		
		//print out the rocket head
		System.out.println(RocketCone1() + RocketCone1());
		System.out.println(RocketCone2() + RocketCone2());
		System.out.println(RocketCone3() + RocketCone3());

		//print out the rocket body
		System.out.println(RocketLine() + RocketLine());
		System.out.println(RocketWall() + RocketWall());
		System.out.println(RocketWall() + RocketWall());
		System.out.println(RocketLine() + RocketLine());
		System.out.println(UnitedStr() + UnitedStr());
		System.out.println(StatesStr() + StatesStr());
		System.out.println(RocketLine() + RocketLine());
		System.out.println(RocketWall() + RocketWall());
		System.out.println(RocketWall() + RocketWall());
		System.out.println(RocketLine() + RocketLine());
		
		//print out the rocket tail
		System.out.println(RocketCone1() + RocketCone1());
		System.out.println(RocketCone2() + RocketCone2());
		System.out.println(RocketCone3() + RocketCone3());

	}

	public static java.lang.String RocketCone1() {
		return "   /\\   ";
	}

	public static java.lang.String RocketCone2() {
		return "  /  \\  ";
	}

	public static java.lang.String RocketCone3() {
		return " /    \\ ";
	}

	public static java.lang.String StatesStr() {
		return "|States|";
	}

	public static java.lang.String UnitedStr() {
		return "|United|";
	}

	public static java.lang.String RocketWall() {
		return "|      |";
	}

	public static java.lang.String RocketLine() {
		return "+------+";
	}

}