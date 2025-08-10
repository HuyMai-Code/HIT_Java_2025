package buoi5.bai2;

import java.util.Scanner;

public class QuanLy {
    private String MaQL;
    private String HoTen;
    public QuanLy() {}
    public QuanLy(String maQL, String hoTen) {
        this.MaQL = maQL;
        this.HoTen = hoTen;
    }
    public String getMaQL() {
        return MaQL;
    }
    public void setMaQL(String maQL) {
        this.MaQL = maQL;
    }
    public String getHoTen() {
        return HoTen;
    }
    public void setHoTen(String hoTen) {
        this.HoTen = hoTen;
    }
    void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma quan ly: ");
        this.MaQL = sc.nextLine();
        System.out.print("Nhap ten nguoi quan ly: ");
        this.HoTen = sc.nextLine();
    }
    void Xuat() {
        System.out.println("Ma quan ly: " + getMaQL() + "\nHo ten nguoi quan ly: " + getHoTen());
    }
}
