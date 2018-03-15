/*Matt Clark
 * Program 8 Due: October 10, 2017
 * None
 * This program will accept user input to determine the cost of renting an item for a submitted amount of time.  It will also verify that the user's data is right before determining the cost and will ask the user if they rented any other items, then determine that items rental cost.
 */

package mClark_Prog8;

import java.util.Scanner;

public class SammyRentals3 
{
	public static void main( String [] args )
	{
		Scanner scnr = new Scanner (System.in);
		
		String userAnsw = "";
		String wordRented = "";
		int numHours = 0;
		int numMins = 0;
		double totalOwed = 0;
		double itemRate = 0;
		
		System.out.println("Welcome to Sammy's Seashore Supplies where it's always a Sunny day at the beach!");
		
		do
		{
			System.out.println();
			System.out.print("What item did you rent?  ");
			wordRented = scnr.nextLine();
			
			System.out.print("How many hours?  ");
			numHours = scnr.nextInt();
			scnr.nextLine();
			
			while ( numHours < 0 )
			{
				System.out.println("That is not a valid number.  Try again.");
				System.out.print("How many hours?  ");
				numHours = scnr.nextInt();
				scnr.nextLine();
			}
				
			System.out.print("How many minutes?  ");
			numMins = scnr.nextInt();
			scnr.nextLine();
			
			while ( (numMins < 0) || (numMins > 59) )
			{
				System.out.println("That is not a valid number.  Try again.");
				System.out.print("How many minutes?  ");
				numMins = scnr.nextInt();
				scnr.nextLine();
			}
			
			System.out.println();
			
			if ( wordRented.equals("canoe"))
			{
				itemRate = 40.00;
			}
			
			else if (wordRented.equals("kayak"))
			{
				itemRate = 20.00;
			}
			
			else if (wordRented.equals("surf board"))
			{
				itemRate = 45.00;
			}
			
			else if (wordRented.equals("beach chair"))
			{
				itemRate = 10.00;
			}
			
			else if  (wordRented.equals("umbrella"))
			{
				itemRate = 12.00;
			}
			
			else
			{
				itemRate = 8.50;
			}
			
			totalOwed = ( itemRate * numHours ) + ( numMins * 1.50 );
			
			System.out.printf("The cost for renting a %s for %d hours and %d minutes is $%.2f.\n",wordRented, numHours, numMins, totalOwed);
			System.out.println();
			
			System.out.print("Did you rent another item?  ");
			userAnsw= scnr.nextLine();
			
		}
		while ( !userAnsw.equals ("no") && !userAnsw.equals ("No") );
		
		System.out.println();
		System.out.println("Thank you for your business.");
		
			
		
		scnr.close();
	}
}
