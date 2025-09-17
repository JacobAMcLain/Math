package sorters;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * 
 * This program retrieves numbers from the user and sorts them
 * @author: Jacob McLain
 */
public class NumberSorter {

	public static void main(String[] args)
	{
		System.out.println("This is a name sorter\nYou will enter names and this program will sort them!");
		
		Scanner input = new Scanner(System.in);
		
		
		ArrayList<Double> list = new ArrayList<Double>();
		System.out.println("Type \"STOP\" to quit entering numbers");
		System.out.print("Enter a number to add to the sorting queue:");
		
		String number = input.next();
		double decimal;
		while(!number.equalsIgnoreCase("stop"))
		{
			decimal = Double.parseDouble(number);   //Throws an error if it is not a double or stop because its trying to parse something that isnt double
			System.out.println("You entered: " + decimal);
			list.addLast(decimal);
			number = input.next();
		}
		list.sort(null);    //This is really easy with a pre-built sort method
		System.out.println("The numbers sorted are: ");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
		
		
		
		input.close();
	}
}
