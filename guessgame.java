import java.lang.Math;
import java.util.Scanner;



public class guessgamejava {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generate random number
		double randNum = (int)(Math.random()*(100-1+1))+1;
		Scanner in = new Scanner(System.in);
		
		//variables 
		int number = 0;
		String ansString = "";
		boolean valid = false;
		
		int guesses = 0;
		int totalGuesses = 0;
		
		
		
		
		
				
		//Display message
		System.out.println("This program is a guessing game.\nThe computer will generate a random integer between 1 and 100. The user will try to guess the number.\nLet's get started!");
		System.out.println("I'm thinking of a number between 1 and 100.\nWhat is your guess? something\nError:Please enter a whole number.\n ");
		
		
		//do while loop for numeric input validation
		do {
			System.out.println("What is your guess?");
			number = in.nextInt();
			guesses++;
			
			
			//if and else statement
		     if (number < randNum) {
				System.out.println("Your guess is too low. Try again.\n ");
				
			}else if (number > randNum) {
				System.out.println("Your guess is too high. Try again.\n ");
				
			}else {
				 System.out.println("CORRECT! You guessed it in  "+guesses+"  tries!!\n");
				 valid = true; //boolean on switch
				 
			}//end of if and else statement
			
		}while(!valid);//end of do while loop
		
		valid = false;
		//do while loop for non-numeric input validation 
		do {
			System.out.println("Would you like to play again?\n");
			ansString = in.nextLine();
		
		//if and else statement
		if (ansString.equalsIgnoreCase("Y") || ansString.equalsIgnoreCase("N")) {
			valid = true; //boolean on switch
			
		}else{
			System.out.println("Error! Please use Y for yes and N for no.");
		}//end of if and else statement 
		
	}while(!valid);//end of do while loop
		
		
		
		
		}//end of main method

}//end of lab4c