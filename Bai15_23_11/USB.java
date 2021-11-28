package Bai15_23_11;

public class USB {
	private String mahang;
	private int gia;
	private int soluong;
	
	public String getMahang() {
		return mahang;
	}
	
	public void setMahang(String mahang) {
		this.mahang = mahang;
	}
	
	public int getGia() {
		return gia;
	}
	
	public void setGia(int gia) {	
			this.gia = gia;
	}
	
	public int getSoluong() {
		return soluong;
	}
	
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
	public int tongTien() {
		return this.gia*this.soluong;
	}
	
	public String toString() {
		return this.mahang +"\t "+ this.gia+"\t "
				+this.soluong+"\t "+"\t "+this.tongTien();
	
	}
	public void show() {
		System.out.println("\t\t=====USB=====");
		System.out.println("MaHang\t Gia\t SoLuong\t TongTien");
		System.out.println(toString());
	}
}
