package shapes;

import java.util.Scanner;
/*
 * 
 * This program calculates hypotenuse of a triangle given 2 legs
 * @author: Jacob McLain
 */
public class Pythag {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("This is a program that finds hypotenuse of a triangle given two legs.");
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
		
		
		System.out.print("Enter another number: ");
		double num2 = Integer.MAX_VALUE;
		while(!input.hasNextDouble())
		{
			System.out.println("You did not enter an number...\nTry Again!");
			input.nextLine();
		}
		num2 = input.nextDouble();
		System.out.println("You Entered: " + num2);
		input.close();
		System.out.print("Given legs of " + num1 + " & " + num2);
		num1 *= num1;
		num2 *= num2;
		double hypo = num1 + num2;
		hypo = Math.sqrt(hypo);
		System.out.println(", the hypotenuse of the triangle is " + hypo);
		
	}
}
