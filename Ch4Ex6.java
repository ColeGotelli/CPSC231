import java.util.Scanner;


public class Ch4Ex6 {
	
	
	
	private double quiz1;
	private double quiz2;
	private double quiz3;
	private double mid1;
	private double final1;
	private double total;
	private String letter;
	
	Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Ch4Ex6 grade1 = new Ch4Ex6();
		
		grade1.setQuiz1();
		grade1.setQuiz2();
		grade1.setQuiz3();
		grade1.setMid();
		grade1.setFinal();
		
		grade1.computeTotal();
		grade1.overallGrade();
		grade1.letterGrade();
			
	}
	
	public Ch4Ex6(double num1, double num2, double num3, double num4, double num5) {
		this.quiz1 = num1;
		this.quiz2 = num2;
		this.quiz3 = num3;
		this.mid1 = num4;
		this.final1 = num5;
		
	}
	
	public Ch4Ex6() {
		this (0, 0, 0, 0, 0);
	}
	
	
	public void setQuiz1() {
		System.out.println("Enter the score of the first quiz (out of 10)");
		this.quiz1 = keyboard.nextDouble();
		this.quiz1 = quiz1/10;
	}
	public void setQuiz2() {
		System.out.println("Enter the score of the second quiz (out of 10)");
		this.quiz2 = keyboard.nextDouble();
		this.quiz2 = quiz2/10;
	}
	public void setQuiz3() {
		System.out.println("Enter the score of the third quiz (out of 10)");
		this.quiz3 = keyboard.nextDouble();
		this.quiz3 = quiz3/10;
	}
	public void setMid() {
		System.out.println("Enter the score of the midterm (out of 100)");
		this.mid1 = keyboard.nextDouble();
		this.mid1 = mid1/100;
	}
	public void setFinal() {
		System.out.println("Enter the score of the final (out of 100)");
		this.final1 = keyboard.nextDouble();
		this.final1 = final1/100;
	}
	
	
	public double getQuiz1() {
		return quiz1;
	}
	public double getQuiz2() {
		return quiz2;
	}
	public double getQuiz3() {
		return quiz3;
	}
	public double getMid() {
		return mid1;
	}
	public double getFinal() {
		return final1;
	}
	
	public double computeTotal() {
		double quizTot = 0;
		quizTot = (quiz1 + quiz2 + quiz3)/3;
		quizTot *= .25;
		total = quizTot + (mid1*.35) + (final1*.4);
		total *= 100;
		return total;
	}
	
	
	public static boolean equalityCheck(Ch4Ex6 foo1, Ch4Ex6 foo2) {
		return foo1 == foo2;
	}
	
	public boolean equals(Ch4Ex6 foobar) {
		return this == foobar;
	}
	
	public void overallGrade() {
		System.out.printf("%,.2f%n", this.computeTotal());
	}
	public void letterGrade() {
		if(this.total >= 90.00) {
			letter = "A";
		}
		else if(this.total >= 80 && this.total <= 90) {
			letter = "B";
		}
		else if(this.total >= 70.00 && this.total <= 80.00) {
			letter = "C";
		}
		else if(this.total >= 60.00 && this.total <= 70.00) {
			letter = "D";
		}
		else if(this.total <= 60.00) {
			letter = "F";
		}
		
		System.out.println("The letter grade is a " + letter);
	}
	
	
	public String toString() {
		return null;
	}
}
