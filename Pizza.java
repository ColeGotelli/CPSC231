
public class Pizza {

	private String psize;
	private int numCheese;
	private int numPep;
	private int numHam;
	
	
	public static void main(String[] args) {
		Pizza p1 = new Pizza("large", 1, 1, 2);
		Pizza p2 = new Pizza("medium", 2, 3, 2);
		Pizza p3 = new Pizza("small", 4, 1, 2);
		
		System.out.println(p1.getDescription());
		System.out.println(p2.getDescription());
		System.out.println(p3.getDescription());
	}
	
	public Pizza() {
		this ("", 0, 0, 0);
	}
	
	public Pizza(String str, int num1, int num2, int num3) {
		this.psize = str;
		this.numCheese = num1;
		this.numPep = num2;
		this.numHam = num3;
	}
	
	public void setSize(String size) {
		this.psize = size;
	}
	public void setCheese(int cheese) {
		this.numCheese = cheese;
	}
	public void setPep(int pepper) {
		this.numPep = pepper;
	}
	public void setHam(int ham) {
		this.numHam = ham;
	}
	
	
	public String getSize() {
		return psize;
	}
	public int getCheese() {
		return numCheese;
	}
	public int getPep() {
		return numPep;
	}
	public int getHam() {
		return numHam;
	}
	
	public double calcCost() {
		double cost = 0.0;
		if(psize.equalsIgnoreCase("small")) {
			cost += 10;
		}
		else if(psize.equalsIgnoreCase("medium")) {
			cost += 12;
		}
		else if(psize.equalsIgnoreCase("large")) {
			cost += 14;
		}
		cost += this.getCheese()*2 + this.getPep()*2 + this.getHam()*2;
		
		return cost;
	}
	
	public String getDescription() {
		return "The size of the pizza is " + this.getSize() + " and there are " + this.getCheese() + " cheese toppings, " + this.getPep() + " pepperoni toppings, and " + this.getHam() + " ham toppings. The total is $" + this.calcCost();
	}

}
