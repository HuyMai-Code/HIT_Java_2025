package buoi6.hoc.bai2;

public class NhanVienFullTime extends NhanVien {
    private double luongCoBan;
    private double tienThuong;
    public NhanVienFullTime() {}
    public NhanVienFullTime(String maNV, String ten, int tuoi, String email, String soDienThoai, double luongCoBan,
            double tienThuong) {
        super(maNV, ten, tuoi, email, soDienThoai);
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }
    public double getLuongCoBan() {
        return luongCoBan;
    }
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public double getTienThuong() {
        return tienThuong;
    }
    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }
    public double tinhLuong() {
        return getLuongCoBan() + getTienThuong();
    }
    public void hienThiThongTin() {
        System.out.println("Ma nhan vien: " + getMaNV() + ", Ten: " + getTen() + ", Tuoi: " + getTuoi() + ", Email: " + getEmail() + ", Sdt: " + getSoDienThoai());
        System.out.println("Luong: " + tinhluong());
        System.out.println("Loai: Full Time");
        System.out.println("--------------------------------------");
    }
}
