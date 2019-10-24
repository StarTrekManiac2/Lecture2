/*
 * Performs tasks using the Scanner
 * @author st20155985
 */

package activity6_scanner;

import java.util.Scanner;

public class UsingScanner
{

	public static void main(String[] args)
	{
		// Declaring variables
		String name;
		int age;
		Scanner reader = new Scanner(System.in);
		
		// Ask the user for their name
		System.out.println("Hello, what is your name?");
		name = reader.nextLine();
		
		// Ask the user for their age
		System.out.println("How old are you?");
		age = reader.nextInt();
		
		// Output using all user inputs
		System.out.println("Nice to meet you, " + name + ", you are " + age + " years old!");
	}

}
