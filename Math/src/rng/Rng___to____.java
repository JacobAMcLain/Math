package rng;
import java.util.Scanner;
public class Rng___to____ {

	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("This is a program that takes a range (given by user) and creates a random number based on that range");
		System.out.println();
		System.out.println();
		System.out.print("Enter a number: ");
		int num1 = Integer.MAX_VALUE;
		int num2 = Integer.MIN_VALUE;
		while(!input.hasNextInt())
		{
			System.out.println("You did not enter an integer...\nTry Again!");
			input.nextLine();
		}
		num1 = input.nextInt();
		System.out.println("You Entered: " + num1);
		
		
		
		while(!input.hasNextInt())
		{
			System.out.println("You did not enter an integer...\nTry Again!");
			input.nextLine();
		}
		num2 = input.nextInt();
		System.out.println("You Entered: " + num2);
		System.out.println();
		System.out.println("The two numbers you picked were: " + num1 + " & " + num2);
		System.out.println();
		if(num2 < num1)
		{
			int temp = num2; 
			num2 = num1;
			num1 = temp;
			System.out.println("Since you ordered them backwards, rearranging them to " + num1 + " & " + num2);
		}
		
		int rand = (int) (num1 + (Math.random()*(num2 - num1 + 1)));
		System.out.println("The random number between " + num1 + " & " + num2 + " is: " + rand);
	}
}
