
public class PizzaOrder {

	private int pizzaNum = 0;
	private double total = 0.0;
	private Pizza pizArray[];
	
	/*private Pizza p1 = new Pizza();
	private Pizza p2 = new Pizza();
	private Pizza p3 = new Pizza();*/
	
	public static void main(String[] agrs) {
		Pizza pizza1 = new Pizza("large", 1, 0, 1);
		Pizza pizza2 = new Pizza("medium", 2, 2, 0);


		PizzaOrder order1 = new PizzaOrder(2);
		order1.setPizza(0, pizza1);
		order1.setPizza(1, pizza2);
		order1.getPizza(0);
		order1.getPizza(1);
		
		

		/*
		 * Didn't know if we were supposed to use cloning for the copy constructor
		 * or if there is another way so that aspect doesn't work
		 */
		/*PizzaOrder order2 = new PizzaOrder(order1);
		
		order2.getPizza1().setCheese(3);
		
		total = order2.calcTotal();
		double originalTotal = order1.calcTotal();
		
		System.out.println(total);
		System.out.println(originalTotal);*/
		
	}
	
	
	public PizzaOrder() {
		this (1);
	}
	/*public PizzaOrder(int numP, Pizza piz1) {
		this.pizzaNum = numP;
		this.setPizza1(piz1);
	}
	public PizzaOrder(int numP, Pizza piz1, Pizza piz2) {
		this.pizzaNum = numP;
		this.setPizza1(piz1);
		this.setPizza2(piz2);
	}
	public PizzaOrder(int numP, Pizza piz1, Pizza piz2, Pizza piz3) {
		this.pizzaNum = numP;
		this.setPizza1(piz1);
		this.setPizza2(piz2);
		this.setPizza3(piz3);
	}
	public PizzaOrder(PizzaOrder copyPizza) {
		this (copyPizza.pizzaNum, copyPizza.p1, copyPizza.p2, copyPizza.p3);
	}*/
	
	public PizzaOrder(int size) {
		Pizza newPiz[] = new Pizza[size];
		pizArray = newPiz;
	}
	
	
	
	public void setPizza(int index, Pizza p1) {
		pizArray[index] = p1;
	}
	public void getPizza(int index) {
		System.out.println(pizArray[index].getDescription());
	}
	
	/*public void setPizza1(Pizza pizza1) {
		this.p1 = pizza1;
	}
	public void setPizza2(Pizza pizza2) {
		this.p2 = pizza2;
	}
	public void setPizza3(Pizza pizza3) {
		this.p3 = pizza3;
	}*/
	
	
	
	/*public int getNumPizzas() {
		return pizzaNum;
	}
	public Pizza getPizza1() {
		return this.p1;
	}
	public Pizza getPizza2() {
		return this.p2;
	}
	public Pizza getPizza3() {
		return this.p3;
	}
	
	
	
	
	public double calcTotal() {
		if(this.pizzaNum == 1) {
			total = p1.calcCost();
		}
		else if(this.pizzaNum == 2) {
			total = p1.calcCost() + p2.calcCost();
		}
		else if(this.pizzaNum == 3) {
			total = p1.calcCost() + p2.calcCost() + p3.calcCost();
		}
		
		return total;
	}*/

}
