import java.util.Scanner;


public class Ch3Ex3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		boolean finish = false;
		
		while(finish == false) {
			System.out.println("Enter the weight of a car in kilograms: ");
			double mass = keyboard.nextDouble();
			keyboard.nextLine();
			
			double weight;
			
			System.out.println("Enter (E) if you would like to calculate the force on Earth");
			System.out.println("Enter (M) if you would like to calculate the force on the Moon: ");
			String str = keyboard.nextLine();
			str = str.toUpperCase();
			
			if(str.equals("E")) {
				weight = mass*9.81;
				System.out.println("The weight on Earth is " + weight + " Newtons");
			}
			else if(str.equals("M")) {
				weight = (mass*9.81)/6;
				System.out.println("The weight on the Moon is " + weight + " Newtons");
			}
			

			System.out.println("Would you like to calculate the weigth of another car?");
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
