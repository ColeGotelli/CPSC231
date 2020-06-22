
public class YearException extends Exception{

	public YearException() {
		super("That is not a valid month.");
	}
	
	public YearException(String message) {
		super(message);
	}
}
