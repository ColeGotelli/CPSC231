import java.util.Scanner;


public class Ch3Ex6 {
	public static void main(String[] args) {
		
		boolean finish = false;
		
		Scanner keyboard = new Scanner(System.in);
		
		while(finish == false) {
			
			System.out.print("Enter the size of the green crud population (in pounds): ");
			int amount = keyboard.nextInt();
			
			System.out.print("Enter the number of days to pass: ");
			int days = keyboard.nextInt();
			
			int newSize = 0;
			
			//keeps the population the same if less than 5 days have elapsed
			if(days <= 5) {
				newSize = amount;
			}
			else if(days > 5) { 
				int oldAmount = amount;
				int newAmount = amount;
				int temp = 0;

				for(int i = 0; i < (days/5)-1; ++i) {
					temp = oldAmount;
					oldAmount = newAmount;
					newAmount = oldAmount + temp;
				}
				newSize = newAmount;
			}
			
			System.out.println("The new size of the population is " + newSize + " pounds of green crud");
			keyboard.nextLine();
			System.out.println("Would you like to calculate another population?");
			System.out.println("If yes, type (Y). If no, type (N): ");
			String another = keyboard.nextLine();
				if(another.equalsIgnoreCase("Y")) {
					finish = false;
				}
				else if(another.equalsIgnoreCase("N")) {
					finish = true;
				}
		}
	}
}
