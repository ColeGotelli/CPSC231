
public class Money {
	
	private int dollar = 0;
	private int cent = 0;

	public static void main(String[] args) {
		Money mon1 = new Money(2, 50);
		Money mon2 = new Money(5, 75);
		
		System.out.println(mon1.equals(mon2));
		System.out.println(mon1.toString());
		System.out.println(mon2.toString());
		
		for(int i = 0; i < 3; ++i) {
			add(mon1, mon2);
		}
		
		minus(mon1, mon2);
		
		System.out.println(mon1.toString());
		System.out.println(mon2.toString());
		
		mon1.add(mon2);
		
		System.out.println(mon1.toString());
		
		mon1.minus(mon2);
		
		System.out.println(mon1.toString());
		
	}
	
	
	
	
	public Money(int bills, int coins) {
		this.dollar = bills;
		this.cent = coins;
	}
	public Money(int cash) {
		this.dollar = cash;
	}
	public Money() {
		this (0, 0);
	}
	
	
	public void setDollar(int dollars) {
		this.dollar = dollars;
	}
	public void setCents(int cents) {
		this.cent = cents;
	}
	public int getDollars() {
		return dollar;
	}
	public int getCents() {
		return cent;
	}
	
	
	
	public static Money add(Money m1, Money m2) {
		m1.dollar += m2.dollar;
		m1.cent += m2.cent;
		return m1;
	}
	public static Money minus(Money m1, Money m2) {
		m1.dollar -= m2.dollar;
		m1.cent -= m2.cent;
		return m1;
	}
	
	
	
	public Money add(Money dinero) {
		this.dollar += dinero.dollar;
		this.cent += dinero.cent;
		return this;
	}
	public Money minus(Money dinero) {
		this.dollar -= dinero.dollar;
		this.cent -= dinero.cent;
		return this;
	}
	
	
	
	
	/*
	 * These are the void methods
	 * 
	 * public void add(Money dinero) {
		this.dollar += dinero.dollar;
		this.cent += dinero.cent;
		System.out.println(this);
	}
	public void minus(Money dinero) {
		this.dollar -= dinero.dollar;
		this.cent -= dinero.cent;
		System.out.println(this);
	}
	 */
	
	
	
	public boolean equals(Money stacks) {
		return this == stacks;
	}
	public String toString() {
		return "The current amount of money is $" + this.dollar + "." + this.cent;
	}
	
}
