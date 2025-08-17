package buoi6.hoc.bai1;


import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<SinhVien> sv = new ArrayList<>();
        SinhVien sv1 = new SinhVien("2024", "huy", 9, new LopHoc("001", "Ktpm01"));
        SinhVien sv2 = new SinhVien("2024", "phuc", 8, new LopHoc("001", "Ktpm01"));
        SinhVien sv3 = new SinhVien("2024", "bao", 7, new LopHoc("001", "Ktpm01"));
        sv.add(sv1);
        sv.add(sv2);
        sv.add(sv3);
        for (SinhVien svs : sv) {
            svs.inThongTin();
        }
        SinhVien tmp = new SinhVien();
        for (SinhVien svs : sv) {
            if (svs.getDiemTB() > tmp.getDiemTB()) {
                tmp = svs;
            }
        }
        System.out.println("SInh vien co diem trung binh cao nhat: " + tmp.getHoTen() + ", voi diem TB: " + tmp.getDiemTB());
    }  
}
