import java.util.Scanner;
public class IfElsePractice {

	/*
	 * Aven Stewart
	 * 11/7/2014
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = bikeride(input);
		System.out.println(a);
		int b = largest(123, 456, 34);
		System.out.println(b);
		boolean c = distinction();
		System.out.println(c);
		double d = distance(1,2,5,8);
		System.out.println(d);
		input.close();
	}
	public static String bikeride(Scanner input){ // bike ride 30 pts
		System.out.println("Temp : ");
		int temp = input.nextInt();
		System.out.println("Raining? (y/N): ");
		String rain = input.next();
		String returnvar = "";
		if (temp < 100){
			if (rain == "y"){
				if (temp > 70){
					returnvar = "Good weather for a bike ride";
				}
				else {
					returnvar = "Bad weather for a bike ride";
				}
			}
			else if (rain == "N") {
				if (temp > 40){
					returnvar = "Good weather for a bike ride";
				}
				else {
					returnvar = "Bad weather for a bike ride";
				}
			}
		}
		else {
			returnvar = "Too hot!";
		}
		return returnvar;	
	}
	public static int largest(int a, int b, int c){ // larger number 10 pts
		int returnvar = 0;
		if ((a > b) & a > c){
			returnvar = a;
		}
		else if ((b > a) & (b > c)){
			returnvar = b;
		}
		else{
			returnvar = c;
		}
		return  returnvar;
	}
	public static boolean distinction(){ // checks for distinct numbers 20 pts
		Scanner input = new Scanner(System.in);
		System.out.print("enter first number:");
		int a = input.nextInt();
		System.out.print("\nenter second number:");
		int b = input.nextInt();
		System.out.print("\nenter third number:");
		int c = input.nextInt();
		boolean returnvar;
		if (a == b & a == c){
			returnvar = false;
		}
		else{
			returnvar =  true;
		}
		input.close();
		return returnvar;
	}
	public static double distance(int x1, int y1, int x2, int y2){ // finds distance between points 20 pts
		double formuoli = Math.sqrt((((x2-x1)^2)+((y2-y1)^2)));
		return formuoli;
	}
		
}
