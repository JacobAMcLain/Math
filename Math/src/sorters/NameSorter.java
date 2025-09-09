package sorters;

import java.util.Scanner;
import java.util.ArrayList;
public class NameSorter {

	public static void main(String[] args)
	{
		System.out.println("This is a name sorter\nYou will enter names and this program will sort them!");
		
		Scanner input = new Scanner(System.in);
		
		
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Type \"STOP\" to quit entering names");
		System.out.print("Enter a name to add to the sorting queue:");
		
		String name = input.next();
		while(!name.equalsIgnoreCase("stop"))
		{
			System.out.println("You entered: " + name);
			list.addLast(name);
			name = input.next();
		}
		list.sort(null);    //This is really easy with a pre-built sort method
		System.out.println("The names sorted are: ");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
		
		
		
		input.close();
	}
	
}
