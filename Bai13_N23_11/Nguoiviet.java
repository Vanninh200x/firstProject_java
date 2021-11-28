package Bai13_N23_11;

public class Nguoiviet {
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String toString() {
		return firstName+" "+lastName;
	}
	public void show() {
		System.out.println(toString());
	}
}	
