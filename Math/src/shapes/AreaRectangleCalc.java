package shapes;

import java.util.Scanner;
/*
 * 
 * This program calculates the area of a rectangle
 * @author: Jacob McLain
 */
public class AreaRectangleCalc {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("This is a program that takes two given sides of a rectangle and computes the area of that rectangle");
		System.out.println();
		System.out.println();
		System.out.print("Enter a number: ");
		double num1 = Integer.MAX_VALUE;
		double num2 = Integer.MIN_VALUE;
		while(!input.hasNextDouble())
		{
			System.out.println("You did not enter a number...\nTry Again!");
			input.nextLine();
		}
		num1 = input.nextDouble();
		System.out.println("You Entered: " + num1);
		
		System.out.print("Now enter another number: ");
		
		while(!input.hasNextDouble())
		{
			System.out.println("You did not enter a number...\nTry Again!");
			input.nextLine();
		}
		num2 = input.nextDouble();
		System.out.println("You Entered: " + num2);
		System.out.println();
		System.out.println("The two numbers you picked were: " + num1 + " & " + num2);
		System.out.println();
		
		double area = num1 * num2;
		System.out.println("The area of the rectangle with sides of length " + num1 + " & " + num2 + " is " + area);
		input.close();
	}
}
