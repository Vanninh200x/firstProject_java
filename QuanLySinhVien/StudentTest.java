package QuanLySinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> studentList = new ArrayList<>();
		int choose,n;
		do {
			menu();
			choose = Integer.parseInt(sc.nextLine());
			switch(choose) {
			case 1:
				System.out.println("Nhap n sinh vien");
				n = Integer.parseInt(sc.nextLine());
				for (int i = 0; i < n; i++) {
					Student st = new Student();
					st.inputInfo();
					studentList.add(st);
				}
				
				break;
			case 2:
				for (int i = 0; i< studentList.size() ; i++) {
					studentList.get(i).showInfo();
				}
				break;		
			case 3:
				int minIndex = 0;
				int maxIndex = 0;
				double markMax = studentList.get(0).getMark();
				double markMin = studentList.get(0).getMark();
				for (int i = 1; i < studentList.size(); i++) {
					if(studentList.get(i).getMark() > markMax) {
						markMax = studentList.get(i).getMark();
						maxIndex = i;
					}
				}
				for(int i = 1; i < studentList.size(); i++) {
					if(studentList.get(i).getMark() < markMin) {
						markMin = studentList.get(i).getMark();
						minIndex = i;
					}
				}
				System.out.println("SV diem lon nhat");
				studentList.get(maxIndex).showInfo();
				System.out.println("SV diem be nhat");
				studentList.get(minIndex).showInfo();
				break;
			case 4:
				System.out.println("Nhap MSV can tim");
				String codeFind = sc.nextLine();
				int count=0;
				for (Student student : studentList) {
					if(student.getCode().equalsIgnoreCase(codeFind)) {
						System.out.println("DA TIM THAY");
						student.showInfo();
						count++;
					}
				}
				if(count == 0) {
					System.out.println("Khong tim thay MSV: " + codeFind);
				}
				break;
			case 5:
				
				break;
			case 6:
				for (Student student : studentList) {
					if(student.checkScholarship() == true) {
						student.showInfo();
					}
				}
				break;
			default:
				System.err.println("Nhap sai so moi nhap lai");
				break;
			}
		} while (choose!= 7);
	}
	static void menu() {
		System.out.println("---------MENU---------");
		System.out.println("1. Nhap vao n sinh vien");
		System.out.println("2. hien thi tat ca sv");
		System.out.println("3. Hien thi Diem cao nhat va thap nhat");
		System.out.println("4. Tim kiem sv theo MSV (ton tai va ko)");
		System.out.println("5. Hien thi sinh vien theo A-Z");
		System.out.println("6. Hien thi sinh vien hoc bong(diemcao>thap)");
		System.out.println("7. Thoat");
	}
}
