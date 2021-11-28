package Bai12_N18_11;

public class Sinhvien extends Person{
	private int debt;

	public int getDebt() {
		return debt;
	}

	public void setDebt(int debt) {
		this.debt = debt;
	}
	
	void showSinhvien() {
		System.out.println();
		super.showPerson();
		System.out.println("Debt: "+this.debt);
	}
	
}	
