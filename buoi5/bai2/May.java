package buoi5.bai2;

import java.util.Scanner;

public class May {
    private String MaMay;
    private String TenMay;
    private String TinhTrang;
    public May() {}
    public May(String maMay, String tenMay, String tinhTrang) {
        this.MaMay = maMay;
        this.TenMay = tenMay;
        this.TinhTrang = tinhTrang;
    }
    public String getMaMay() {
        return MaMay;
    }
    public void setMaMay(String maMay) {
        this.MaMay = maMay;
    }
    public String getTenMay() {
        return TenMay;
    }
    public void setTenMay(String tenMay) {
        this.TenMay = tenMay;
    }
    public String getTinhTrang() {
        return TinhTrang;
    }
    public void setTinhTrang(String tinhTrang) {
        this.TinhTrang = tinhTrang;
    }
    void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma may: ");
        this.MaMay = sc.nextLine();
        System.out.print("Nhap ten may: ");
        this.TenMay = sc.nextLine();
        System.out.print("Nhap tinh trang cua may: ");
        this.TinhTrang = sc.nextLine();
    }
    void Xuat() {
        System.out.println("Ma may: " + getMaMay() + "\nTen may: " + getTenMay() + "\nTinh trang: " + getTinhTrang());
    }
}
