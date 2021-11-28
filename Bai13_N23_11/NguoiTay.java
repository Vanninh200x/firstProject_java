package Bai13_N23_11;

public class NguoiTay extends Nguoiviet{
	public String toString() {
		return getLastName() + " " + getFirstName();
	}
	public void showTay() {
		System.out.println(toString());
	}
}
