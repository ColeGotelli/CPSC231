import java.util.Scanner;


public class Ch2Ex3 {
	public static void main(String[] args) {
		
		Scanner num1 = new Scanner(System.in);
		System.out.println("Enter an number: ");
		double myNum1 = num1.nextDouble();
		
		Scanner num2 = new Scanner(System.in);
		System.out.println("Enter an number: ");
		double myNum2 = num2.nextDouble();
		
		System.out.println("The dividend is " + myNum1);
		System.out.println("The divisor is " + myNum2);
		System.out.println("The quotient is " + myNum1/myNum2);
		System.out.println("The remainder is " + myNum1%myNum2);
		
	}
}
