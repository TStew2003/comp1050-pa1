package edu.wit.cs.comp1050;
import java.util.Scanner;
//Computes the cost of shipping considering the weight of the package
public class PA1d {
	
	/**
	 * Error message to display for negative amount 
	 */
	public static final String ERR_MSG = "The package cannot be shipped!";
	
	//Calculates the cost of shipping depending on the weight
	public static double shippingCost(double weight) {
		double cost = weight * 8.75;
		return cost; 
	}

	//This starts the program
	public static void main(String[] args) {
		//Gets user inputted weight
		Scanner in = new Scanner(System.in);
		System.out.println("Enter package weight: ");
		double weight = in.nextDouble();
		
		//Detects whether the weight is inside the valid bounds
		if( weight > 20 ) {
			System.out.print(ERR_MSG);		
			System.exit(0);
		}
		//Outputs the cost of shipping
		double cost = shippingCost(weight);
			System.out.printf("It will cost $%.2f to ship this package.", cost);
	}

}
