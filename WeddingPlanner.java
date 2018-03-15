/*Matt Clark
 * Program 9 Due: October 31, 2017
 * None
 * This program will ask the user how many guests are coming to a wedding.  It will then print out a statement per guest asking what they want to eat.  Finally it will tally all the input to determine the amount of each meal requested. 
 */

package mClark_Prog9;

import java.util.Scanner;

public class WeddingPlanner 
{
	public static void main (String [] args)
	{
		
		Scanner scnr = new Scanner (System.in);
		
		int numGuests = 0;
		int vegMeal = 0;
		int chickMeal = 0;
		int beefMeal = 0;
		int fishMeal = 0;
		String userChoice = "";
		int i = 0;
		
		System.out.println("Welcome to Tying the Knot Wedding Planner Guide");
		System.out.println();
		
		System.out.println("For each guest, please enter he/her choice for dinner:  Beef, Chicken, Fish, or Vegetarian.");
		System.out.print("How many guests will there be?  ");		
		numGuests = scnr.nextInt();
		
		
		
		
		while (numGuests <= 0)
		{
			System.out.println("That was not a valid number, try again.");
			System.out.print("How many guests will there be?  ");
			numGuests = scnr.nextInt();
			
		}
		
		scnr.nextLine();
		
		System.out.println();
		for (i=1; i <= numGuests; i++)
		{
			System.out.printf("Enter the choice for guest %d:  ", i);
			userChoice = scnr.nextLine();
			
			switch (userChoice)
			{
				case "vegetarian":
				vegMeal += 1;
				break;
				
				case "chicken":
				chickMeal += 1;
				break;
				
				case "beef":
				beefMeal +=1;
				break;
				
				case "fish":
				fishMeal += 1;
				break;
			}
			
		}
		
		System.out.println();
		System.out.printf("There will be %d meals\n%d Beef\n%d Chicken\n%d Fish\n%d Vegetarian\n", numGuests, beefMeal, chickMeal, fishMeal, vegMeal);
		System.out.println();
		System.out.println("Thank you for your business.");
		
		scnr.close();
	}
}
