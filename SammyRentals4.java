/*Matt Clark
 * Program 12 Due: November 21, 2017
 * None
 * This program will accept user input to determine the cost of renting an item for a submitted amount of time.  It will also verify that the user's data is right before determining the cost and will ask the user if they rented any other items, then determine that items rental cost.  It will do all this using methods.
 */


package mClark_Prog12;

import java.util.Scanner;

public class SammyRentals4 
{
	static Scanner scnr = new Scanner (System.in);

	public static void main( String [] args )
	{
		String userAnsw = "";
		printWelcome();
		
		do
		{
			String wordRented = getItem();
			int numHours = getHours();
			int numMins = getMinutes();
			double itemRate = calculateRate(wordRented);
			double totalOwed = calculateCost(numHours, numMins, itemRate);
			printCost(wordRented, numHours, numMins, totalOwed);
			userAnsw = repeat();
		}
		
		while ( !userAnsw.equals ("no") && !userAnsw.equals ("No") );

		printThankYou();


		scnr.close();
	}

	public static void printWelcome()
	{
		System.out.println("Welcome to Sammy's Seashore Supplies where it's always a Sunny day at the beach!");
	}

	public static String getItem()
	{
		System.out.println();
		System.out.print("What item did you rent?  ");
		String rented = scnr.nextLine();
		return rented;

	}

	public static int getHours()
	{
		System.out.print("How many hours?  ");
		int numHours = scnr.nextInt();
		scnr.nextLine();

		while ( numHours < 0 )
		{
			System.out.println("That is not a valid number.  Try again.");
			System.out.print("How many hours?  ");
			numHours = scnr.nextInt();
			scnr.nextLine();
		}
		return numHours;
	}

	public static int getMinutes()
	{
		System.out.print("How many minutes?  ");
		int numMins = scnr.nextInt();
		scnr.nextLine();

		while ( (numMins < 0) || (numMins > 59) )
		{
			System.out.println("That is not a valid number.  Try again.");
			System.out.print("How many minutes?  ");
			numMins = scnr.nextInt();
			scnr.nextLine();
		}
		return numMins;
	}

	public static double calculateRate (String rented)
	{
		double rate = 0;
		System.out.println();

		if ( rented.equals("canoe"))
		{
			rate = 40.00;
		}

		else if (rented.equals("kayak"))
		{
			rate = 20.00;
		}

		else if (rented.equals("surf board"))
		{
			rate = 45.00;
		}

		else if (rented.equals("beach chair"))
		{
			rate = 10.00;
		}

		else if  (rented.equals("umbrella"))
		{
			rate = 12.00;
		}

		else
		{
			rate = 8.50;
		}
		return rate;
	}

	public static double calculateCost(int hours, int mins, double rate)
	{

		double owed = 0;
		owed = ( rate * hours ) + ( mins * 1.50 );
		return owed;
	}

	public static void printCost(String rented, int hours, int mins, double owed)
	{
		System.out.printf("The cost for renting a %s for %d hours and %d minutes is $%.2f.\n",rented, hours, mins, owed);
		System.out.println();
	}
	public static String repeat()
	{
		System.out.print("Did you rent another item?  ");
		String answ = scnr.nextLine();
		return answ;
	}
	public static void printThankYou()
	{
		System.out.println();
		System.out.println("Thank you for your business.");
	}

}

