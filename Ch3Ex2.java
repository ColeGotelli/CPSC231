import java.util.Scanner;


public class Ch3Ex2 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//Gets the first color
		System.out.println("Enter the first color");
		System.out.print("The options are (R, G, B): "); //asks the user for one of the colors
		String str1 = keyboard.nextLine();
		str1 = str1.toUpperCase();
		while((str1.equals("R") || str1.equals("G") || str1.equals("B")) == false) { //if the input is not anything other than the three colors it asks for another color
			System.out.println("That was not an option. Try again. ");
			str1 = keyboard.nextLine();
			str1 = str1.toUpperCase();
		}
		
		
		
		//Gets the second color
		System.out.println("Enter the second color");
		System.out.print("The options are (R, G, B): "); //asks the user for one of the colors
		String str2 = keyboard.nextLine();
		str2 = str2.toUpperCase();
		while((str2.equals("R") || str2.equals("G") || str2.equals("B")) == false) { //if the input is not anything other than the three colors it asks for another color
			System.out.println("That was not an option. Try again. ");
			str2 = keyboard.nextLine();
			str2 = str2.toUpperCase();
		}
		while(str2.equalsIgnoreCase(str1)) { //checks if the input is the same as the previous and asks for anpther color if it is
			System.out.println("This stripe can't be the same color as the last one. Try again. ");
			str2 = keyboard.nextLine();
		}
		str2 = str2.toUpperCase();
		//THIS BLOCK IS THE SAME FOR THE OTHER THREE BLOCKS
		
		
		
		//Gets the third color
		System.out.println("Enter the third color");
		System.out.print("The options are (R, G, B): ");
		String str3 = keyboard.nextLine();
		str3 = str3.toUpperCase();
		while((str3.equals("R") || str3.equals("G") || str3.equals("B")) == false) {
			System.out.println("That was not an option. Try again. ");
			str3 = keyboard.nextLine();
			str3 = str3.toUpperCase();
		}
		while(str3.equalsIgnoreCase(str2)) {
			System.out.println("This stripe can't be the same color as the last one. Try again. ");
			str3 = keyboard.nextLine();
			str3 = str3.toUpperCase();
		}
		str3 = str3.toUpperCase();
		
		
		
		//Gets the fourth color
		System.out.println("Enter the fourth color");
		System.out.print("The options are (R, G, B): ");
		String str4 = keyboard.nextLine();
		str4 = str4.toUpperCase();
		while((str4.equals("R") || str4.equals("G") || str4.equals("B")) == false) {
			System.out.println("That was not an option. Try again. ");
			str4 = keyboard.nextLine();
			str4 = str4.toUpperCase();
		}
		while(str4.equalsIgnoreCase(str3)) {
			System.out.println("This stripe can't be the same color as the last one. Try again. ");
			str4 = keyboard.nextLine();
			str4 = str4.toUpperCase();
		}
		str4 = str4.toUpperCase();
		
		
		
		//Gets the fifth color
		System.out.println("Enter the fifth color");
		System.out.print("The options are (R, G, B): ");
		String str5 = keyboard.nextLine();
		str5 = str5.toUpperCase();
		while((str5.equals("R") || str5.equals("G") || str5.equals("B")) == false) {
			System.out.println("That was not an option. Try again. ");
			str5 = keyboard.nextLine();
			str5 = str5.toUpperCase();
		}
		while(str5.equalsIgnoreCase(str4)) {
			System.out.println("This stripe can't be the same color as the last one. Try again. ");
			str5 = keyboard.nextLine();
			str5 = str5.toUpperCase();
		}
		str5 = str5.toUpperCase();
		
		
		String str = str1 + str2 + str3 + str4 + str5;
		System.out.println();
		System.out.println("The pattern is " + str);

	}
}
