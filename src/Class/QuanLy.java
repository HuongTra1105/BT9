package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<TheMuon> ds123;

    public QuanLy() {
        ds123 = new ArrayList<TheMuon>(10);
    }
    public void themTheMuon(TheMuon theMuon123) {
        ds123.add(theMuon123);
    }
    public void nhapDanhSach(Scanner sc123) {
        TheMuon theMuon123;

        System.out.print("Nhap vao so luong the muon: ");
        int n123 = sc123.nextInt();
        sc123.nextLine();

        System.out.println("Nhap vao danh sach:");
        for (int i = 0; i < n123; i++) {
            System.out.println("The muon thu " + (i + 1) + " la:");
            theMuon123 = new TheMuon();
            theMuon123.nhapThongTin(sc123);
            themTheMuon(theMuon123);
        }
    }
    public void hienThiDanhSachTraCuoiThang() {
        for (TheMuon the123 : ds123) {
            if (the123.getHanTra().getDate() == 31 || the123.getHanTra().getDate() == 30) {
                the123.hienThiThongTin();
            }
        }
    }
}
