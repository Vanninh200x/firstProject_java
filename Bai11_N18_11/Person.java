package Bai11_N18_11;

public class Person {
	public String name;
	public int age;
	public String sex;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	
	
	public void showPerson() {
		System.out.println("Name:" + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Sex: " + this.sex);
		
	}
	
}
