package QUANLICANBO;

public class KySu extends CanBo {
	String nganhdaotao;

	public KySu(String hoten, String namsinh, String gioitinh, String diachi,String nganhdaotao) {
		super(hoten, namsinh, gioitinh, diachi);
		// TODO Auto-generated constructor stub
		this.nganhdaotao=nganhdaotao;
	}
@Override
	public String toString() {
		// TODO Auto-generated method stub
	return super.toString()+",nganhdaotao : "+nganhdaotao;
}
}
