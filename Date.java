import java.util.InputMismatchException;
import java.util.Scanner;

public class Date implements Ordered{
	
	private int month;
	private int day;
	private int year;
	
	Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Date date = new Date(40, 13, 3001);
		date.convertDate();
		
		int days = 35;
		int mon = 14;
		int years = 999;
		
		Date date2 = new Date();
		date2.setDay(days);
		date2.setMonth(mon);
		date2.setYear(years);
		date2.convertDate();
		
	}
	
	public Date() {
		this (1, 1, 1000);
	}
	public Date(int day, int month, int year) {
		
		boolean done = false;
		
		while(!done) {
			try {
				if(month < 0 || month > 12) {
					throw new MonthException();
				}
				else if(day < 1 || day > 31) {
					throw new DayException();
				}
				else if(year < 1000 || year > 3000) {
					throw new YearException();
				}
				
				done = true;
					
			}
			catch(MonthException m) {
				System.out.println("Not an acceptable month. Try Again");
				month = keyboard.nextInt();
			}
			catch(DayException d) {
				System.out.println("Not an acceptable day. Try Again");
				day = keyboard.nextInt();
			}
			catch(YearException y) {
				System.out.println("Not an acceptable year. Try Again");
				year = keyboard.nextInt();
			}
		}
		
		this.day = day;
		this.month = month;
		this.year = year;
	}

	//copy constructor
	public Date(Date original) {
		this.day = original.day;
		this.month = original.month;
		this.year = original.year;
	}
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	
	
	public void setDay(int day) {
		boolean done = false;
		
		while(!done) {
			try {
				if(day < 1 || day > 31) {
					throw new DayException();
				}
				done = true;
				
			}
			catch(DayException d) {
				System.out.println("Not an acceptable day. Try Again");
				day = keyboard.nextInt();
			}
		}
		
		this.day = day;
	}
	
	
	
	public void setMonth(int month) {
		boolean done = false;
		
		while(!done) {
			try {
				if(month < 0 || month > 12) {
					throw new MonthException();
				}
				done = true;
				
			}
			catch(MonthException m) {
				System.out.println("Not an acceptable month. Try Again");
				month = keyboard.nextInt();
			}
		}
		this.month = month;
	}
	
	
	
	public void setYear(int year) {
		boolean done = false;
		
		while(!done) {
			try {
				if(year < 1000 || year > 3000) {
					throw new YearException();
				}
				done = true;
				
			}
			catch(YearException y) {
				System.out.println("Not an acceptable year. Try Again");
				year = keyboard.nextInt();
			}
		}
		this.year = year;
	}

	
	public static int zero() {
		return 0;
	}
	
	public boolean precedes(Object other) {
		if(other == null) {
			return false;
			}
			else if(!(other instanceof Date)) {
				return false;
			}
			else {
				Date otherDate = (Date) other;
				if (this.year < otherDate.year) {
					return true;
				}
				else if (this.year == otherDate.year && this.month < otherDate.month) {
					return true;
				}
				else if(this.year == otherDate.year && this.month == otherDate.month && this.day < otherDate.day) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		
	public boolean follows(Object other) {
		if (other == null) {
			return false;
		}
		else if(!(other instanceof Date)) {
			return false;
		}
		else {
			Date otherDate = (Date) other;
			return otherDate.precedes(this);
		}
	}
	
	public static boolean datesMatch(Date date1, Date date2) {
		if(date1 == null) {
			return (date2 == null);
		}
		else if (date2 == null) {
			return false;
		}
		else {
			return date1.equals(date2);
		}
	}
	
	public void convertDate() {
		String[] months = {"January", "February", "March", "April", "May", "June", 
				"July", "August", "September", "October", "November", "December"};
		String temp = "";
		
		for(int i = 0; i < months.length; ++i) {
			temp = months[month - 1];
		}
		
		System.out.println(temp + " " + day + ", " + year);
	}
	
	
}
