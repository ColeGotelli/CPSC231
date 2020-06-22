
public class Ch6Ex11 {
	
	public static void main(String[] args) {
		System.out.println(combination(10, 4));
	}
	
	public static int combination(int n, int r) {
		return (factorial(n)/(factorial(r)*factorial(n-r)));
	}

	public static int factorial(int n) {
		if(n == 0 || n ==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
}
