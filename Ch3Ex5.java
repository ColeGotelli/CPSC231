
public class Ch3Ex5 {
	public static void main(String[] args) {
		
		double debt = 1000;
		double interestDebt = 0.0;
		double interest = 0.0;
		double difference = 0.0;
		double interestTotal = 0.0;
		int count = 0;


		for(int i = 0; debt >= 0; ++i)
		{
			interestDebt = debt;
			interest = interestDebt * 0.015;
			interestTotal += interest;
			difference = 50 - interest;
			debt -= difference;

			count = i + 1;
		}

		System.out.print("It will take " + count + " months. The total interest paid is $");
		System.out.printf("%.2f", interestTotal);
	}
}
