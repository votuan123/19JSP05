package QUANLICANBO;

public class CanBo {
	private String hoten;
	private String namsinh;
	private String gioitinh;
	private String diachi;

	public CanBo(String hoten, String namsinh, String gioitinh, String diachi) {
		super();
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getNamsinh() {
		return namsinh;
	}

	public void setNansinh(String namsinh) {
		this.namsinh = namsinh;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "name= " + hoten + ", nam sinh = " + namsinh + ",gioitinh = " + gioitinh + ",dia chi = " + diachi ;
	}
}
