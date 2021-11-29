package QuanLySinhVien;

import java.util.Scanner;

public class Student extends Person{
	String code;
	double mark;
	String email;
	Scanner sc = new Scanner(System.in);
	
	public Student() {}

	@Override
	public void inputInfo() {
		// TODO Auto-generated method stub
		super.inputInfo();
		System.out.println("Nhap MSV");		
		while(true) {		
			String codeInput = sc.nextLine();
			boolean check = setCode(codeInput);
			if(check) {
				break;
			}			
		}
			
		System.out.println("Nhap Diem");
		while(true) {
			double markInput = Double.parseDouble(sc.nextLine());	
			boolean check = setMark(markInput);
			if(check) {
				break;
			}
		}
		
		System.out.println("Email");
		while(true) {
			String emailInput = sc.nextLine();
			boolean check = setEmail(emailInput);
			if(check ) {
				break;
			}
		}
	}
	
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Student [code=" + code + ", mark=" + mark + ", email=" + email + "]";
	}

	public String getCode() {
		return code;
	}

	public double getMark() {
		return mark;
	}

	public String getEmail() {
		return email;
	}

	public boolean setCode(String code) {
		if(code != null && code.length() == 8) {
			this.code = code;
			return true;
		}else {
			System.err.println("Nhap lai MSV");
			return false;
		}
	}

	
	public boolean setMark(double mark) {
		if(mark >= 0 && mark <= 10) {
			this.mark = mark;
			return true;
		}else {
			System.err.println("Nhap lai Diem");
			return false;
		}
	}

	
	public boolean setEmail(String email) {
		if(email.contains("@") && !email.contains(" ") && email != null) {
			this.email = email;
			return true;
		}else {
			System.err.println("Nhap lai Email");
			return false;
		}
	}
	
	public boolean checkScholarship() {
		if(mark >= 8) {
			return true;
		}
		return false;
	}
}
