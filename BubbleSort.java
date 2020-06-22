
public class BubbleSort {

	public static void main(String[] args) {
		
		int[] b = {1, 2, 5, 3, 8, 11, 9, 10};
		
		for(int i = 0; i < b.length; ++i) {
			System.out.print(b[i] + ", ");
		}
		
		bubbleSort(b);
		System.out.println();
		
		for(int i = 0; i < b.length; ++i) {
			System.out.print(b[i] + ", ");
		}
		
	}
	
	public static void bubbleSort(int[] num) {
		for(int i = 0; i < num.length-1; ++i) {
			if(num[i] > num[i+1]) {
				int temp = num[i];
				num[i] = num[i+1];
				num[i+1] = temp;
			}
		}
	}
}
