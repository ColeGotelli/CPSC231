import java.util.Scanner;


public class Ch1Ex5 {
	public static void main(String[] args) {
		
		String change = "hate";
		String oldS;
		String newS = "";
		
		Scanner origin = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		oldS = origin.nextLine();
		
		String[] s1 = oldS.split(" ");
		
		for(int i = 0; i < s1.length; ++i){
			if(change.equals(s1[i])) {
				newS += "love ";
			}
			else {
				newS += s1[i] + " ";
			}
			
		}
		
		System.out.println(newS);
	}
}
