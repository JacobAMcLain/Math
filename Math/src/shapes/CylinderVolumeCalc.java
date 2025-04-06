package shapes;

import java.util.Scanner;

public class CylinderVolumeCalc {
	
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("This is a program that finds volume of a cylinder given a radius or diameter.");
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
		
		
		System.out.println();
		System.out.println("Now enter a number for the height of the cylinder");
		double num2 = Integer.MAX_VALUE;
		while(!input.hasNextDouble())
		{
			System.out.println("You did not enter a number...\nTry Again!");
			input.nextLine();
		}
		num2 = input.nextDouble();
		System.out.println("You Entered: " + num1);
		if(choice.substring(0,1).equalsIgnoreCase("d"))
		{
			System.out.print("A cylinder of diameter " + num1 + " and a height of " + num2);
			num1 /= 2;
			double area = num1 * num1 * Math.PI * num2;
			System.out.println(" has an volume of "  + area);
			
		}
		else
		{
			System.out.print("A cylinder of radius " + num1 + " and a height of " + num2);
			double area = num1 * num1 * Math.PI * num2;
			System.out.println(" has an volume of "  + area);
		}
		input.close();
	}
}
