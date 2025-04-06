package shapes;

import java.util.Scanner;

public class CubeVolumeCalc {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("This is a program that finds volume of a cube given a side length.");
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
		System.out.print("The volume of the cube with a side length of " + num1);
		num1 = num1 * num1 * num1;
		System.out.println(" is " + num1);
		
		input.close();
	}
}
