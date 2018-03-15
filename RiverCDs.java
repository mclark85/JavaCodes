/*Matt Clark
 * Program 11 Due: November 14, 2017
 * None
 * This program accepts a user dictated number of CD's and then allows the user to specify the genre, artist, and title of the CD's.  It then prints all the user's inputs in rows and columns.
 */

package mClark_Prog11;

import java.util.Scanner;

public class RiverCDs 
{
	public static void main ( String [] args)
	{
		Scanner scnr = new Scanner (System.in);
		
		final int col = 3;
		int rows = 0;
		String type = "" ;
		final String g = "Genre";
		final String a = "Artist";
		final String t = "Title";
		
		System.out.println("The River Catalog:");
		System.out.println();
		
		System.out.print("How many CD's do you have:  ");
		rows = scnr.nextInt();
		
		while (rows <= 0)
		{
			System.out.print("Must be a number greater than 0.\nHow many CD's do you have:  ");
			rows = scnr.nextInt();
		}	
		
		scnr.nextLine();
		System.out.println("For each CD, enter the genre, then the artist, then the title.");
		System.out.println();
		
		String [] [] arrCd = new String [rows][col];
		for ( int r = 0; r < arrCd.length; r++ )
		{
			int num = r;
			System.out.printf("For CD %d:\n",++num);
			for ( int c = 0; c < arrCd[r].length; c++ )
			{
				System.out.print("Enter:  ");
				type = scnr.nextLine();
				arrCd[r][c] = type;
			}
			System.out.println();
		}	
				
		System.out.println("Here is your catalog:");
		System.out.println();
		System.out.printf("%-20s%-20s%-20s\n", g, a, t);
		System.out.println();
		for ( int r = 0; r < arrCd.length; r++)
		{
			for ( int c = 0; c < arrCd[r].length; c++)
			{
				System.out.printf("%-20s",arrCd[r][c]);
			}
			System.out.println();
		}
		
		
		scnr.close();
	}
}
