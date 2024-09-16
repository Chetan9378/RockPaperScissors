package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
		String[] rps = {"R","P","S"};
		String computerMove = rps[new Random().nextInt(rps.length)];
		
		String playerMove;
		
		while (true) 
		{
		System.out.println("Please enter your move : (R,P or S)");
		playerMove = scanner.nextLine(); 
		if (playerMove.equals("R") || playerMove.equals("P") || playerMove.equals("S") ) 
		{
			break;
		}
		System.out.println(playerMove + " is not a Valid Move !");
		}
		
		System.out.println("Computer played : " + computerMove);
		
		if (playerMove.equals(computerMove)) 
		{
			System.out.println("The game was a Tie ");
		}
		else if (playerMove.equals("R"))
		{
			if (computerMove.equals("P"))
			{
				System.out.println("You lose !");
			}
			
			else if (computerMove.equals("S")) 
			{
				System.out.println("You Win !");
			}
		}
		else if (playerMove.equals("P"))
		{
			if (computerMove.equals("R"))
			{
				System.out.println("You Win !");
			}
			
			else if (computerMove.equals("S")) 
			{
				System.out.println("You lose !");
			}
		}
		else if (playerMove.equals("S"))
		{
			if (computerMove.equals("P"))
			{
				System.out.println("You Win !");
			}
			
			else if (computerMove.equals("R")) 
			{
				System.out.println("You lose !");
			}
		}
		System.out.println("Do You Want to Play Again ?  : (Y/N) ");
		String playAgain = scanner.nextLine();
		
		if (!playAgain.equals("Y")) 
		{
			break;
		}
		}
		System.out.println("Game Ends Here");
		scanner.close();
	}
}
