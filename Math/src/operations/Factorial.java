package operations;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("This is a program that finds the factorial(!) of a number.");
		System.out.println();
		System.out.println();
		System.out.print("Enter an integer to find the factorial of: ");
		int num1 = Integer.MAX_VALUE;
		while(!input.hasNextInt())
		{
			System.out.println("You did not enter an integer...\nTry Again!");
			input.nextLine();
		}
		num1 = input.nextInt();
		System.out.println("You Entered: " + num1);
		int factsum = 1;
		for(int i = 1; i <= num1 ; i++)
		{
			factsum *= i;
		}
		System.out.println(num1 + "! is: " + factsum);
		input.close();
	}
}
