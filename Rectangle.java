
public class Rectangle extends Figure{

	private double length;
	private double width;
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5.0, 3.0);
		
		rect.center();
	}
	
	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}
	
	public double area() {
		double area = length*width;
		return area;
	}
	
	public double perimeter() {
		double peri = (length*2) + (width*2);
		return peri;
	}
	
	public void draw() {
		for(int i = 0; i < width; ++i) {
			for(int j = 0; j < length; ++j) {
				System.out.print("* ");
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
