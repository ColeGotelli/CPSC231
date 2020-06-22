
public class MonthException extends Exception{

	public MonthException() {
		super("That is not a valid month.");
	}
	
	public MonthException(String message) {
		super(message);
	}
}
