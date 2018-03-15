/*Matt Clark
 * Program 13 Due: November 28, 2017
 * None
 * This program will accept user input for the initial input and the rate of return and will, using multiple methods, determine the monthly amount of gain.
 */

package mClark_Prog13;

import java.util.Scanner;

public class SimpleInvest 
{
	static Scanner scnr = new Scanner (System.in);

	public static void main ( String [] args )
	{
		double[] year = new double [12];
		
		printWelcome();
		double invTot = getInvestAmount();
		double growRate = getRate();
		calculateInterest(invTot, growRate, year);
		printAmounts(year);
		
		scnr.close();
	}
	
	
	public static void printWelcome()
	{
		System.out.println("Welcome to the Investment Calculator");
		System.out.println();
	}

	public static double getInvestAmount()
	{
		System.out.print("How much will you be investing?  ");
		double amount = scnr.nextDouble();

		while ( amount < 1 )
		{
			System.out.println("Amount must be greater than 0.  Try again.");
			System.out.print("How much will you be investing?  ");
			amount = scnr.nextDouble();
		}
		scnr.nextLine();
		System.out.println();
		return amount;
	}

	public static double getRate()
	{
		System.out.print("What will be the rate of return?  ");
		double rate = scnr.nextDouble();

		while ( rate < 1 )
		{
			System.out.println("Rate must be greater than 0.  Try again.");
			System.out.print("What will be the rate of return?  ");
			rate = scnr.nextDouble();
		}
		scnr.nextLine();
		rate = rate / 100;
		System.out.println();
		return rate;
	}

	public static void calculateInterest(double invest, double rate, double [] year )
	{
		for (int i = 0; i < year.length; i++)
		{
			
			year[i] = ( invest * rate ) + invest;
			invest = year[i];
		}
	}

	public static void printAmounts(double [] year)
	{
		for (int i = 0; i < year.length; i++)
		{
			System.out.printf("Your investment amount after month %d is $%.2f.\n", i + 1 , year[i]);
		}	
	}
}
