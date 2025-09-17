package operations;

import java.util.Scanner;
/*
 * 
 * This program takes a number and makes it positive if negative and does nothing if positive
 * @author: Jacob McLain
 */
public class AbsoluteValue {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("This is a program that finds the absolute value of a number.");
		System.out.println();
		System.out.println();
		System.out.print("Enter an number: ");
		double num1 = Integer.MAX_VALUE;
		while(!input.hasNextDouble())
		{
			System.out.println("You did not enter an number...\nTry Again!");
			input.nextLine();
		}
		num1 = input.nextDouble();
		System.out.println("You Entered: " + num1);
		double abs = Math.abs(num1);
		System.out.println("The absolute value of " + num1 + " is " + abs);
	}
}
