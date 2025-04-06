package shapes;

import java.util.Scanner;

public class AreaSquareCalc {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("This is a program that finds area of a square given a side length.");
		System.out.println();
		System.out.println();
		System.out.print("Enter an number: ");
		double num1 = Integer.MAX_VALUE;
		while(!input.hasNextDouble())
		{
			System.out.println("You did not enter a number...\nTry Again!");
			input.nextLine();
		}
		num1 = input.nextDouble();
		System.out.println("You Entered: " + num1);
		System.out.print("The area of the square with a side length of " + num1);
		num1 *= num1;
		System.out.println(" is " + num1);
	}
}
