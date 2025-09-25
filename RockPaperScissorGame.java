package day5;
import java.util.Scanner;
public class RockPaperScissorGame {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome to Rock Paper Scissor Game.");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your choice");
		System.out.println("0: Rock, 1: Paper, 2: Scissor");
		
		int userChoice = scanner.nextInt();
		
		if (userChoice <0 || userChoice >2)
		{
			System.out.println("Invalid choice, Please run the program again and enter the choice 0,1 or 2");
			return;
		}
		 int computerChoice = (int) (Math.random()*3);
		 System.out.println(computerChoice);
		 
		 if (userChoice==computerChoice)
		 {
			 System.out.println("Its a tie.");
		 }
		 else if ((userChoice==0 && computerChoice==2) ||
		 (userChoice==1 && computerChoice==0) ||
		 (userChoice==2 && computerChoice==1))
		 {
			 System.out.println("You win");
		 }
		 else
		 {
			 System.out.println("Computer wins");
		 }
		 scanner.close();
	}

}
