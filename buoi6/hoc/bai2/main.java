package buoi6.hoc.bai2;

public class main {
    public static void main(String[] args) {
        QuanLyNhanVien nhom1 = new QuanLyNhanVien();
        nhom1.themNhanVien(new NhanVienFullTime("2024", "huy", 19, "huy06@gmail.com", "09xxxx", 1000, 100));
        nhom1.themNhanVien(new NhanVienPartTime("2024", "huy", 19, "huy06@gmail.com", "09xxxx", 8, 100));
        nhom1.hienThiTatCa();
        nhom1.tinhTongLuong();
        System.out.println("Tong luong: " + nhom1.sumLuong);
    }
}
