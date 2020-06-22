
public class Ch1Ex3 {
	public static void main(String[] args) {
		
		String first = "cole";
		String last = "gotelli";
		String end = "ay";
		
		String newf;
		String newl;
		
		newf = first.toUpperCase().charAt(1) + first.substring(2, first.length() ) + first.charAt(0) + end;
		newl = last.toUpperCase().charAt(1) + last.substring(2, last.length()) + last.charAt(0) + end;
		
		System.out.println(newf + " " + newl);
	}
}
