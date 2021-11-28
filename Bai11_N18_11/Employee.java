package Bai11_N18_11;

public class Employee extends Person{
	int basicSalary;
	int num;
	
	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int Salary(int basicSalary, int num) {
		return this.getBasicSalary()*this.num;
	}
	
	public void showEmployee() {
		super.showPerson();
		System.out.println("BasicSalary: "+ this.basicSalary);
		System.out.println("Num: "+ this.num);
		System.out.println("Salary: "+ this.Salary(this.basicSalary, this.num));
	}

}
