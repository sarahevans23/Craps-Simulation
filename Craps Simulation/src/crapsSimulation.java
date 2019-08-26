import java.util.Scanner;


public class crapsSimulation 
{
	static String userName; 
	static Scanner userInput; 
	static int dice1;
	static int dice2;
	static int totalDice;
	static boolean isRolling; 
	static boolean isStillRolling; 
	static int point; 
	
public static void main(String[] args) 
{
	greetPlayer();
	getDice();
	rollDice();
	rollAgain(); 
	
}
	public static void greetPlayer()
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hello! What is your name?");
		userName = userInput.nextLine();
		System.out.println("Nice to meet you, " + userName + ".");
	}
	
	public static void getDice()
	{
		System.out.println("Let's get right into it!");
		isRolling = true;
		while (isRolling = true)
		{
		dice1 = (int)(Math.random()* 7) + 1; 
	    dice2 = (int)(Math.random()* 7) + 1; 
	    totalDice = dice1 + dice2;
	    rollDice();
	    rollAgain(); 
		}
	 
	}
		
	public static void rollDice()
	{
		if (totalDice == 2 || totalDice == 12)
		{
			System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + totalDice + ". You lose, " + userName + ".");
			isRolling = false;
		}
		
		if (totalDice == 7 || totalDice == 11)
		{
			System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + totalDice + ". You win, " + userName + "!");
			isRolling = false;
		}
		
		else 
		{
			System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + totalDice);
		}
	}

		 public static void rollAgain()
		{
			isStillRolling = true; 
			while (isStillRolling = true)
			{ 
			    point = totalDice; 
				System.out.println("Your point is: " + point + ", " + userName + ". Press enter to roll again!"); 	
		    	isStillRolling = false;
			
			
			if (totalDice == point)
				{
				System.out.println("Congrats! You rolled a " + point + " which is your point! You won, " + userName + "!");
				isStillRolling = false; 
				isRolling = false;
			}
			
			if (totalDice == 7)
			{
				System.out.println("You rolled a 7. You lose," + userName + ".");
				isStillRolling = false; 
				isRolling = false; 
	     	}
			
			else
			{
				isRolling = true;
			}
			
			}
		}
	}

