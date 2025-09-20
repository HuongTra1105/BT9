package Testing;

import java.util.Scanner;
import Class.QuanLy;

public class Test {

	public static void main(String[] args) {
		Scanner sc123 = new Scanner(System.in);

		QuanLy ql = new QuanLy();

		ql.nhapDanhSach(sc123);

		System.out.println("Danh sach sinh vien tra sach vao cuoi thang:");
		ql.hienThiDanhSachTraCuoiThang();

		sc123.close();
	}

}
