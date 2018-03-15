/*Matt Clark
 * Program 10 Due: November 7, 2017
 *None
 *This program accepts user input of sales figures for a business week.  It will then compare the numbers to determine the day of the week with highest and lowest sales along with the weekly total and average per day.
 */
 package mClark_Prog10;
 

import java.util.Scanner;

public class SalesReport 
{
	public static void main ( String [ ] args)
	{
		Scanner scnr = new Scanner (System.in);

		double [ ] arrSales = new double [5];
		String [ ] arrDay = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
		double best = 0;
		double worst = 100000;
		double total = 0;
		double avg = 0;
		String bestDay = "";
		String worstDay = "";


		System.out.println("Company XYZ Sales Report");
		System.out.println();

		for(int i = 0; i < arrSales.length; i++)
		{
			System.out.printf("Enter sales for %s:  ", arrDay[i]);
			arrSales[i] = scnr.nextDouble();

			while (arrSales[i] < 0)
			{
				System.out.print("Sales may not be negative.\n");
				System.out.printf("Enter sales for %s:  ", arrDay[i]);
				arrSales[i] = scnr.nextDouble();
			}
		}	

		System.out.println();
		System.out.println("Sales per day:");
		System.out.println();

		for(int i = 0; i < arrSales.length; i++)
		{
			System.out.printf("%-14s $%.2f\n", arrDay[i], arrSales[i]);
		}

		for ( int i = 0; i < arrSales.length; i++)
		{
			if ( best < arrSales[i] )
			{
				best = arrSales[i];
				bestDay = arrDay[i];
			}
		}	

		for ( int i = 0; i < arrSales.length; i++)
		{
			if ( worst > arrSales[i])
			{
				worst = arrSales[i];
				worstDay = arrDay[i];
			}
		}

		for ( int i = 0; i < arrSales.length ; i++ )
		{
			total += arrSales[i];
		}
		System.out.println();

		avg = total/5;

		System.out.printf("Highest sales occurred on %s and were $%.2f\n", bestDay, best);
		System.out.printf("Lowest sales occurred on %s and were $%.2f\n", worstDay, worst);
		System.out.printf("Total sales were $%.2f\n", total);
		System.out.printf("Average sales per day were $%.2f\n", avg);


		scnr.close();
	}
}
