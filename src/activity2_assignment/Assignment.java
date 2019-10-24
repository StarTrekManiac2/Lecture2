/*
 * Performs basic assignment
 * @author st20155985
 */

package activity2_assignment;

public class Assignment
{
	
	public static void main(String[] args)
	{
		// Assigning and initialising variables
		String txt = "Fantastic ";
		String lang = "Java";
		
		// Construct a String output
		txt += lang;
		System.out.println("Add & Assign Strings: " + txt);
		
		
		// Assigning and initialising new variables
		int sum = 10;
		int num = 20;
		
		// Construct an output (with adding arithmetic applied)
		sum += num; // Sum is now 30
		System.out.println("Add & Assign Integers: " + sum);
		
		
		// Assigning and initialising more variables
		int factor = 5;
		
		// Output multiply arithmetic
		sum *= factor; // Sum is now 150
		System.out.println("Multiply and Assign Integers: " + sum);
		
		// Output divide arithmetic
		sum /= factor; // Sum is now 30
		System.out.println("Divide and Assign Integers: " + sum);
	}

}
