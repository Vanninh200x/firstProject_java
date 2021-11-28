package Bai11_N18_11;

public class Manager extends Employee {
	int resSalary;
	int managerSalary;

	public int getResSalary() {
		return resSalary;
	}

	public void setResSalary(int resSalary) {
		this.resSalary = resSalary;
	}
	
	public int managerSalary(int resSalary) {
		return this.Salary(this.basicSalary, this.num)+ this.resSalary;
	}
	
	public void showManager() {
		super.showEmployee();
		System.out.println("ManagerSalary: " + this.managerSalary(resSalary));
		
	}
}
