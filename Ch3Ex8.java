import java.util.Scanner;

/*I couldn't think of a way to do this problem without an array
 * but we haven't done arrays yet so I hardcoded each value
 */

public class Ch3Ex8 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = keyboard.nextInt();
		
		int length = String.valueOf(num).length();
		int value = num;
		String str = "";
		int first = 0;
		int last = 0;
		
		for (int j = 0; j <= length - 1; ++j) {
            int digit = value % 10;
            
            if(j == 0) {
            	last = digit;
            }
            else if(j == length-1) {
            	first = digit;
            }
            
            if(digit == 0) {
            	str = "*" + str;
            }
            else if(digit == 1) {
            	str = "B" + str;
            }
            else if(digit == 2) {
            	str = "E" + str;
            }
            else if(digit == 3) {
            	str = "A" + str;
            }
            else if(digit == 4) {
            	str = "@" + str;
            }
            else if(digit == 5) {
            	str = "F" + str;
            }
            else if(digit == 6) {
            	str = "K" + str;
            }
            else if(digit == 7) {
            	str = "%" + str;
            }
            else if(digit == 8) {
            	str = "R" + str;
            }
            else if(digit == 9) {
            	str = "M" + str;
            }
            
            
            value = value / 10;
        
        }
		
		
		if(first%2 != 0 && last%2 != 0) {
			str = "X" + str.substring(1, str.length()-1) + "X";
		}
		else if((first%2 == 0 && last%2 == 0) && length > 1) {
			str = "$" + str.substring(1, str.length()-1) + "$";
		}
		else if(last == 0) {
			str = str.substring(0, str.length()-1) + "#";
		}
		
		System.out.println(str);
	}
}
