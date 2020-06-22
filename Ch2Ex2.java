import java.util.Scanner;


public class Ch2Ex2 {
	public static void main(String[] args) {
		
		String first;
		String last;
		String end = "ay";
		
		Scanner origin = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		first = origin.nextLine();
		first = first.toLowerCase();
		
		Scanner lname = new Scanner(System.in);
		System.out.println("Enter your last name: ");
		last = lname.nextLine();
		last = last.toLowerCase();
		
		String newf;
		String newl;
		
		newf = first.toUpperCase().charAt(1) + first.substring(2, first.length() ) + first.charAt(0) + end;
		newl = last.toUpperCase().charAt(1) + last.substring(2, last.length()) + last.charAt(0) + end;

		System.out.println(newf + " " + newl);
	}
}
