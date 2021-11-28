package Bai11_N18_11;

public class Programmer extends Student{
	int expYear;

	public int getExpYear() {
		return expYear;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}
	
	public void showProgramer() {
		super.showStudent();
		System.out.println("EXP Year: " + this.expYear);;
	}
}
