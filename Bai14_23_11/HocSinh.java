package Bai14_23_11;

public class HocSinh {
	private String name;
	private String classroom;
	private int toan;
	private int ly;
	private int hoa;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getClassroom() {
		return classroom;
	}
	
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	
	public int getToan() {
		return toan;
	}

	public void setToan(int toan) {	
		this.toan = toan;		
	}

	public int getLy() {
		return ly;
	}

	public void setLy(int ly) {
		this.ly = ly;
	}

	public int getHoa() {
		return hoa;
	}

	public void setHoa(int hoa) {
		this.hoa = hoa;
	}
	
	public double average() {
		return (double) (this.toan + this.ly + this.hoa) / 3;
	}
	public void showhs() {
		System.out.println("Name: " + this.name);
		System.out.println("Class: " + this.classroom);
		System.out.println("Toan: "+this.toan);
		System.out.println("Ly: "+this.ly);
		System.out.println("Hoa: "+this.hoa);
		System.out.println("DTB:"+ this.average());
	}
}
