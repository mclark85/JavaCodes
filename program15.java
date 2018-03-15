/*Matt Clark
 * Program 15 Due: December 13, 2017
 * None
 * This will program will accept a user's drink order and then print out the order and determine if a refill is needed. 
 */

package mClark_Prog15;

import java.util.Scanner;

public class DrinkMaker 
{
	static Scanner scnr = new Scanner ( System.in);

	public static void main ( String [] args )
	{
		String _pop = orderDrink();
		String _sz = orderSize();

		Drink yourDrink = new Drink(_pop, _sz);

		yourDrink.setPrice();

		printOrder( yourDrink );

		yourDrink.drinkSoda();

		checkRefill( yourDrink );
		printThankYou();



	}

	public static String orderDrink()
	{
		System.out.print("What is your drink choice?  ");
		String soda = scnr.nextLine();
		return soda;
	}

	public static String orderSize()
	{

		System.out.print("What size - small, medium, large, or super size?  ");
		String cup = scnr.nextLine();

		while ( !cup.equals( "small" ) && !cup.equals( "medium" ) && !cup.equals( "large" ) && !cup.equals( "super size") )
		{
			System.out.println("Must be one of the sizes listed above here.");
			System.out.print("What size - small, medium, large, or super size?  ");
			cup = scnr.nextLine();
		}

		return cup;
	}

	public static void printOrder( Drink adrink )
	{
		System.out.println();
		System.out.printf("Your %s %s will cost $%.2f\n", adrink.getSize(), adrink.getSoda(), adrink.getPrice() );
	}

	public static void checkRefill( Drink refill )
	{
		System.out.println();
		boolean cup = refill.needRefill();
		if  (cup == true)
		{
			System.out.println("I see that you do need a refill");
		}

		else
		{
			System.out.println("I see you don't need a refill");
		}
	}

	public static void printThankYou()
	{
		System.out.println();
		System.out.println("Thank you for your business. ");
	}
}


//Instance Class


package mClark_Prog15;

public class Drink 
{
	private String soda;
	private String size;
	private double price;
	private boolean emptyCup;

	public Drink()
	{
		soda = "water";
		size = "small";
		price = 0.0;
		emptyCup = false;
	}

	public Drink( String soda, String size )
	{
		this.soda = soda;
		this.size = size;
		price = 0.0;
		emptyCup = false;
	}

	public void setSoda( String _pop )
	{
		soda = _pop;
	}

	public void setSize( String _sz )
	{
		size = _sz;
	}

	public void setPrice()
	{	
		switch (size)
		{
		case "small" :
			price = 1.50;
			break;

		case "medium" :
			price = 1.75;
			break;

		case "large" :
			price = 2.25;
			break;

		default:
			price = 2.55;

		}

	}



	public String getSoda()
	{
		return soda;
	}

	public String getSize()
	{
		return size;
	}

	public double getPrice()
	{
		return price;
	}

	public boolean getEmptyCup()
	{
		return emptyCup;
	}

	public void drinkSoda()
	{
		emptyCup = true;
	}

	public boolean needRefill()
	{
		return emptyCup;
	}

}
