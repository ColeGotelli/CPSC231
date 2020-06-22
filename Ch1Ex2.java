import java.util.Scanner;


public class Ch1Ex2 {
	public static void main(String[] args) {
		
		int coupons = 0;
		int bars = 0;
		int balls = 0;
		
		Scanner tickets = new Scanner(System.in);
		System.out.println("Enter the number of coupons you have: ");
		coupons = tickets.nextInt();
		
		while(coupons >= 3) {
			
			if(coupons >= 10) {
				bars++;
				coupons -= 10;
			}
			else {
				balls++;
				coupons -= 3;
			}
		}
		
		System.out.println("You can get " + bars + " candy bars and " + balls + " gumballs");
	}
}
