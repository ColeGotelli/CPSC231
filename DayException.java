
public class DayException extends Exception{

	public DayException() {
		super("That is not a valid month.");
	}
	
	public DayException(String message) {
		super(message);
	}
}
