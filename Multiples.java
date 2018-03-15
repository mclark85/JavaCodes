/*Matt Clark
 * Program 5 Due: Oct. 3, 2017
 * Partners: None
 * This program will determine if an integer is even, odd, or a multiple of 11
 */
package mClark_Prog5;
import java.util.Scanner;

public class Multiples 
{
	public static void main (String [] args)
	{
		Scanner scnr = new Scanner(System.in);
			
			int userNum = 0;
		
		System.out.println("Welcome to the Odd/Even/Multiple Program");
		System.out.println();
		System.out.println("Enter a number and I will tell you if it is a multiple of 11 and odd or even.");
		System.out.println();
		System.out.print("Please enter a number:  ");
			userNum = scnr.nextInt();
		System.out.println();
		System.out.print( userNum );
			if (userNum%11==0)
			{
				System.out.print(":MULTIPLE");
			}
			else
			{
				System.out.print(":NOT");
			}
			if (userNum%2==0)
			{
				System.out.print(":EVEN");
			}
			else
			{
				System.out.print(":ODD");
			}
			System.out.println();
	
		scnr.close();
	}
}
