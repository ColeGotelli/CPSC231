import java.util.Scanner;


public class Ch2Ex5 {
	public static void main(String[] args) {
		
		double percent;
		double gpa;
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter your percent in the class (without the '%'): ");
		percent = num.nextDouble();
		
		gpa = (percent/100)*4;
		
		System.out.println("Your GPA is " + gpa);
		
	}
}
