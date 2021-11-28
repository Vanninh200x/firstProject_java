package Bai14_23_11;

public class HocSinhChuyenToan extends HocSinh{
	public double average() {
		return (double) (this.getToan()*2 + this.getLy() + this.getHoa())/4;
	}
	public void show() {
		super.showhs();
	}
} 
