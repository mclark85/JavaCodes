/*Matt Clark
 * Program 4 Due: September 26, 2017
 * Partners: None
 * This program will calculate the cost of renting an user submitted item for a submitted amount of time and will then print a statement stating the cost.
*/

package mClark_Prog4;
import java.util.Scanner;

public class SammyRental 
{
	public static void main (String [] args)
	{
		Scanner scnr = new Scanner(System.in);
		String wordRented = "";
		int numMin = 0;
		int numHours = 0;
		int totalOwed = 0;
		
		System.out.println("Welcome to Sammy's Seashore Supplies where it's always a Sunny day at the beach!");
		System.out.println();
		System.out.print("What item did you rent?  ");
		wordRented = scnr.nextLine();
		System.out.print("How many hours?  ");
		numHours = scnr.nextInt();
		System.out.print("How many minutes?  ");
		numMin = scnr.nextInt();
				
		totalOwed = (40 * numHours) + (1 * numMin);
		
		System.out.println();
		System.out.println("The cost for renting a " + wordRented + " for " + numHours + " hours and " + numMin + " minutes is $" + totalOwed + ".");
		System.out.println();
		System.out.println("Thank you for your business.");
		
		
		scnr.close();
	}

}
