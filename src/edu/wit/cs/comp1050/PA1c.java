package edu.wit.cs.comp1050;
import java.util.Scanner;
//Converts a dollar amount into the fewest number of coins needed
public class PA1c {
	
	/**
	 * Error message to display for negative amount 
	 */
	public static final String ERR_MSG = "Dollar amount must be non-negative!";
	
	//Method to convert a double to an integer
	public static int convertToInt(double num) {
		int value = (int)Math.round(num);
		return value;
	}

	//Starts the program 
	public static void main(String[] args) {
	//Gets user input
		Scanner in = new Scanner(System.in);
		double amount;
		System.out.println("Enter total amount: ");
		amount = in.nextDouble();
		amount = amount * 100;
	//Detects if there is a non-negative dollar amount entered
		if( amount < 0) {
			System.out.println(ERR_MSG);
			System.exit(0);
			}
		//Evaluates the lowest number of coins needed
		int value = convertToInt(amount);
		int q, d, n, p;
		q = value / 25;
		d = ((value - (q * 25)) / 10);
		n = ((value - (q * 25)-(d * 10)) / 5);
		p = (value - (q * 25) - (d * 10) - (n * 5) / 1);
		System.out.println("You have " + q + " quarters, " + d + " dimes, " + n + " nickels, " + p + " pennies." );
		
	}
} 