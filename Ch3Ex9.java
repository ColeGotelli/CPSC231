import java.util.Scanner;
import java.text.DecimalFormat;


public class Ch3Ex9 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");
		int numEx = 0;
		double earned = 0;
		double total = 0;
		
		
		System.out.println("Enter the number of exercises:");
		numEx = keyboard.nextInt();
		
		for(int i = 1; i < numEx + 1; ++i) {
			
			double score = 0;
			double points = 0;
			
			System.out.println("Score received for exercise " + i);
			score = keyboard.nextInt();
			earned += score;
			
			System.out.println("Total possible points for exercise " + i);
			points = keyboard.nextInt();
			total += points;
			
		}
		
		double percent = (earned/total)*100;
		
		System.out.print("Your total is " + earned + " out of " + total + " or " + df.format(percent) + "%");
		
	}
}
