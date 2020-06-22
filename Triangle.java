
public class Triangle extends Figure{
	
	//This program only works with equilaterals
	
	private double height;
	private double base;
	private double side;
	
	public static void main(String[] args) {
		Triangle tri = new Triangle(3.0, 4.0, 4.5);
		
		tri.center();
	}
	
	public Triangle(double tall, double based, double sides) {
		this.height = tall;
		this.base = based;
		this.side = sides;
	}

	public double area() {
		double area = 0.5*height*base;
		return area;
	}
	
	public double perimeter() {
		double peri = side * 3;
		return peri;
	}
	
	public void draw() {
		for(int i = 1; i < side + 1; ++i) {
			for(int j = 0; j < side-(side-i); ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void erase() {
		System.out.println();
		System.out.println();
	}
	
	public void center() {
		this.erase();
		this.draw();
	}
}
