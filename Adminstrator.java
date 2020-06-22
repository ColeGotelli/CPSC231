
public class Adminstrator extends SalariedEmployee{

	private String title = "";
	private String position = "";
	private String advisor = "";
	
	public Adminstrator(String theTitle, String thePosition, String theAdvisor) {
		this.title = theTitle;
		this.position = thePosition;
		this.advisor = theAdvisor;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getPosition() {
		return position;
	}
	
	public String getAdvisor() {
		return advisor;
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) {
			return false;
		}
		else if(getClass() != otherObject.getClass()) {
			return false;
		}
		else {
			Adminstrator otherAdmin = (Adminstrator)otherObject;
			return super.equals(otherObject) && this.title.equals(otherAdmin.title) && this.position.equals(otherAdmin.position) && this.advisor.equals(otherAdmin.advisor);
		}
	}
	
	public String toString() {
		return "The employee's title is " + getTitle() + " and their field is " + getPosition() + " and their advisor is " + getAdvisor();
	}
}
