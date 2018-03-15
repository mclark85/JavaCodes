/*Matt Clark
 * Program 3 Due 9/19/2017
 * None
 * This program will accept input from a user, assign it to a variable and then print out a statement using the users input.
 */

package mClark_Prog3;
import java.util.Scanner;

public class SimpleInput 
{
	public static void main ( String [] args)
	{
		Scanner scnr = new Scanner (System.in);
		String wordName = "";
		String wordTV = "";
		String wordResturant = "";
		String wordMovie = "";
		int newNum = 0;
		double newDec = 0.0;
		String wordFightWinner = "";
		
		System.out.println("Welcome to the Get to Know You Program");
		System.out.println("");
		
		System.out.print("What is your name?  ");
		wordName = scnr.nextLine();
		System.out.print("What is your favorite TV show?  ");
		wordTV = scnr.nextLine();
		System.out.print("What is your favorite restaurant?  ");
		wordResturant = scnr.nextLine();
		System.out.print("What is your favorite movie?  ");
		wordMovie = scnr.nextLine();
		System.out.print("Please enter an integer:  ");
		newNum = scnr.nextInt();
		System.out.print("Please enter a decimal number:  ");
		newDec = scnr.nextDouble();
		scnr.nextLine();   //It kept skipping the last question. Googled the problem and this was a suggested solution.
		System.out.print("Viking vs. Scottish Highland Warrior, who wins?  ");
		wordFightWinner = scnr.nextLine();
		System.out.println("");
		
		System.out.println("Here are your responses.");
		System.out.println("Name:  " + wordName);
		System.out.println("TV Show:  " + wordTV);
		System.out.println("Restaurant:  " + wordResturant);
		System.out.println("Movie:  " + wordMovie);
		System.out.println("Integer:  " + newNum);
		System.out.println("Decimal Number:  " + newDec);
		System.out.println( wordFightWinner + " wins!");
		
		
		scnr.close();
	}
}
