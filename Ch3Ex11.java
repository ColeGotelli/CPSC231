import java.util.Random;


public class Ch3Ex11 {
	public static void main(String[] args) {

		int temp2 = 0;
		int temp3 = 0;
		int con1 = 0;
		int con2 = 0;
		int con3 = 0;
		
		Random rand = new Random();
		
		System.out.println("Welcome to the game show. Three winners will be picked");
		System.out.println();
		
		//gets a random number for the first winner
		con1 = rand.nextInt(30) + 1;
		System.out.println("The first winner is " + con1);
		
		//picks a random number and makes sure it is different from the first
		temp2 = rand.nextInt(30) + 1;
		while(temp2 == con1) {
			temp2 = rand.nextInt(30) + 1;
		}
		if(temp2 != con1) {
			con2 = temp2;
			System.out.println("The second is " + con2);
			temp3 = rand.nextInt(30) + 1;
		}
		
		//picks a random number and makes sure it is different from the first and second
		while(temp3 == con2 || temp3 == con1) {
			temp3 = rand.nextInt(30) + 1;
		}
		if(temp3 != con2) {
			con3 = temp3;
			System.out.println("The third winner is " + con3);
		}
	}
}
