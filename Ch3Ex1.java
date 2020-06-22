public class Ch3Ex1 {
	public static void main(String[] args) {
		
		
		double num = 25;
		double guess = num/2;
		double r = 0.0;
		double temp;
		
		System.out.println("The starting value is " + num);
		do {
			temp = guess;
			r = num/guess;
			guess = (guess + r)/2;
			
		}
		while((temp-guess)/guess > .01);

		
		System.out.print("The square root of the number is ");
		System.out.format("%.2f", guess);
	}
}
