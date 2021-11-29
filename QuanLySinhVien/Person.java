package QuanLySinhVien;

import java.util.Scanner;

public class Person {
	String name;
	String sex;
	int birthYear;
	String address;
	
	public Person() {}
	public Person(String name, String sex, int birthYear, String address) {
		this.name = name;
		this.sex = sex;
		this.birthYear = birthYear;
		this.address = address;
	}
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------");
		System.out.println("Nhap ten nguoi");
		name = sc.nextLine();
		
		System.out.println("Nhap gioi tinh");
		sex = sc.nextLine();
		
		System.out.println("Nhap nam sinh");
		birthYear = Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhap dia chi");
		address = sc.nextLine();
		
	}
	
	public void showInfo() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", birthYear=" + birthYear + ", address=" + address + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public String getSex() {
		return sex;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
