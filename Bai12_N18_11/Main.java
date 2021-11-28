package Bai12_N18_11;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Doan Thi Diem");
		p1.setYear(2001);
		p1.setCode("CT040132");
		p1.showPerson();
		
		Sinhvien sv1 = new Sinhvien();
		sv1.setName("Van Toan");
		sv1.setYear(2002);
		sv1.setCode("CT040432");
		sv1.setDebt(2000);
		sv1.showSinhvien();
	}
}
