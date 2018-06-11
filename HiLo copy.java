import java.util.Scanner;
import java.util.Random;

public class HiLo {
	
	static int guess;
	static int num_guesses;
	static String input;
	static Scanner scan = new Scanner(System.in);
	
	/*
	This code takes in an integer (Max) from the user and then randomly selects a number between Max and 1
	(inclusive of both), then continually prompts the user to guess the number. For the guess, it will 
	return whether it was 'Too high' or 'Too low' and if the user guesses correctly it will ask to play
	again. At any time during the game the user can press 0 to quit.
	*/

	public static void main(String[] args) {
		
		input = "y"; //initialize input to "y"
		//play again loop 
		do {
			System.out.println("Welcome! Enter integer for end range (must be greater than 0): ");
			int Max = scan.nextInt();
			
			Random rando_num = new Random(); 
			int r = 1 + rando_num.nextInt(Max);
			
			num_guesses = 0;
			
			//game loop
			do {
				System.out.println("Enter guess or 0 to quit: ");
				guess = scan.nextInt();
				if(guess > r) 
					System.out.println("Too high.");
				if(0 < guess && guess < r)
					System.out.println("Too low.");
				num_guesses++;
				if(guess==r)
					System.out.println("Correct! That took you " + num_guesses + " guesses.");
			} while(guess != r && guess != 0);
			
			System.out.println("Play again (y/n)? ");
			input = scan.next(); 
	} while(input.equals("y")); 
	
	System.out.println("Thanks for playing!");
	
	scan.close();	
	}
}
