package Bai11_N18_11;

public class Student  extends Person{
	String studentCode;

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	
	public void showStudent() {
		super.showPerson();
		System.out.println("CODE: " + this.studentCode);
	}
}
