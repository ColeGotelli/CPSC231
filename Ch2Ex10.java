import java.util.Scanner;


public class Ch2Ex10 {
	public static void main(String[] args) {
		
		
		Scanner it1name = new Scanner(System.in);
		System.out.println("Enter the name of item 1: ");
		String name1 = it1name.nextLine();
		
		Scanner it1quantity = new Scanner(System.in);
		System.out.println("Enter the quantity of item 1: ");
		double quantity1 = it1quantity.nextDouble();
		
		Scanner it1price = new Scanner(System.in);
		System.out.println("Enter the price of item 1: ");
		double price1 = it1price.nextDouble();
		double tot1 = price1*quantity1;
		
		
		
		
		Scanner it2name = new Scanner(System.in);
		System.out.println("Enter the name of item 2: ");
		String name2 = it2name.nextLine();
		
		Scanner it2quantity = new Scanner(System.in);
		System.out.println("Enter the quantity of item 2: ");
		double quantity2 = it2quantity.nextDouble();
		
		Scanner it2price = new Scanner(System.in);
		System.out.println("Enter the price of item 2: ");
		double price2 = it2price.nextDouble();
		double tot2 = price2*quantity2;
		
		
		
		
		Scanner it3name = new Scanner(System.in);
		System.out.println("Enter the name of item 3: ");
		String name3 = it3name.nextLine();
		
		Scanner it3quantity = new Scanner(System.in);
		System.out.println("Enter the quantity of item 3: ");
		double quantity3 = it3quantity.nextDouble();
		
		Scanner it3price = new Scanner(System.in);
		System.out.println("Enter the price of item 3: ");
		double price3 = it3price.nextDouble();
		double tot3 = price3*quantity3;
		
		
		
		
		System.out.println("Your bill: ");
		System.out.println();
		System.out.printf("%-30s", "Item");
		System.out.printf("%-10s", "Quantity");
		System.out.printf("%-10s", "Price");
		System.out.printf("%-10s", "Total");
		System.out.println();
		
		System.out.printf("%-30s", name1);
		System.out.printf("%-10s", quantity1);
		System.out.printf("%-10s", price1);
		System.out.printf("%-10s", tot1);
		System.out.println();
		
		System.out.printf("%-30s", name2);
		System.out.printf("%-10s", quantity2);
		System.out.printf("%-10s", price2);
		System.out.printf("%-10s", tot2);
		System.out.println();
		
		System.out.printf("%-30s", name3);
		System.out.printf("%-10s", quantity3);
		System.out.printf("%-10s", price3);
		System.out.printf("%-10s", tot3);
		System.out.println();
		
		
		double subtotal = tot1 + tot2 + tot3;
		
		System.out.printf("%-50s", "Subtotal");
		System.out.printf("%-10s", subtotal);
		System.out.println();
		
		double saletax = subtotal * 0.0625;
		
		System.out.printf("%-50s", "6.25% Sales Tax");
		System.out.printf("%-10s", saletax);
		System.out.println();
		
		double total = subtotal + saletax;
		
		System.out.printf("%-50s", "Total");
		System.out.printf("%-10s", total);
		System.out.println();
		
	}
}
