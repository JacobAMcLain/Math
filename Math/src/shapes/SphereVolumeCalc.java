package shapes;

import java.util.Scanner;

public class SphereVolumeCalc {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("This is a program that finds area of a circle given a radius or diameter.");
		System.out.println();
		System.out.println();
		System.out.println("Do you want to enter a radius(r) or diameter(d)");
		String choice = "";
		boolean flag = false;
		while(!flag)
		{
			choice = input.nextLine();
			if(choice.substring(0,1).equalsIgnoreCase("r") || choice.substring(0,1).equalsIgnoreCase("d"))
			{
				flag = true;
			}
			else
			{
				System.out.println("You did not enter r or d");
			}
		}
		
		
		System.out.print("Enter a number for what you picked: ");
		double num1 = Integer.MAX_VALUE;
		while(!input.hasNextDouble())
		{
			System.out.println("You did not enter a number...\nTry Again!");
			input.nextLine();
		}
		num1 = input.nextDouble();
		System.out.println("You Entered: " + num1);
		if(choice.substring(0,1).equalsIgnoreCase("d"))
		{
			
			System.out.print("A sphere of diameter " + num1);
			num1 /= 2;
			double volume = 1.33333333333333333333333333333333333333333333 * Math.PI * num1 * num1 * num1;
			System.out.println(" has a volume of "  + volume);
			
		}
		else
		{
			System.out.print("A sphere of radius " + num1);
			double volume = 1.33333333333333333333333333333333333333333333 * Math.PI * num1 * num1 * num1;
			System.out.println(" has a volume of "  + volume);
		}
		input.close();
	}
}
