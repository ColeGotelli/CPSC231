
public class TowerOfHanoi {
	
	public static void main(String[] args) {
		tower(10);
	}
	
	public static void tower(int n) {
		hanoiHelp(n, "Tower 1", "Tower 2", "Tower 3");
	}
	
	public static void hanoiHelp(int n, String s, String i, String d) {
		if(n == 1) {
			System.out.println("Move the top disk of " + s + " to " + d + ".");
		}
		else {
			hanoiHelp(n-1, s, d, i);
			hanoiHelp(1, s, i, d);
			hanoiHelp(n-1, i, s, d);
		}
	}
}
