package rng;

import java.util.Scanner;
public class DiceRoller {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of sides that a dice could have: ");
		int num1 = Integer.MIN_VALUE;
		while(!input.hasNextInt())
		{
			System.out.println("You did not enter an integer...\nTry Again!");
			input.nextLine();
		}
		num1 = input.nextInt();
		System.out.println("You Entered: " + num1);
		System.out.println();
		System.out.println("That means you have a " + num1 + " sided dice.");
		System.out.println();
		System.out.println("Oooooo, what will it be?????");
		System.out.println();
		
		int rand = (int) (1 + Math.random() * num1);
		System.out.println("IT LANDED ON " + rand);
		
		input.close();
	}
}
