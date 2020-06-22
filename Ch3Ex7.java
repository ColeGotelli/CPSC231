import java.util.Scanner;


public class Ch3Ex7 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		boolean finish = false;
		
		while(finish == false) {
			System.out.println("Enter a number to start the range");
			int first = keyboard.nextInt();
			
			System.out.println("Enter a number to end the range");
			int last = keyboard.nextInt();
			
			
			
			while(first < last) {
				
				
				int length = String.valueOf(first).length(); //gets the number of numbers in the int to determine the exponent
				int sum = 0;
				int value = first;
				
				//loops thru each digit by taking the remainder of the whole number and then putting it to the predetermined exponent
				for (int j = 1; j <= length; ++j) {
		            int digit = value % 10;
		            value = value / 10;
		            sum += Math.pow(digit, length);
		        }
				if(sum == first) {
					System.out.println(sum + " is an Armstrong number");
				}
				++first;
			}
			
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
