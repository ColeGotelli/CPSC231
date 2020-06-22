
public class Ch2Ex4 {
	public static void main(String[] args) {
		
		double dist = 55;
		double speed = 15;
		
		double thour = (dist/speed);
		double tminute = ((dist/speed) - (int)(dist/speed))*60;
		
		System.out.println("The trip will take about " + (int)thour + " hours and " + tminute + " minutes");
		
	}
}
