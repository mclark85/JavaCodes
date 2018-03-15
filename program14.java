/*Matt Clark
 * Program 14 Due: December 5, 2017
 * None
 * This Program will ask the user for a meal, dessert and the calories for those two items.  It will then pass that info to another class where it will calculate the total calories and print out what the user ate, the total calories and if that exceeded 2000 calories.
 */

package mClark_Prog14;

import java.util.Scanner;

public class CalorieCounter 
{
	static Scanner input = new Scanner ( System.in);

	public static void main ( String [] args )
	{
		Meal yourMeal = new Meal();

		printWelcome();
		String entreeChoice = getEntreeChoice();
		int mmCals = getCals( entreeChoice );
		String dessertChoice = getDessertChoice();
		int dCals = getCals( dessertChoice );

		yourMeal.setEntree ( entreeChoice );
		yourMeal.setEntreeCals ( mmCals );
		yourMeal.setDessert ( dessertChoice );
		yourMeal.setDessertCals ( dCals );

		yourMeal.setTotalCals();

		int tCals = yourMeal.getTotalCals();
		boolean dailyCals = overUnder ( tCals );

		if ( dailyCals )
		{
			yourMeal.setUnderCals ( true );
		}

		else
		{
			yourMeal.setUnderCals ( false );
		}

		printTotals ( yourMeal );

		input.close();
	}
	public static void printWelcome()
	{
		System.out.println( "Welcome to the Calorie Counter. \n" );
	}

	public static String getEntreeChoice()
	{
		System.out.print("What was your entree:  ");
		String mainMeal = input.nextLine();
		return mainMeal;
	}

	public static String getDessertChoice()
	{
		System.out.print( "\nWhat was your dessert:  " );
		input.nextLine();
		String dessertMeal = input.nextLine();
		return dessertMeal;
	}

	public static int getCals(String choice)
	{
		System.out.printf("How many calories were in %s:  ", choice);
		int numCals = input.nextInt();

		while ( numCals < 0 )
		{
			System.out.println("Number of calories may not be negative.  Try again.");
			System.out.printf("How many calories were in %s", choice);
			numCals = input.nextInt();
		}
		return numCals;
	}

	public static boolean overUnder( int cals )
	{
		boolean result = true;
		if ( cals > 2000 )
		{
			result = false;
		}
		return result;
	}

	public static void printTotals ( Meal aMeal )
	{
		System.out.printf("\nYour meal of %s and %s had a total of %d calories.\n", aMeal.getEntree(), aMeal.getDessert(), aMeal.getTotalCals());
		System.out.printf("You are %s your suggested calorie total for the day with one meal.\n", aMeal.getUnderCals() ? "under" : "over" );
	}
}


//Instance Class


package mClark_Prog14;

public class Meal 
{
	private String entree;
	private String dessert;
	private int entreeCals;
	private int dessertCals;
	private int totalCals;
	private Boolean underCals;
	
	public Meal()
	{
		entree = " ";
		dessert = " ";
		entreeCals = 0;
		dessertCals = 0;
		totalCals = 0;
		underCals = true;
	}
	
	public void setEntree( String e )
	{
		entree = e;
	}
	
	public String getEntree()
	{
		return entree;
	}
	
	public void setDessert( String d )
	{
		dessert = d;
	}
	
	public String getDessert()
	{
		return dessert;
	}
	
	public void setEntreeCals (int eCals)
	{
		entreeCals = eCals;
	}
	
	public int getEntreeCals()
	{
		return entreeCals;
	}
	
	public void setDessertCals( int dCals)
	{
		dessertCals = dCals;
	}
	
	public int getDessertCals()
	{
		return dessertCals;
	}
	
	public void setTotalCals()
	{
		totalCals = dessertCals + entreeCals;
	}
	
	public int getTotalCals()
	{
		return totalCals;
	}
	
	public void setUnderCals( Boolean u )
	{
		underCals = u;
	}
	
	public Boolean getUnderCals()
	{
		return underCals;
	}
}

