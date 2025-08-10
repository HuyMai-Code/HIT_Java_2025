package buoi5.bai2;

import java.util.Scanner;
import java.util.ArrayList;

public class PhongMay {
    private String MaPhong;
    private String TenPhong;
    private Double DienTich;
    private QuanLy x;
    private ArrayList<May> y = new ArrayList<>();
    private int n;

    public PhongMay() {
        x = new QuanLy();
        y = new ArrayList<>();
    }
    public PhongMay(String maPhong, String tenPhong, Double dienTich, QuanLy x, ArrayList<May> y, int n) {
        MaPhong = maPhong;
        TenPhong = tenPhong;
        DienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }
    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String maPhong) {
        MaPhong = maPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String tenPhong) {
        TenPhong = tenPhong;
    }

    public Double getDienTich() {
        return DienTich;
    }

    public void setDienTich(Double dienTich) {
        DienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }
    public ArrayList<May> getY() {
        return y;
    }

    public void setY(ArrayList<May> y) {
        this.y = y;
    }
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma phong: ");
        this.MaPhong = sc.nextLine();
        System.out.print("Nhap ten phong: ");
        this.TenPhong = sc.nextLine();
        System.out.print("Nhap dien tich phong: ");
        this.DienTich = sc.nextDouble();
        x.Nhap();
        System.out.print("Nhap so may trong phong: ");
        this.n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            May may = new May();
            System.out.println("May so " + (i + 1) + ": ");
            may.Nhap();
            y.add(may);
        }
    }
    void Xuat() {
        System.out.println("Ma phong: " + getMaPhong() + "\nTen phong: " + getTenPhong() + "\nDien tich phong: " + getDienTich());
        System.out.println("Co " + n + " may");
        int i = 1;
        for (May may : y) {
            System.out.println();
            System.out.println("May " + i + ": ");
            may.Xuat();
            i++;
        }
    }
}
