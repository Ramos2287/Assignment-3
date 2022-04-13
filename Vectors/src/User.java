/*
 * Student Name: Stanley Pieda
 * Lab Professor: Professor Stanley Pieda
 * Due Date: The due date
 * Description: Assignment 02 (22W) Sample Solution
 */

/* This class verifies that data entered is numeric where needed, trapping
 * the user inside an infinite loop until they enter the requested data.
 * Example use:
 * User user = new User();
 * int number1 = user.inputInteger("Enter a number: ");
 */

import java.util.Scanner;

/*
 * This class provides utility for getting user input from the console using
 * an instance of Scanner set to new Scanner(System.in)
 */
public class User {
	
	private Scanner keyboard = new Scanner(System.in);
	
	/*
	 * Does not prompt the user, reads in an int value when there is one. If
	 * the user does not provide input that can be converted into an int an
	 * error message is printed requesting a correct input and a loop is used
	 * to trap the user until they get this right. A future version of 
	 * the program might have a sanity check to break the loop after several 
	 * failed attempts and then shut down the program, rather than looping
	 * (in theory) forever.
	 */
	public int inputInteger() {
		boolean isInputBad = true;
		boolean hasNextInt;
		int value = 0;
		while(isInputBad) {
			hasNextInt = keyboard.hasNextInt();
			if(hasNextInt) {
				value = keyboard.nextInt();
				isInputBad = false; // break out of loop
			}
			else {
				System.out.print("Invalid input. Enter an integer number: ");
			}
			keyboard.nextLine(); // clean up input stream
		}
		return value;
	}
	
	/*
	 * This method prompts the user using the argument sent to message
	 *  and then calls to method inputInteger() to get the actual input value.
	 */
	public int inputInteger(String message) {
		// This method calls inputInteger(), so no changes are needed here.
		System.out.printf("%s", message);
		int value = inputInteger(); 
		return value;
	}
	
	/*
	 * Does not prompt the user, reads in a double value when there is one. If
	 * the user does not provide input that can be converted into a double an
	 * error message is printed requesting a correct input and a loop is used
	 * to trap the user until they get this right. A future version of 
	 * the program might have a sanity check to break the loop after several 
	 * failed attempts and then shut down the program, rather than looping
	 * (in theory) forever.
	 */
	public double inputDouble() {
		boolean isInputBad = true;
		boolean hasNextDouble;
		double value = 0.0;
		while(isInputBad) {
			hasNextDouble = keyboard.hasNextDouble();
			if(hasNextDouble) {
				value = keyboard.nextDouble();
				isInputBad = false; // break out of loop
			}
			else {
				System.out.print("Invalid input. Enter a number: ");
			}
			keyboard.nextLine(); // clean up input stream
		}
		return value;	
	}
	
	/*
	 * This method prompts the user using the argument sent to message
	 *  and then calls to method inputDouble() to get the actual input value.
	 */
	public double inputDouble(String message) {
		// This method calls inputDouble(), so no changes are needed here.
		System.out.printf("%s", message);
		double value = inputDouble();
		return value;
	}
	
	/*
	 * this method is used to get a line of text from the console, it reads
	 * until it encounters a line terminator character.
	 */
	public String inputString() {
		String value = keyboard.nextLine();
		return value;
	}
	
	/*
	 * This method prompts the user using the argument sent to message, 
	 * then calls to method inputString() which reads in the actual text.
	 */
	public String inputString(String message) {
		System.out.printf("%s", message);
		String value = inputString();
		return value;
	}
	
	/*
	 * This method use a loop to ask if there is more data to enter (yes, no) and continue
	 */
	public boolean inputConfirmation() {
		while(true) {
			System.out.print("Continue Program? (yes / no) ");
			String value = inputString();
			if (value.equalsIgnoreCase("yes"))
				return true;
			else if(value.equalsIgnoreCase("no"))
				return false;
			//System.out.println("please enter yes or no");
		}
	}
	public char inputChar(String message, String acceptedValues) {
		char v = ' ';
		do {
			if (v != ' ')
				System.err.println("Error: " + v + " is not accepted, you should input (+ or -)");
			System.out.printf("%s", message);
			String value = keyboard.nextLine();
			v = value.charAt(0);
		} while (acceptedValues.indexOf(v) == -1);
		return v;
	}

}