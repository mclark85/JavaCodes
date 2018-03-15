/*Matt Clark
 * Program 7 Due: October 17,2017
 * Partner: None
 * This will program will have a user input a character and then convert that character into it's leet speak equivalent
 */
package mClark_Prog7;

import java.util.Scanner;

public class ConvertLeet 
{
	public static void main ( String [] args )
	{
		Scanner scnr = new Scanner (System.in);
		
		String leetLetter= "";
		
			System.out.println("Welcome to the Leet Converter");
			System.out.println();
			System.out.print("Enter a character to convert:  ");
				char userChar;
			userChar = scnr.next().charAt(0);
				
				switch (userChar) 
				{
					case 'a':
					case 'A':
						leetLetter= "/\\" ;
						break;
					case 'b':
					case 'B':
						leetLetter= "13";
						break;
					case 'c':
					case 'C':
						leetLetter= "(";
						break;
					case 'd':
					case 'D':
						leetLetter="1)";
						break;
					case 'e':
					case 'E':
						leetLetter="3";
						break;
					case 'f':
					case 'F':
						leetLetter="1=";
						break;
					case 'g':
					case 'G':
						leetLetter="6";
						break;
					case 'h':
					case 'H':
						leetLetter="#";
						break;
					case 'i':
					case 'I':
						leetLetter="1";
						break;
					case 'j':
					case 'J':
						leetLetter="_/";
						break;
					case 'k':
					case 'K':
						leetLetter="1<";
						break;
					case 'l':
					case 'L':
						leetLetter="!";
						break;
					case 'm':
					case 'M':
						leetLetter="/\\/\\";
						break;
					case 'n':
					case 'N':
						leetLetter="1\\1";
						break;
					case 'o':
					case 'O':
						leetLetter="()";
						break;
					case 'p':
					case 'P':
						leetLetter="1^";
						break;
					case 'q':
					case 'Q':
						leetLetter="&";
						break;
					case 'r':
					case 'R':
						leetLetter="12";
						break;
					case 's':
					case 'S':
						leetLetter="5";
						break;
					case 't':
					case 'T':
						leetLetter="+";
						break;
					case 'u':
					case 'U':
						leetLetter="/_/";
						break;
					case 'v':
					case 'V':
						leetLetter="\\/";
						break;
					case 'w':
					case 'W':
						leetLetter="|/\\|";
						break;
					case 'x':
					case 'X':
						leetLetter="><";
						break;
					case 'y':
					case 'Y':
						leetLetter="Y";
						break;
					case 'z':
					case 'Z':
						leetLetter="2";
						break;
					default:
						leetLetter="-";
				}
				System.out.printf("%s %s\n", userChar, leetLetter);
				
		scnr.close();
	}
}
