
public class Vehicle {

	String manuName = "";
	int cylinder = 0;
	Person owner;
	
	public static void main(String[] args) {
		Date d1 = new Date(6, 3, 2017);
		Date d2 = new Date(7, 3, 2017);
		Person person = new Person("Cole", d1, d2);
		
		Vehicle vehicle = new Vehicle("Ford", 6, person);
		
		System.out.println(vehicle.getName());
		System.out.println(vehicle.getCylinder());
		
		
	}
	
	public Vehicle() {
		manuName = "";
		cylinder = 0;
	}
	
	public Vehicle(String name, int piston, Person own) {
		this.manuName = name;
		this.cylinder = piston;
		this.owner = own;
	}
	
	public void setName(String name) {
		this.manuName = name;
	}
	
	public void setCylinder(int valve) {
		this.cylinder = valve;
	}
	
	public void setOwner(Person p1) {
		this.owner = p1;
	}
	
	public String getName() {
		return manuName;
	}
	
	public int getCylinder() {
		return cylinder;
	}
	
	public Person getOwner() {
		return owner;
	}
}
