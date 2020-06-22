import java.util.Scanner;

public class Ch3Ex4 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the cost of the item");
		double cost = keyboard.nextDouble();
		
		System.out.println("Enter the number of years to elapse");
		double years = keyboard.nextDouble();
		
		System.out.println("Enter the rate of inflation as a percent (without the %)");
		double percent = keyboard.nextDouble();
		
		percent = 1 + percent/100;
		
		double newCost = cost;
		
		for(int i = 0; i < years; ++i) {
			cost = newCost;
			newCost = cost*percent;
		}
		
		System.out.print("The new price after " + years + " years is $");
		System.out.printf("%.2f", newCost);
	}
}
