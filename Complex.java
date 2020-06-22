
public class Complex {
	
	private double real = 0.0;
	private double imaginary = 0.0;
	private String complex = "i";

	public static void main(String[] args) {
		Complex com1 = new Complex(2, 2);
		Complex com2 = new Complex(2, 2);
		
		System.out.println(add(com1, com2));
		System.out.println(minus(com1, com2));
		System.out.println(multiply(com1, com2));
		
		System.out.println(com1.add(com2));
		System.out.println(com1.minus(com2));
		System.out.println(com1.multiply(com2));
		
		System.out.println(com1.equals(com2));
		
		
	}
	
	public Complex(double real, double imagine) {
		this.real = real;
		this.imaginary = imagine;
	}
	public Complex(double realPart) {
		this.real = realPart;
		this.imaginary = 0.0;
	}
	public Complex() {
		this (0, 0);
	}
	
	public void setReal(double realNum) {
		this.real = realNum;
	}
	public void setImaginary(double image) {
		this.imaginary = image;
	}
	public double getReal() {
		return real;
	}
	public double getImaginary() {
		return imaginary;
	}
	
	public static Complex add(Complex c1, Complex c2) {
		Complex c3 = new Complex(0, 0);

		c3.real = c1.real + c2.real;
		c3.imaginary = c1.imaginary + c2.imaginary;
		return c3;
	}
	public static Complex minus(Complex c1, Complex c2) {
		Complex c3 = new Complex(0, 0);
		
		c3.real = c1.real - c2.real;
		c3.imaginary = c1.imaginary - c2.imaginary;
		return c3;
	}
	public static Complex multiply(Complex c1, Complex c2) {
		Complex c3 = new Complex(0, 0);
		
		c3.real = (c1.real * c2.real) - (c1.imaginary * c2.imaginary);
		c3.imaginary = (c1.real * c2.imaginary) - (c1.imaginary * c2.real);
		return c3;
	}
	
	
	
	public Complex add(Complex c1) {
		Complex c3 = new Complex(0, 0);

		c3.real = this.real + c1.real;
		c3.imaginary = this.imaginary + c1.imaginary;
		return c3;
	}
	public Complex minus(Complex c1) {
		Complex c3 = new Complex(0, 0);
		
		c3.real = this.real - c1.real;
		c3.imaginary = this.imaginary - c1.imaginary;
		return c3;
	}
	public Complex multiply(Complex c1) {
		Complex c3 = new Complex(0, 0);
		
		c3.real = (this.real * c1.real) - (this.imaginary * c1.imaginary);
		c3.imaginary = (this.real * c1.imaginary) - (this.imaginary * c1.real);
		return c3;
	}
	
	
	
	/*
	 * These are the void methods
	 * 
	 * public void add(Complex c1) {
		Complex c3 = new Complex(0, 0);

		c3.real = this.real + c1.real;
		c3.imaginary = this.imaginary + c1.imaginary;
		System.out.println(this);
	}
	public void minus(Complex c1) {
		Complex c3 = new Complex(0, 0);
		
		c3.real = this.real - c1.real;
		c3.imaginary = this.imaginary - c1.imaginary;
		System.out.println(this);
	}
	public void multiply(Complex c1) {
		Complex c3 = new Complex(0, 0);
		
		c3.real = (this.real * c1.real) - (this.imaginary * c1.imaginary);
		c3.imaginary = (this.real * c1.imaginary) - (this.imaginary * c1.real);
		System.out.println(this);
	}
	 */

	
	public boolean equals(Complex c1) {
		return (this.real == c1.real && this.imaginary == c1.imaginary);
	}
	public String toString() {
		return "The complex number is " + this.real + " + " + this.imaginary + complex;
	}
}
