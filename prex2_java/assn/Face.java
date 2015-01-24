
public class Face {
	
	// this main method draws one or more faces out of 5 separate subunits
	public static void main(String[] args) {
		
		// Print normal face
		hair1();
		eyes1();
		nose1();
		mouth1();
		chinNeck1();
		
		// Print extra lines between faces
		System.out.println();
		System.out.println();
		
		// Print angry face
		hair2();
		eyes2();
		nose2();
		mouth2();
		chinNeck2();
		
		// Print extra lines between faces
		System.out.println();
		System.out.println();
		
		// you can see that with just 2 options for each segment, 
		// you have multiple mix-and-match options
		
		// Print confused face
		hair1();
		eyes2();
		nose1();
		mouth2();
		chinNeck1();
		
		// Print lines between faces
		System.out.println();
		System.out.println();
		
		// Print happy faces
		hair1();
		eyes2();
		nose2();
		mouth1();
		chinNeck2();
		
		// Print lines between faces
		System.out.println();
		System.out.println();
		
		// Print Kelcie's face
		hair_KF1();
		eyes_KF1();
		nose1();
		mouth1();
		chinNeck1();
		
		// Print lines between faces
		System.out.println();
		System.out.println();
		
		// Print Kelcie's cat
		hair_KF2();
		eyes_KF2();
		nose_KF2();
		mouth1();
		chinNeck1();
	}
	// Hair segments have dimensions 2 rows x 13 columns
	// Must join eyes segments which have structure: 
	// blank - | -  9 units - | - blank
	public static void hair1(){
		System.out.println("   _______");
		System.out.println("  /       \\");
		System.out.println(" /         \\");
		
	}
	
	public static void hair2(){
		System.out.println("  @@@@@@@@@");
		System.out.println(" @@@@@@@@@@@");
		
	}
	
	public static void hair_KF1() {
		
		// This hair is spikey!
		System.out.println("  MMMMMMMMM");
		System.out.println(" MMMMMMMMMMM");
		
	}
	
	public static void hair_KF2() {
		
		// This hair is for a cat!
		System.out.println("   .      .");
		System.out.println("  /\\_____/\\");
		System.out.println(" /         \\");
		
	}
	
	// Eye segments have dimensions 2 rows x 13 columns
	// Must join hair segments which have structure:
	// blank - | -  9 units - | - blank
	// Must join nose segments which have structure: 
	// blank - | -  9 units - | - blank
	public static void eyes1(){
		System.out.println(" | /\\   /\\ |");
		System.out.println("(| o    o  |)");
		
	}
	
	public static void eyes2(){
		System.out.println(" |  \\   \\  |");
		System.out.println("(| o    o  |)");
	}
	
	public static void eyes_KF1() {

		System.out.println(" | /\\   /\\ |");
		System.out.println("(|=(o)=(o)=|)");

	}
	
	public static void eyes_KF2() {

		// These eyes are for a cat!
		System.out.println(" |         |");
		System.out.println(" | <o> <o> | ");

	}
	
	// Nose segments have dimensions 3 rows x 13 columns
	// Must join eyes segments which have structure: 
	// blank - | -  9 units - | - blank
	// Must join mouth segments which have structure: 
	// blank - | -  9 units - | - blank
	public static void nose1(){
		System.out.println(" |   |     |");
		System.out.println(" |   |/    |");
		System.out.println(" |         |");
	}
	
	public static void nose2(){
		System.out.println("(|         |)");
		System.out.println(" |   |/    |");
		System.out.println(" |  wwww   |");
	}
	
	public static void nose_KF2(){
		// This nose is for a cat!
		System.out.println(" |   __    | ");
		System.out.println(" |   \\/    |");
		System.out.println(">|         |<");
	}
		
	
	// Mouth segments have dimensions 3 rows x 13 columns
	// and nose segments which have structure:
	// blank - | -  9 units - | - blank
	// Must join chin/neck segments which have structure: 
	// blank - blank - \ - 7 units - / - blank - blank
	public static void mouth1(){
		System.out.println(" |         |");
		System.out.println(" | \\_____/ |");
		System.out.println(" \\  \\___/  /");
	}
	
	public static void mouth2(){
		System.out.println(" |         |");
		System.out.println(" | /\\____  |");
		System.out.println(" \\         /");
	}
	
	// Chin =/- neck segments have dimensions 3 rows x 13 columns
	// Must join mouth segments which have structure: 
	// blank - \ - 9 units - / - blank 
	public static void chinNeck1(){
		System.out.println("  \\_______/");
		System.out.println("     /  \\");	
	}
	
	public static void chinNeck2(){
		System.out.println("  \\@@@@@@@/");
		System.out.println("    @@@@@");
		System.out.println("     @@");
	}
	

}