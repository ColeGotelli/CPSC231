
public class Truck extends Vehicle{
	
	private double load;
	private int towing;
	
	public Truck(Vehicle v1, double weight, int tow) {
		this.load = weight;
		this.towing = tow;
	}
	
	public void setLoad(double loaded) {
		this.load = loaded;
	}
	
	public void setTow(int towed) {
		this.towing = towed;
	}
	
	public double getLoad() {
		return load;
	}
	
	public int getTow() {
		return towing;
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) {
			return false;
		}
		else if(getClass() != otherObject.getClass()) {
			return false;
		}
		else {
			Truck otherTruck = (Truck)otherObject;
			return super.equals(otherObject) && this.getLoad() == otherTruck.getLoad() && this.getTow() == otherTruck.getTow();
		}
	}
	
	public String toString() {
		return "The truck can take a load of " + getLoad() + " tons and can tow " + getTow() + " pounds.";
	}
}
