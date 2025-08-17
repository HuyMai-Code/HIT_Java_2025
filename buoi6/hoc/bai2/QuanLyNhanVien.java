package buoi6.hoc.bai2;

import java.util.ArrayList;

public class QuanLyNhanVien {
    ArrayList<NhanVien> nhieuNV = new ArrayList<>();
    public static double sumLuong;
    public QuanLyNhanVien() {}
    
    public QuanLyNhanVien(ArrayList<NhanVien> nhieuNV) {
        this.nhieuNV = nhieuNV;
    }
    public ArrayList<NhanVien> getNhieuNV() {
        return nhieuNV;
    }

    public void setNhieuNV(ArrayList<NhanVien> nhieuNV) {
        this.nhieuNV = nhieuNV;
    }
    public void themNhanVien(NhanVien nv) {
        nhieuNV.add(nv);
    }
    public void hienThiTatCa() {
        for (NhanVien nv : nhieuNV) {
            nv.hienThiThongTin();
        }
    }
    public double tinhTongLuong() {
        for (NhanVien nv : nhieuNV) {
            sumLuong += nv.tinhluong();
        }
        return sumLuong;
    }
}
