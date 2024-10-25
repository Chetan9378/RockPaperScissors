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
		System.out.println("Please enter your move : (R,P or S)");   //Taking input from the user
		playerMove = scanner.nextLine().toUpperCase();
		if (playerMove.equals("R") || playerMove.equals("P") || playerMove.equals("S")) 
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
				System.out.println("Player lose , Computer Wins !");
				System.out.println("Reason is Paper covers Rock");
			}
			
			else if (computerMove.equals("S")) 
			{
				System.out.println("Player Wins , Computer lose !");
				System.out.println("Reason is Rock crushes Scissors");
			}
		}
		else if (playerMove.equals("P"))
		{
			if (computerMove.equals("R"))
			{
				System.out.println("Player Win, Computer lose !");
				System.out.println("Reason is Paper covers Rock");
			}
			
			else if (computerMove.equals("S")) 
			{
				System.out.println("Computer Wins, Player lose !");
				System.out.println("Reason is Scissors cut Paper");
			}
		}
		else if (playerMove.equals("S"))
		{
			if (computerMove.equals("P"))
			{
				System.out.println("Player Wins, Computer lose !");
				System.out.println("Reason is Scissors cut Paper");
			}
			
			else if (computerMove.equals("R")) 
			{
				System.out.println("Computer Wins, Player lose !");
				System.out.println("Reason is Rock crushes Scissors");
			}
		}
		
        // Input validation loop for replay option
        while (true)
        	{
            System.out.println("Do you want to play again? (Y/N)");
            String playAgain = scanner.nextLine().trim().toUpperCase();

            if (playAgain.equals("Y")) 
            {
                break; // Replay the game
            }
            else if (playAgain.equals("N")) 
            {
                // Confirm exit option
                while (true) 
                {
                    System.out.println("Are you sure you really want to exit the game? (Y/N)");
                    String confirmExit = scanner.nextLine().trim().toUpperCase();

                    if (confirmExit.equals("Y")) 
                    {
                        System.out.println("\nThanks for playing.\nHave a good day or night, depending on the time you play this game!");
                        scanner.close();
                        return; // Exit the game
                    }
                    else if (confirmExit.equals("N"))
                    {
                        System.out.println("\nResuming the game...");
                        break; // Go back to play
                    } 
                    else 
                    {
                        System.out.println("Invalid input. Please enter Y or N.");
                    }
                }
            
                break; // Exit outer loop to avoid replaying after confirming exit
            	}
            else 
            {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        	}
		} 
	}
}