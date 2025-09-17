package operations;
import java.util.Scanner;
/*
 * 
 * This program can calculate a root to any degree of any number given by the user
 * @author: Jacob McLain
 */
public class Roots {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		boolean flag = false;
		
		System.out.print("Enter an integer to determine what degree root: ");
		int root = input.nextInt();
		
		
		double num = Integer.MIN_VALUE;
		while(num == Integer.MIN_VALUE)
		{
			System.out.print("Enter an integer/double (what you are taking the root of): ");
			num = input.nextDouble();
		}
		
		if(num < 0)
		{
			flag = true;
			num = num * -1;
		}
		double answer = Math.pow(num, 1.0/ root);
		if(answer % 1 > 0.999 || answer % 1 < 0.002)
		{
			int rounded = (int) Math.round(answer);
			if(flag)
			System.out.println("The " + root + " root of " + num + " is " + rounded + "i");
			else
			System.out.println("The " + root + " root of " + num + " is " + rounded);
		}
		else
		{
			if(flag)
			System.out.println("The " + root + " root of " + num + " is " + answer + "i");
			else
			System.out.println("The " + root + " root of " + num + " is " + answer);
		}
		
		input.close();
	}
}
