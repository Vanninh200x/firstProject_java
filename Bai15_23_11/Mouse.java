package Bai15_23_11;

public class Mouse extends USB{
	public int tongtien() {
		return this.getGia()*this.getSoluong()*8/10;
	}
	public String toString() {
		return this.getMahang()+"\t "+this.getGia()
		+"\t "+this.getSoluong()+"\t\t "+this.tongtien();
	}
	
	public void showmouse() {
		System.out.println("\t\t=====MOUSE=====");
		System.out.println("MaHang\t Gia\t SoLuong\t TongTien");
		System.out.println(toString());
	}
}
