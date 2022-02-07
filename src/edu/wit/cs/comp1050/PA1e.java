package edu.wit.cs.comp1050;
import java.util.Scanner;
//Program that counts the amount of uppercase letters in a string
public class PA1e {
	
	//Counts the number of upper case characters within the supplied string
	public static int numUpperCase(String s) {
		int count = 0;
		for( int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i)))
				count++;
		}
		return count; 
	}

	//Starts the program
	public static void main(String[] args) {
		//Gets user inputted string
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = in.nextLine();
		int count = numUpperCase(s);
		//Determines what to print depending on how many uppercase letters there are
		if(count > 1 )
			System.out.println("There are " + count + " uppercase letters in the string");
		else if(count == 0)
			System.out.println("There are no uppercase characters.");
		
	}

}
