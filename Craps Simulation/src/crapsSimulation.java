import java.util.Scanner;


public class crapsSimulation 
{
	static String userName; 
	static Scanner userInput; 
	static Scanner userInput1;
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
		isStillRolling = true; 
		dice1 = (int)(Math.random()* 7) + 1; 
	    dice2 = (int)(Math.random()* 7) + 1;
	    totalDice = dice1 + dice2;
		   while (isStillRolling = true)
			{
				rollDice();
				rollAgain(); 
				dice1 = (int)(Math.random()* 7) + 1; 
				dice2 = (int)(Math.random()* 7) + 1; 
				totalDice = dice1 + dice2;
			}
	}
		
	public static void rollDice()
	{
		if (totalDice == 2 || totalDice == 12)
		{
			System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + totalDice + ". You lose, " + userName + ".");
			isStillRolling = false;
		}
		
		if (totalDice == 7 || totalDice == 11)
		{
			System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + totalDice + ". You win, " + userName + "!");
			isStillRolling = false;
		}
		
		else 
		{
			System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + totalDice); 
			isStillRolling = true;
		}
	}

		 public static void rollAgain()
		{ 
			    point = totalDice;
				System.out.println("Your point is: " + point + ", " + userName + ". Press enter to keep going!"); 
				String dummy = userInput1.nextLine(); 
				isStillRolling = true; 
				
			if (point == totalDice)
				{
				System.out.println("Congrats! You rolled a " + totalDice + " which is your point! You won, " + userName + "!");
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
			}
			
		}		
	 // test 
}

