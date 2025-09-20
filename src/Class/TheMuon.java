package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
    private int soMuon123;
    private Date ngayMuon123;
    private Date hanTra123;
    private String soHieu123;

    public TheMuon() {

    }
    public TheMuon(int soMuon123, Date ngayMuon123, String soHieu123) {
        this.soMuon123 = soMuon123;
        this.ngayMuon123 = ngayMuon123;
        this.soHieu123 = soHieu123;
    }

    public void nhapThongTin(Scanner sc123) {
        super.nhapThongTin(sc123);

        System.out.print("\tNhap so muon: ");
        soMuon123 = sc123.nextInt();
        sc123.nextLine();

        System.out.print("\tNhap ngay muon: ");
        String strNgayMuon123 = sc123.nextLine();
        ngayMuon123 = strToDate(strNgayMuon123);

        String strNgayTra123 = "31-12-2020";
        hanTra123 = strToDate(strNgayTra123);

        System.out.print("\tNhap so hieu: ");
        soHieu123 = sc123.nextLine();
    }

    private Date strToDate(String strNgayMuon123) {
        Date date123 = null;
        SimpleDateFormat sdf123 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date123 = sdf123.parse(strNgayMuon123);
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay thang!");
        }
        return date123;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo phieu muon: " + soMuon123);
        System.out.println("\tNgay muon: " + ngayMuon123);
        System.out.println("\tHan tra: " + hanTra123);
        System.out.println("\tSo hieu: " + soHieu123);
    }

    public Date getHanTra() {
        return hanTra123;
    }
}
