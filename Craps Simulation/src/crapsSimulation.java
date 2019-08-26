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
		String userName = userInput.nextLine();
		System.out.println("Nice to meet you " + userName + ".");
	}
	
	public static void getDice()
	{
		System.out.println("Let's get right into it!");
		boolean isRolling = true;
		boolean isRolling1 = true;
		while (isRolling = true)
		{
		int dice1 = (int)(Math.random()* 7) + 1; 
		int dice2 = (int)(Math.random()* 7) + 1; 
		int totalDice = dice1 + dice2;
		rollDice();
		rollAgain(); 
		}
	}
		
	public static void rollDice()
	{
		System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + totalDice);
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
	}

		public static void rollAgain()
		{
			while (isStillRolling = true)
			{ 
				int point = totalDice; 
				System.out.println("Your point is: " + point + ", " + userName + ". Press enter to roll again!");
				String dummy1 = userInput.nextLine();
				isStillRolling = true; 		
			}
			
			if (totalDice == point)
			{
				System.out.println("Congrats! You rolled a " + point + " which is your point! You won, " + userName + "!");
				isStillRolling = false; 
			}
			
			if (totalDice == 7)
			{
				System.out.println("You rolled a 7. You lose," + userName + ".");
				isStillRolling = false; 
	     	}
			
			else
			{
				isRolling = true;
				isStillRolling = true; 
			}
			
			
		}
}

