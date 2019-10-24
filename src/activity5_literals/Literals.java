/*
 * Performs basic literals
 * @author st20155985
 */

package activity5_literals;

public class Literals
{
	
	public static void main(String[] args)
	{
		/***************************************
		 * STRING LAYOUT DEFINITIONS
		 * - \n		creates a new line
		 * - \t		tabs over several spaces
		 ***************************************/
		
		// Declaring and Initialising Variables
		String header = "\n\tMARS ROVER ENVIRONMENTAL MONITORING STATION 3-DAY FORECAST:\n";
		String forecast = "\t1125\t\t-22C\t-79C\t900Pa\n";
		
		// Assign and expand to the current header (adds to the layout of the table)
		header += "\n\tSol\t\tHigh\tLow\tPressure\n";
		header += "\t---\t\t----\t---\t---------\n";
		
		// Assign and expand to the current forecast (adds more rows to the table)
		forecast += "\t1126\t\t-21C\t-79C\t901Pa\n";
		forecast += "\t1127\t\t-30C\t-80C\t910Pa\n";
		
		// Output the variables into a table layout/format
		System.out.println(header + forecast);
	}

}
