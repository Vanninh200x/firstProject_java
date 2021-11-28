package Bai11_N18_11;

public class Main {
	public static void main(String args[]) {
		Person person1 = new Person();
		person1.setName("Anh1");
		person1.setAge(19);
		person1.setSex("Male");
		person1.showPerson();
		System.out.println("=================");
		
		Employee em1 = new Employee();
		em1.setName("Anh2");
		em1.setAge(20);
		em1.setSex("Male");
		em1.setBasicSalary(150);
		em1.setNum(2);
		em1.showEmployee();
		System.out.println("=================");
		
		Manager man1 = new Manager();
		man1.setName("Chi3");
		man1.setAge(20);
		man1.setSex("Female");
		man1.setBasicSalary(150);
		man1.setNum(3);
		man1.setResSalary(50);
		man1.showManager();
		System.out.println("=================");
		
		Student st1 = new Student();
		st1.setName("Anh4");
		st1.setAge(19);
		st1.setSex("Male");
		st1.setStudentCode("CT040190");
		st1.showStudent();
		
		System.out.println("=================");
		Programmer pm1 = new Programmer();
		pm1.setName("Chi5");
		pm1.setAge(21);
		pm1.setSex("Female");
		pm1.setStudentCode("ABC123");
		pm1.setExpYear(4);
		pm1.showProgramer();
		
	}
}
