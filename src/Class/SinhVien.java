package Class;
import java.util.Scanner;

public class SinhVien {
    protected String hoTen123;
    protected String maSV123;
    protected String ngaySinh123;
    protected String lop123;

    public SinhVien() {
    }
    public SinhVien(String hoTen123, String maSV123, String ngaySinh123, String lop123) {
        this.hoTen123 = hoTen123;
        this.maSV123 = maSV123;
        this.ngaySinh123 = ngaySinh123;
        this.lop123 = lop123;
    }
    public void nhapThongTin(Scanner sc123) {
        System.out.print("\tNhap ho ten: ");
        hoTen123 = sc123.nextLine();

        System.out.print("\tNhap ma sinh vien: ");
        maSV123 = sc123.nextLine();

        System.out.print("\tNhap ngay sinh: ");
        ngaySinh123 = sc123.nextLine();

        System.out.print("\tNhap lop: ");
        lop123 = sc123.nextLine();
    }
    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen123);
        System.out.println("\tNgay sinh: " + ngaySinh123);
        System.out.println("\tMa sinh vien: " + maSV123);
        System.out.println("\tLop: " + lop123);
    }
}
