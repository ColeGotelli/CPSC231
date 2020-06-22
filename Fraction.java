import java.util.Scanner;


public class Fraction {
	
	Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Fraction n1 = new Fraction(1, 0);
		
		Fraction n2 = new Fraction(1, 3);
		
		System.out.println(Fraction.equalityCheck(n1, n2));
		System.out.println(n1.equals(n2));
		System.out.println(n1.toString());
	}
	
	private int numerator;
	private int denom;
	
	public Fraction(int numerator, int denom) {
		
		boolean done = false;
		while(!done) {
			try {
				
				if(denom == 0) {
					throw new DivisionByZeroException();
				}
				done = true;
				
			}
			catch(DivisionByZeroException e) {
				System.out.println("Still a zero. Try Again");
				denom = keyboard.nextInt();
			}
		}
		this.numerator = numerator;
		this.denom = denom;
	}
	
	public Fraction() {
		this (0, 1);
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator) {
		
		boolean done = false;
		while(!done) {
			try {
				
				if(denom == 0) {
					throw new DivisionByZeroException();
				}
				done = true;
				
			}
			catch(DivisionByZeroException e) {
				System.out.println("Still a zero. Try Again");
				denom = keyboard.nextInt();
			}
		}
		this.denom = denominator;
		
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denom;
	}
	
	public static boolean equalityCheck(Fraction f1, Fraction f2) {
		return f1.numerator*f2.denom == f2.numerator*f1.denom;
	}
	
	public boolean equals(Fraction otherFraction) {
		return this.numerator*otherFraction.denom == otherFraction.numerator*this.denom;
	}
	
	public String toString() {
		return this.numerator + "/" + this.denom;
	}
	
	public boolean precedes(Object other) {
		if (other == null) {
			return false;
		}
		else if(!(other instanceof Fraction)) {
			return false;
		}
		else {
			Fraction otherFraction = (Fraction) other;
			if (this.denom > otherFraction.denom) {
				return false;
			}
			else if(this.numerator == otherFraction.numerator || this.denom == otherFraction.denom) {
				return false;
			}
			return this.numerator * otherFraction.denom < otherFraction.numerator * this.denom;
			
		}
	}
	
	public boolean follows(Object other) {
		if (other == null) {
			return false;
		}
		else if(!(other instanceof Fraction)) {
			return false;
		}
		else {
			Fraction otherFraction = (Fraction) other;
			return otherFraction.precedes(this);
		}
	}
}

