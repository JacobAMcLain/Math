package rng;
import java.util.Scanner;

/*
 * 
 * This application is a game of Black Jack
 * @author: Jacob McLain
 */
public class BlackJack {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("This program is a game of blackjack (in which you try to get as close to 21 as possible without going over)");
		//Picking numbers to determine the first and second card you get
		int firstCard = (int) (Math.random()*52 + 1);
		
		int secondCard = (int) (Math.random()*52 + 1);
		while(secondCard == firstCard)
		{
			secondCard = (int) (Math.random()*52 + 1);
		}
		System.out.println(firstCard);
		System.out.println(secondCard);
		String firstSuit = "";
		String secondSuit = "";
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
		System.out.println(firstCardNum);
		System.out.println(secondCardNum);
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
		}
		else
		{
			System.out.println("You got a " + secondCardNum + " of " + secondSuit);
		}
		int total = firstCardNum + secondCardNum;
		System.out.println();
		System.out.println("Your total is: " + total);
		System.out.println();
		if(firstCardNum + secondCardNum == 21)
		{
			System.out.println("You got 21!! You won Black Jack!!!!");
		}
	}
}
