package edu.wit.cs.comp1050;
import java.util.Scanner;
//Converts number of coins to the total amount of dollars and cents
public class PA1b {
	
	/**
	 * Error message to display for any non-negative counts 
	 */
	public static final String ERR_MSG = "All coin counts must be non-negative!";

	// Starts the program
	public static void main(String[] args) {
		//Declares scanner and coin variables
		Scanner in = new Scanner(System.in);
		double q, d, n, p;
		
		//Gets user input for values of coins
		System.out.println("Enter number of quarters: ");
		q = in.nextDouble();
		System.out.println("Enter number of dimes: ");
		d = in.nextDouble();
		System.out.println("Enter number of nickels: ");
		n = in.nextDouble();
		System.out.println("Enter number of pennies: ");
		p = in.nextDouble();
		
		//Assigns input entered to their worth in money
		double q1 = q * 0.25;
		double d1 = d * 0.10;
		double n1 = n * 0.05;
		double p1 = p * 0.01;
		double sum = q1 + d1 + n1 + p1;
		
		//Prints amount of money in coins if the amounts entered are non-negative
		if( q < 0 || d < 0 || n < 0 || p < 0 )
			System.out.println(ERR_MSG);
		else if(q > 0 || d > 0 || n > 0 || p > 0)
			System.out.printf("You have $%.2f in coins.", sum);
		
		
	}

}
