import java.util.Scanner;


public class Ch6Ex7 {
	
	/*I don't know why the question wants the input to be characters
	 * so i skipped that step and had the input start as an int
	*/
	
	public static final int arrLength = 20;
	
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int[] a = new int[arrLength];
		int[] b = new int[arrLength];
		int[] total = new int[arrLength];
		
		boolean done = false;
		boolean tooBig = false;
		
		while(done == false) {
			for(int i = 0; i < arrLength; ++i) {
				System.out.println("Enter a single digit for the first number");
				a[i] = keyboard.nextInt();
				while(a[i] > 9) {
					System.out.println("That number was too big, try again");
					System.out.println("Enter a single digit for the first number");
					a[i] = keyboard.nextInt();
				}
			}
			for(int i = 0; i < arrLength; ++i) {
				System.out.print(a[i]);
			}
			System.out.println();
			
			
			
			
			for(int i = 0; i < arrLength; ++i) {
				System.out.println("Enter a single digit for the second number");
				b[i] = keyboard.nextInt();
				while(b[i] > 9) {
					System.out.println("That number was too big, try again");
					System.out.println("Enter a single digit for the first number");
					b[i] = keyboard.nextInt();
				}
			}
			for(int i = 0; i < arrLength; ++i) {
				System.out.print(b[i]);
			}
			System.out.println();
			
			
			
			
			for(int i = 0; i < arrLength; ++i) {
				if(a[i] + b[i] > 9) {
					System.out.println("Integer Overflow");
					tooBig = true;
					break;
				}
				else {
					total[i] = a[i] + b[i];
				}
			}
			
			if(tooBig == false) {
				for(int i = 0; i < arrLength; ++i) {
					System.out.print(total[i]);
				}
			}
				
			System.out.println();
			keyboard.nextLine();
			System.out.println("Would you like to add new numbers? (Y/N): ");
			String answer = keyboard.nextLine();
			
			if(answer.equalsIgnoreCase("Y")) {
				done = false;
			}
			else if(answer.equalsIgnoreCase("N")) {
				done = true;
			}
		}
		
	}
	
	
}
