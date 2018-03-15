/*Matt Clark
 * Program 6 Due: October 10, 2017
 * Partners: None
 * This program will accept a user input for the item rented and how long it was rented.  It will then compute how much the rental cost based on the type of rental and the rate for that item.  Finally, it will print a line saying what the rental fee is.
 */

package mClark_Prog;

import java.util.Scanner;

public class SammyRentals2 
{
	public static void main ( String [] args )
	{
		Scanner scnr = new Scanner(System.in);
		
		String wordRented = "";
		int numMinutes = 0;
		int numHours = 0;
		int totalOwed = 0;
		int itemRate = 0;
		boolean isCanoe = false;
		boolean isKayak = false;
		boolean isSurf = false;
		boolean isChair = false;
		boolean isUmbrella = false;
		
		System.out.println("Welcome to Sammy's Seashore Supplies where it's always a Sunny day at the beach!");
		System.out.println();
		System.out.print("What item did you rent?  ");
			wordRented = scnr.nextLine ();
		System.out.print("How many hours?  ");
			numHours = scnr.nextInt ();
		System.out.print("How many minutes?  ");
			numMinutes = scnr.nextInt ();
		System.out.println();
			
		if ( wordRented.equals("canoe"))
		{
			isCanoe = true; 
			itemRate = 40;
		}
		else if (wordRented.equals("kayak"))
		{
			isKayak = true;
			itemRate = 20;
		}
		else if (wordRented.equals("surf board"))
		{
			isSurf = true;
			itemRate = 45;
		}
		else if (wordRented.equals("beach chair"))
		{
			isChair = true;
			itemRate = 10;
		}
		else 
		{
			isUmbrella = true;
			itemRate = 12;
		}
		
		
		
			
		totalOwed = ( itemRate * numHours ) + ( numMinutes );
		
		System.out.println("The cost for renting a " + wordRented + " for " + numHours + " hours and " + numMinutes + " minutes is $" + totalOwed + ".");
		System.out.println();
		System.out.println("Thank you for your business.");
		
		scnr.close();
		
	}
}
