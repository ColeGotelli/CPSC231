
public class Ch1Ex4 {
	public static void main(String[] args) {
		
		double mweight = 25; //in grams
		double mkill = 0.0004; //in ounces
		double desire = 72574; //in grams
		
		double amountToKillMouse = mkill/0.001;
		double amountToKillDieter = (amountToKillMouse * desire)/mweight;
		
		System.out.println("The dieter can drink " + amountToKillDieter + " ounces");
	}
}
