import java.util.Scanner;


public class Ch2Ex8 {
	public static void main(String[] args) {
		
		String str;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three string of words seperated by commas");
		System.out.println("(Ex. 'i, love, cpsc): ");
		str = input.nextLine();
		
		String[] s1 = str.split(", ");
		
		for(int i = 0; i < 3; ++i) {
			System.out.println(s1[i]);
		}
	}
	
}
