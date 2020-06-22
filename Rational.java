
public class Rational {
	
	private int numerator = 0;
	private int denom = 0;
	private boolean isNeg = false;

	public static void main(String[] args) {
		Rational rat1 = new Rational(1, 2);
		Rational rat2 = new Rational(4, 8);
		
		System.out.println(add(rat1, rat2));
		System.out.println(minus(rat1, rat2));
		System.out.println(multiply(rat1, rat2));
		System.out.println(divide(rat1, rat2));
		
		System.out.println(rat1.add(rat2));
		System.out.println(rat1.minus(rat2));
		System.out.println(rat1.multiply(rat2));
		System.out.println(rat1.divide(rat2));
		
		System.out.println(rat1.equals(rat2));
		
	}
	
	public Rational(int top, int bottom) {
		if(top < 0 && bottom < 0) {
			top = Math.abs(top);
			bottom = Math.abs(bottom);
			isNeg = false;
		}
		else if(top < 0) {
			top = Math.abs(top);
			isNeg = true;
		}
		else if(bottom < 0) {
			bottom = Math.abs(bottom);
			isNeg = true;
		}
		this.numerator = top;
		this.denom = bottom;
	}
	public Rational(int wholeNumber) {
		if(wholeNumber < 0) {
			wholeNumber = Math.abs(wholeNumber);
		}
		this.numerator = wholeNumber;
		this.denom = 1;
	}
	public Rational() {
		this (0, 1);
	}
	
	public void setNumerator(int up) {
		this.numerator = up;
	}
	public void setDenominator(int down) {
		this.denom = down;
	}
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denom;
	}
	
	public static Rational add(Rational r1, Rational r2) {
		Rational r3 = new Rational(0, 0);
		if((r1.isNeg == true && r2.isNeg == false) || (r1.isNeg == false && r2.isNeg == true)) {
			r1.numerator *= -1;
		}
		r3.numerator = r1.numerator * r2.denom + r2.numerator * r1.denom;
		r3.denom =  r1.denom * r2.denom;
		r1.numerator = Math.abs(r1.numerator);
		return r3;
	}
	public static Rational minus(Rational r1, Rational r2) {
		Rational r3 = new Rational(0, 0);
		if((r1.isNeg == true && r2.isNeg == false) || (r1.isNeg == false && r2.isNeg == true)) {
			r1.numerator *= -1;
		}
		r3.numerator = r1.numerator * r2.denom - r2.numerator * r1.denom;
		r3.denom =  r1.denom * r2.denom;
		r1.numerator = Math.abs(r1.numerator);
		return r3;
	}
	public static Rational multiply(Rational r1, Rational r2) {
		Rational r3 = new Rational(0, 0);
		if((r1.isNeg == true && r2.isNeg == false) || (r1.isNeg == false && r2.isNeg == true)) {
			r1.numerator *= -1;
		}
		r3.numerator = r1.numerator * r2.numerator;
		r3.denom =  r1.denom * r2.denom;
		r1.numerator = Math.abs(r1.numerator);
		return r3;
	}
	public static Rational divide(Rational r1, Rational r2) {
		Rational r3 = new Rational(0, 0);
		if((r1.isNeg == true && r2.isNeg == false) || (r1.isNeg == false && r2.isNeg == true)) {
			r1.numerator *= -1;
		}
		r3.numerator = r1.numerator * r2.denom;
		r3.denom =  r1.denom * r2.numerator;
		r1.numerator = Math.abs(r1.numerator);
		return r3;
	}
	
	
	
	public Rational add(Rational r1) {
		Rational r3 = new Rational(0, 0);
		if((this.isNeg == true && r1.isNeg == false) || (this.isNeg == false && r1.isNeg == true)) {
			this.numerator *= -1;
		}
		r3.numerator = this.numerator * r1.denom + r1.numerator * this.denom;
		r3.denom =  this.denom * r1.denom;
		this.numerator = Math.abs(this.numerator);
		return r3;
	}
	public Rational minus(Rational r1) {
		Rational r3 = new Rational(0, 0);
		if((this.isNeg == true && r1.isNeg == false) || (this.isNeg == false && r1.isNeg == true)) {
			this.numerator *= -1;
		}
		r3.numerator = this.numerator * r1.denom - r1.numerator * this.denom;
		r3.denom =  this.denom * r1.denom;
		this.numerator = Math.abs(this.numerator);
		return r3;
	}
	public Rational multiply(Rational r1) {
		Rational r3 = new Rational(0, 0);
		if((this.isNeg == true && r1.isNeg == false) || (r1.isNeg == false && this.isNeg == true)) {
			this.numerator *= -1;
		}
		r3.numerator = this.numerator * r1.numerator;
		r3.denom =  this.denom * r1.denom;
		this.numerator = Math.abs(this.numerator);
		return r3;
	}
	public Rational divide(Rational r1) {
		Rational r3 = new Rational(0, 0);
		if((this.isNeg == true && r1.isNeg == false) || (this.isNeg == false && r1.isNeg == true)) {
			this.numerator *= -1;
		}
		r3.numerator = this.numerator * r1.denom;
		r3.denom =  this.denom * r1.numerator;
		this.numerator = Math.abs(this.numerator);
		return r3;
	}
	
	
	
	/*
	 * These are the void methods
	 * 
	 * public void add(Rational r1) {
		Rational r3 = new Rational(0, 0);
		if((this.isNeg == true && r1.isNeg == false) || (this.isNeg == false && r1.isNeg == true)) {
			this.numerator *= -1;
		}
		r3.numerator = this.numerator * r1.denom + r1.numerator * this.denom;
		r3.denom =  this.denom * r1.denom;
		this.numerator = Math.abs(this.numerator);
		System.out.println(this);
	}
	public void minus(Rational r1) {
		Rational r3 = new Rational(0, 0);
		if((this.isNeg == true && r1.isNeg == false) || (this.isNeg == false && r1.isNeg == true)) {
			this.numerator *= -1;
		}
		r3.numerator = this.numerator * r1.denom - r1.numerator * this.denom;
		r3.denom =  this.denom * r1.denom;
		this.numerator = Math.abs(this.numerator);
		System.out.println(this);
	}
	 public void add(Rational r1) {
		Rational r3 = new Rational(0, 0);
		if((this.isNeg == true && r1.isNeg == false) || (r1.isNeg == false && this.isNeg == true)) {
			this.numerator *= -1;
		}
		r3.numerator = this.numerator * r1.numerator;
		r3.denom =  this.denom * r1.denom;
		this.numerator = Math.abs(this.numerator);
		System.out.println(this);
	}
	public void minus(Rational r1) {
		Rational r3 = new Rational(0, 0);
		if((this.isNeg == true && r1.isNeg == false) || (this.isNeg == false && r1.isNeg == true)) {
			this.numerator *= -1;
		}
		r3.numerator = this.numerator * r1.denom;
		r3.denom =  this.denom * r1.numerator;
		this.numerator = Math.abs(this.numerator);
		System.out.println(this);
	}
	 */

	
	public boolean equals(Rational r1) {
		return (this.numerator*r1.denom == this.denom*r1.numerator);
	}
	public String toString() {
		if(this.isNeg == true) {
			this.numerator *= -1;
		}
		return "The value of the fraction is " + this.numerator + "/" + this.denom;
	}
}
