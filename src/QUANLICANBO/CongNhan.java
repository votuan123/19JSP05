package QUANLICANBO;

public class CongNhan extends CanBo {
	String bac;

	public CongNhan(String hoten, String namsinh, String gioitinh, String diachi, String bac) {
		super(hoten, namsinh, gioitinh, diachi);
		// TODO Auto-generated constructor stub
		this.bac = bac;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+",bac : "+bac;
	}
}
