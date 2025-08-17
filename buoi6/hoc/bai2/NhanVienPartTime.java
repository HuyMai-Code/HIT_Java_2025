package buoi6.hoc.bai2;

public class NhanVienPartTime extends NhanVien{
    private int soGioLam;
    private double luongTheoGio;
    public NhanVienPartTime() {}
    public NhanVienPartTime(String maNV, String ten, int tuoi, String email, String soDienThoai, int soGioLam,
            double luongTheoGio) {
        super(maNV, ten, tuoi, email, soDienThoai);
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }
    public int getSoGioLam() {
        return soGioLam;
    }
    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }
    public double getLuongTheoGio() {
        return luongTheoGio;
    }
    public void setLuongTheoGio(double luongTheoGio) {
        this.luongTheoGio = luongTheoGio;
    }
    public double tinhLuong() {
        return getLuongTheoGio() + getSoGioLam();
    }
    public void hienThiThongTin() {
        System.out.println("Ma nhan vien: " + getMaNV() + ", Ten: " + getTen() + ", Tuoi: " + getTuoi() + ", Email: " + getEmail() + ", Sdt: " + getSoDienThoai());
        System.out.println("Luong: " + tinhluong());
        System.out.println("Loai: Part Time");
        System.out.println("--------------------------------------");
    }
}
