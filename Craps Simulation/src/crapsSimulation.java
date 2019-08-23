import java.util.Scanner;


public class crapsSimulation 
{

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hello! What is your name?");
		String userName = userInput.nextLine();
		System.out.println("Nice to meet you " + userName + "! Ready for a great game of Craps?");
		int dice1 = (int)(Math.random()* 7) + 1; 

	}

}
