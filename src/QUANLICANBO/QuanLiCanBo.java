package QUANLICANBO;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiCanBo {
	 ArrayList<CanBo> canbo=new ArrayList<CanBo>();
	public static void main(String[] args) {
		CanBo nhanvien1 = new NhanVien("vo van tuan", "1998", "nam", "hue", "sinh vien");
		CanBo nhanvien2 = new NhanVien("vo tuan", "1999", "nam", "hue", "hoc sinh");
		CanBo nhanvien3 = new NhanVien("votuan", "1998", "nam", "danang", "sinh vien");
		CanBo nhanvien4 = new NhanVien("van tuan", "1998", "nam", "hue", "giao vien");
		ArrayList<CanBo> list = new ArrayList<CanBo>();
		list.add(nhanvien1);
		list.add(nhanvien2);
		list.add(nhanvien3);
		list.add(nhanvien4);
		
		CanBo congnhan1 = new CongNhan("nguyen van luan", "1998", "nam", "hue", "bac 3/7");
		CanBo congnhan2 = new CongNhan("nguyen luan", "1999", "nam", "da nang", "bac 4/7");
		ArrayList<CanBo> list1 = new ArrayList<CanBo>();
		list1.add(congnhan1);
		list1.add(congnhan2);
		
		CanBo kysu1 = new KySu("nguyen hoang minh", "1996", "nam", "quang nam", "cong nghe o to");
		CanBo kysu2 = new KySu("nguyen minh", "1998", "nu", "hue", "xay dung");
		ArrayList<CanBo> list2 = new ArrayList<CanBo>();
		list2.add(kysu1);
		list2.add(kysu2);
		
		ArrayList<CanBo> array=new ArrayList<CanBo>();
		array.addAll(list);
		array.addAll(list1);
		array.addAll(list2);
		for(CanBo cb:array)
		{
			System.out.println(cb.toString());
		}
		System.out.println("nhap ten can tim kiem");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		seachHoTen(array, name);
	}

	public static void  seachHoTen(ArrayList<CanBo> canbo,String name) {
	for(CanBo cb:canbo)
	{
		if(name.equals(cb.getHoten()))
		{
			System.out.println(cb.toString());
		}
		
	}
	
}

}
