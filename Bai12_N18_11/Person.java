package Bai12_N18_11;

public class Person {
	private String name;
	private int year;
	private String code;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setYear(int year) {
		this.year = year; 
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getCode() {
		return code;
	}
	
	public void showPerson() {
		System.out.println("Name: "+ this.name);
		System.out.println("Year: "+ this.year);
		System.out.println("Code: "+ this.code);
		
	}
}
