package rng;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * 
 * This program is a game of Black Jack
 * @author: Jacob McLain
 * @date: 4/17/2025
 */
public class BlackJack {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("This program is a game of Black Jack (in which you try to get as close to 21 as possible without going over)");
		//Picking numbers to determine the first and second card you get
		int firstCard = (int) (Math.random()*52 + 1);
		
		int secondCard = (int) (Math.random()*52 + 1);
		while(secondCard == firstCard)
		{
			secondCard = (int) (Math.random()*52 + 1);
		}
		
		String firstSuit = "";
		String secondSuit = "";
		ArrayList<Integer> cardList = new ArrayList<Integer>();
		cardList.add(firstCard);
		cardList.add(secondCard);
		ArrayList<String> aces = new ArrayList<String>();
		//Determining the First Card's Suit
		if(firstCard / 13 == 0)
		{
			firstSuit = "Hearts";
		}
		else if(firstCard / 13 == 1)
		{
			firstSuit = "Clubs";
		}
		else if(firstCard / 13 == 2)
		{
			firstSuit = "Diamonds";
		}
		else
		{
			firstSuit = "Spades";
		}
		//Determining the Second Card's Suit
		if(secondCard / 13 == 0)
		{
			secondSuit = "Hearts";
		}
		else if(secondCard / 13 == 1)
		{
			secondSuit = "Clubs";
		}
		else if(secondCard / 13 == 2)
		{
			secondSuit = "Diamonds";
		}
		else
		{
			secondSuit = "Spades";
		}
		
		int firstCardNum = firstCard % 13 + 1;
		int secondCardNum = secondCard % 13 + 1;
		//Printing to the user what they got in terms of an actual card
		if(firstCardNum == 11)
		{
			System.out.println("You got a Jack of " + firstSuit);
			firstCardNum = 10;
		}
		else if(firstCardNum == 12)
		{
			System.out.println("You got a Queen of " + firstSuit);
			firstCardNum = 10;
		}
		else if(firstCardNum == 13)
		{
			System.out.println("You got a King of " + firstSuit);
			firstCardNum = 10;
		}
		else if(firstCardNum == 1)
		{
			System.out.println("You got an Ace of " + firstSuit);
			firstCardNum = 11;   //Need to add something in which you can change it to 1 
			aces.add("An Ace");
			
		}
		else
		{
			System.out.println("You got a " + firstCardNum + " of " + firstSuit);
		}
		
		//Same thing but with the second card
		if(secondCardNum == 11)
		{
			System.out.println("You got a Jack of " + secondSuit);
			secondCardNum = 10;
		}
		else if(secondCardNum == 12)
		{
			System.out.println("You got a Queen of " + secondSuit);
			secondCardNum = 10;
		}
		else if(secondCardNum == 13)
		{
			System.out.println("You got a King of " + secondSuit);
			secondCardNum = 10;
		}
		else if(secondCardNum == 1)
		{
			System.out.println("You got an Ace of " + secondSuit);
			secondCardNum = 11;   //Need to add something in which you can change it to 1 
			aces.add("An Ace");
		}
		else
		{
			System.out.println("You got a " + secondCardNum + " of " + secondSuit);
		}
		int total = firstCardNum + secondCardNum;
		System.out.println();
		System.out.println("Your total is now: " + total);
		System.out.println();
		if(total == 21)
		{
			System.out.println("You got 21!! You won Black Jack!!!!");
		}
		else if(total > 22)
		{
			System.out.println("Since you got 2 aces and went over 21, converting one of your aces to a 1");
			total -= 10;
			System.out.println("Your new total is: " + total);
			aces.remove(0);
		}
		else
		{
			System.out.print("Would you like to hit or stay? (H for hit or S for stay)");
			String choice = input.nextLine();
			while(!(choice.equalsIgnoreCase("H") || choice.equalsIgnoreCase("S")))
			{
				System.out.println("You did not enter H or S");
				System.out.println("Enter H or S");
				choice = input.nextLine();
			}
			if(choice.equalsIgnoreCase("S"))
			{
				System.out.println("Your total is: " + total);
			}
			else
			{
				
				while(total < 21 && choice.equalsIgnoreCase("H"))
				{
					System.out.println("Test1");
					boolean cardCheck = false;
					while(!cardCheck)
					{
						int newCard = (int) (Math.random()*52 + 1);
						System.out.println(newCard);
						cardCheck = true;
						for(int i = 0; i < cardList.size(); i++)
						{
							
							if(newCard == cardList.get(i))
							{
								cardCheck = false;
								cardList.add(newCard);
							}
							
							
						}
					
						
					}
					int newCard = cardList.get(cardList.size()-1);
				
					String newSuit = "";
					if(newCard / 13 == 0)
					{
						newSuit = "Hearts";
					}
					else if(newCard / 13 == 1)
					{
						newSuit = "Clubs";
					}
					else if(newCard / 13 == 2)
					{
						newSuit = "Diamonds";
					}
					else
					{
						newSuit = "Spades";
					}
			
					int newCardNum = firstCard % 13 + 1;
				
					//Printing to the user what they got in terms of an actual card
					if(newCardNum == 11)
					{
						System.out.println("You got a Jack of " + newSuit);
						newCardNum = 10;
					}
					else if(newCardNum == 12)
					{
						System.out.println("You got a Queen of " + newSuit);
						newCardNum = 10;
					}
					else if(newCardNum == 13)
					{
						System.out.println("You got a King of " + newSuit);
						newCardNum = 10;
					}
					else if(newCardNum == 1)
					{
						System.out.println("You got an Ace of " + newSuit);
						newCardNum = 11;   //Need to add something in which you can change it to 1 
						aces.add("An Ace");
					
					}
					else
					{
						System.out.println("You got a " + newCardNum + " of " + newSuit);
					}
					total += newCardNum;
					System.out.println();
					System.out.println("Your total is now: " + total);
					System.out.println();
					if(aces.size() > 0 && total > 21)
					{
						System.out.println("You have an ace! This means you still have a chance");
						total -= 10;
						aces.remove(0);
						System.out.println("Lowering your value to " + total);
					}
				
					else if(total < 21)
					{
						System.out.println("Would you like to hit again or stay? (H for hit and S for stay)");
						choice = input.nextLine();
						while(!(choice.equalsIgnoreCase("H") || choice.equalsIgnoreCase("S")))
						{
							System.out.println("You did not enter H or S");
							System.out.println("Enter H or S");
							choice = input.nextLine();
						}
					}
					else if(total == 21)
					{
						System.out.println("Congrats! You won Black Jack");
						choice = "Win";
					}
					else
					{
						System.out.println("You Busted because your total was greater than 21!");
					}
				
				}
				
			}
			
		}
		input.close();
	}
}
