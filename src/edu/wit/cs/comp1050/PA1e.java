package edu.wit.cs.comp1050;
import java.util.Scanner;
//TODO: document this class
public class PA1e {
	
	/**
	 * Counts the number of upper case characters
	 * within the supplied string
	 * 
	 * @param s input string
	 * @return number of upper case characters
	 */
	public static int numUpperCase(String s) {
		int count = 0;
		for( int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i)))
				count++;
		}
		return count; 
	}

	// TODO: document this method
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = in.nextLine();
		int count = numUpperCase(s);
		if(count > 1 )
			System.out.println("There are " + count + " uppercase letters in the string");
		else if(count == 0)
			System.out.println("There are no uppercase characters.");
		
	}

}
