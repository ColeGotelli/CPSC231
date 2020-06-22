import java.util.Scanner;


public class Ch1Ex1 {
	public static void main(String[] args) {
		
		double weight;
		double height;
		double bmi;
		
		
		Scanner kilos = new Scanner(System.in);
		System.out.println("Enter your weight in kilograms: ");
		weight = kilos.nextDouble();
		
		Scanner meters = new Scanner(System.in);
		System.out.println("Enter your height in meters: ");
		height = meters.nextDouble();
		
		bmi = weight/(height*height);
		
		System.out.println("Your Body Mass Index is " + bmi);
	}
}
