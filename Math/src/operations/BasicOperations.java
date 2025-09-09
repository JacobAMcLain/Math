package operations;
import java.util.Scanner;
public class BasicOperations {
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers and an operation between them:");
		String express = input.nextLine();
		String noSpace = express.replaceAll("\\s", "");
		System.out.println("You Entered The Expression: " + noSpace);
		
		int num = 0;
		for(int i = 0; i < noSpace.length(); i++)
		{
			if(noSpace.substring(i, i+1).contains("+"))
			{
				num = i;
				break;
			}
			if(noSpace.substring(i, i+1).contains("-"))
			{
				num = i;
				break;
			}
			if(noSpace.substring(i, i+1).contains("*"))
			{
				num = i;
				break;
			}
			if(noSpace.substring(i, i+1).contains("/"))
			{
				num = i;
				break;
			}
			if(noSpace.substring(i, i+1).contains("%"))
			{
				num = i;
				break;
			}
		}
		if(num == 0)
		{
			input.close();
			throw new IllegalArgumentException("Expression entered wrong");
		}
		int firstNum = Integer.parseInt(noSpace.substring(0, num));
		String sign = noSpace.substring(num, num + 1);
		int secondNum = Integer.parseInt(noSpace.substring(num + 1));
		int calculation = 0;
		if(sign.equals("+"))
		{
			calculation = firstNum + secondNum;
		}
		if(sign.equals("-"))
		{
			calculation = firstNum - secondNum;
		}
		if(sign.equals("*"))
		{
			calculation = firstNum * secondNum;
		}
		if(sign.equals("/"))
		{
			calculation = firstNum / secondNum;	
		}
		if(sign.equals("%"))
		{
			calculation = firstNum % secondNum;	
		}
		
		
		System.out.println(calculation);
		
//		while(!flag1)
//		{
//			
//		}
//		for(int i = 0; i < express.length(); i++)
//		{
//			
//		}
		System.out.print("Would you like to perform an operation to your previous answer? ");
		String answer = input.nextLine();
		boolean flag = false;
		if(answer.substring(0,1).equalsIgnoreCase("y"))
		{
			System.out.println("I'm taking that as a YES");
			flag = true;
		}
		else
		{
			System.out.println("I'm taking that as a NO");
			
		}
		while(flag)
		{
			System.out.println("test");
			System.out.print("Enter an operation and a number:");
			express = input.next();
			noSpace = express.replaceAll("\\s", "");
			System.out.println("You Entered The Expression: " + noSpace);
			for(int i = 0; i < noSpace.length(); i++)
			{
				if(noSpace.substring(i, i+1).contains("+"))
				{
					num = i;
				}
				else if(noSpace.substring(i, i+1).contains("-"))
				{
					num = i;
				}
				else if(noSpace.substring(i, i+1).contains("*"))
				{
					num = i;
				}
				else if(noSpace.substring(i, i+1).contains("/"))
				{
					num = i;
				}
				else if(noSpace.substring(i, i+1).contains("%"))
				{
					num = i;
				}
			}
			sign = noSpace.substring(num, num + 1);
			secondNum = Integer.parseInt(noSpace.substring(num + 1));
		
			if(sign.equals("+"))
			{
				calculation = calculation + secondNum;
			}
			else if(sign.equals("-"))
			{
				calculation = calculation - secondNum;
			}
			else if(sign.equals("*"))
			{
				calculation = calculation * secondNum;
			}
			else if(sign.equals("/"))
			{
				calculation = calculation / secondNum;	
			}
			else if(sign.equals("%"))
			{
				calculation = calculation % secondNum;	
			}
			
			
			System.out.println(calculation);
			System.out.print("Would you like to perform an operation to your previous answer? ");
			answer = input.next();
			if(answer.substring(0,1).equalsIgnoreCase("y"))
			{
				System.out.println("I'm taking that as a YES");
				
			}
			else
			{
				System.out.println("I'm taking that as a NO");
				flag = false;
			}
		}	
		input.close();
		System.out.println("Basic Operations terminated");
	}
}
