/*
 * Performs basic comparison
 * @author st20155985
 */

package activity3_comparison;

public class Comparison
{

	public static void main(String[] args)
	{
		// Declaring and initialising variables
		String txt = "Fantastic";
		String lang = "Java";
		boolean state = (txt == lang);

		// Print true/false if 'txt' and 'lang' match (FALSE)
		System.out.println("String Equality Test: " + state);
		
		// Change 'state' boolean parameters (not equal to)
		state = (txt != lang);
		
		// Print true/false if 'txt' and 'lang' match (TRUE)
		System.out.println("String Inequality Test: " + state);
		
		
		// Declaring and initialising new variables
		int dozen = 12;
		int score = 20;
		
		// Change 'state' boolean parameters (bigger than)
		state = (dozen > score);
		
		// Print true/false if 'dozen' is greater than 'score'(FALSE)
		System.out.println("Greater Than Test: " + state);
		
		// Change 'state' boolean parameters (less than)
		state = (dozen < score);
		
		// Print true/false if 'dozen' is lesser than 'score'(TRUE)
		System.out.println("Less Than Test: " + state);
	}

}
