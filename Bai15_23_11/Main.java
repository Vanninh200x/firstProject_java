package Bai15_23_11;

import java.util.Scanner;

public class Main {
	public static void main(String args[])		 {
		Scanner sc = new Scanner(System.in);
		USB us1 = new USB();
		us1.setMahang(sc.next());
		us1.setGia(sc.nextInt());
		us1.setSoluong(sc.nextInt());	
		
		
		Mouse mou1 = new Mouse();
		mou1.setMahang(sc.next());
		mou1.setGia(sc.nextInt());
		mou1.setSoluong(sc.nextInt());
		sc.close();
		mou1.showmouse();
		
		us1.show();
		
	}
}
