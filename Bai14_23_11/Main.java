package Bai14_23_11;

public class Main {
	public static void main(String args[]) {
		HocSinh hs = new HocSinh();
		hs.setName("Van Tom");
		hs.setClassroom("12A5");
		hs.setToan(66);
		hs.setLy(8);
		hs.setHoa(9);
		hs.average();
		hs.showhs();
		System.out.println();
		HocSinhChuyenToan hsct = new HocSinhChuyenToan();
		hsct.setName("A Lu");
		hsct.setClassroom("12A4");
		hsct.setToan(6);
		hsct.setLy(8);
		hsct.setHoa(9);
		hsct.show();
	}
}
