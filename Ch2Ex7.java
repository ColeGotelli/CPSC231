import java.util.Scanner;

public class Ch2Ex7 {
	public static void main(String[] args) {
		
		double price;
		double change = 0.0;
		int quart = 0;
		int dime = 0;
		int nick = 0;
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the price of your item in cents");
		System.out.println("(From 25 cents to a dollar with 5 cent increments): ");
		price = num.nextDouble();
		
		change = 100 - price;
		
		while(change >= 5) {
			if(change - 25 >= 0) {
				change -= 25;
				quart++;
			}
			else if(change - 10 >= 0) {
				change -= 10;
				dime++;
			}
			else if(change - 5 >= 0) {
				change -= 5;
				nick++;
			}
		}
		
		System.out.println("Your change is " + quart + " quarters, " + dime + " dimes, and " + nick + " nickels");
		
	}
}
