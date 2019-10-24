/*
 * Performs basic logic
 * @author st20155985
 */

package activity4_logic;

public class Logic
{

	public static void main(String[] args)
	{
		// Declaring and Initialising Variables
		boolean yes = true;
		boolean no = false;

		
		// TEST A (&& - AND) 
		
		// Comparing yes and yes to see if they match (TRUE)
		System.out.println("Both YesYes True: " + (yes && yes));
		
		// Comparing yes and no to see if they match (FALSE)
		System.out.println("Both YesNo True: " + (yes && no));
		
		
		// TEST B (|| - OR)
		
		// Comparing yes and yes to see if either are true (TRUE)
		System.out.println("Either YesYes True: " + (yes || yes));
		
		// Comparing yes and no to see if either are true (TRUE)
		System.out.println("Either YesNo True: " + (yes || no));
		
		// Comparing no and no to see if either are true (FALSE)
		System.out.println("Either NoNo True: " + (no || no));
		
		
		// TEST C (! - Not/Inverse)
		
		// Return yes boolean value (original) (TRUE)
		System.out.println("Original Yes Value: " + yes);
		
		// Return yes boolean value (inverse) (FALSE)
		System.out.println("Inverse Yes Value: " + !yes);

	}

}
