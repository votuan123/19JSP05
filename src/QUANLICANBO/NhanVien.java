package QUANLICANBO;

import java.util.ArrayList;

public class NhanVien extends CanBo {

	String congviec;

	public NhanVien(String hoten, String namsinh, String gioitinh, String diachi, String congviec) {
		super(hoten, namsinh, gioitinh, diachi);
		// TODO Auto-generated constructor stub
		this.congviec = congviec;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+",cong viec : "+ congviec;

	}
}
