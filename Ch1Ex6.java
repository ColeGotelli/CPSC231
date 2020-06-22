
public class Ch1Ex6 {
	public static void main(String[] args) {
		
		int princAmount = 1000;
		double intRate = 0.05; 
		int numYears = 5;
		
		double simpleInterest = (princAmount * intRate * numYears)/100;
		
		System.out.println("The simple interest is " + simpleInterest);
	}
}
