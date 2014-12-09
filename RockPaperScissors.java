import java.util.Scanner;

public class RockPaperScissors {

	/**
	 * Aven Stewart
	 * 11/12/2014
	 */
	
	static int computerwon = 0;                            // incremented in case computer wins
	static int humanwon = 0;                               // incremented if human wins
	static int draws = 0;                                  // incremented if draw occurs
	static String name = "ERROR";                               // initializes the name var
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);            // initializes the scanner
		System.out.print("enter the number of rounds to play : "); 
		int rounds = input.nextInt();
		System.out.println();
		welcome(input);
		for (int i = 1;i<=rounds;i++){                     // calls a given number of "rounds"
			System.out.println("Round "+i);
			game(input);                                   // calls the "game" function with the scanner input
		}
		summarize(rounds);
	}
	public static void welcome(Scanner input){
		System.out.println("Welcome to ROCK PAPER SCISSORS. Computer is your opponet.");
		System.out.print("Please type in your name and press return: ");
		name = input.next();
		System.out.println("Welcome "+name);
		System.out.println();
	}
	
	public static void game(Scanner input){               // definesa the game function. to be called "rounds" number of times in main
		int a = userroll(input);
		int b = AIroll();
		compare(a, b);
	}
	
	public static int userroll(Scanner input){            // takes the user's roll
		System.out.print("Enter your choice (1:ROCK, 2:PAPER, or 3:SCISSORS): ");
		int userchoice = input.nextInt();
		return userchoice;
	}
	
	public static int AIroll(){                           // rolls for the computer
		int AIchoice = (int) ((Math.random() * 3) + 1);
		return AIchoice;
	}
	
	public static void compare(int a, int  b){            // game logic function
		String result = "ERROR";                          // compares the choices and returns a winner
		
		if ( a == 1  && b == 3) {
		    result = name;
		}
		else if (a == 2 &&  b == 3){
		    result = name;
		}
		else if (a == 3 && b == 2){
		    result = name;
		}
		else if ( a == b){
		    result = "DRAW";
		}
		else {
			result = "COMPUTER";
		}
		
		if (result == "COMPUTER"){
			computerwon += 1;
		}
		else if (result == name){
			humanwon += 1;
		}
		else {
			draws += 1;
		}
		
		System.out.println("COMPUTER picked "+store_var(b)+", you picked "+store_var(a)+".");
		System.out.println(result+" won this round.\n");
	}
	
	public static String store_var(int choice){            // translates the number choices into strings     
		if (choice == 1){
			return "ROCK";
		}
		else if (choice == 2){
			return "PAPER";
		}
		else {
			return "SCISSORS";
		}
	}
	
	public static void summarize(int a){
		System.out.println("Number of games : "+a);
		System.out.println("Number of times computer won : "+computerwon);
		System.out.println("Number of times "+name+" won : "+humanwon);
		System.out.println("Number of draws : "+draws);
		if (computerwon > humanwon){
			System.out.println("Computer is the superior opponent.\nThe human race is doomed");
		}
		else if (humanwon > computerwon){
			System.out.println(name+" is superior.");
		}
		else {
			System.out.println("Opponents are equally matched.");
		}
	}
	
}
