/*
 * Performs basic arithmetic
 * @author st20155985
 */

package activity1_arithmetic;

public class Arithmetic
{

	public static void main(String[] args)
	{
		// Declaring & Initialising Variables
		int num = 170;
		int factor = 25;
		int sum = 0;
		
		// Add
		sum = num + factor;
		System.out.println("170 + 25 = " + sum);
		
		// Subtract
		sum = num - factor;
		System.out.println("170 - 25 = " + sum);
		
		// Multiply
		sum = num * factor;
		System.out.println("170 x 25 = " + sum);
		
		// Divide
		sum = num / factor;
		System.out.println("170 / 25 = " + sum);
	}

}
