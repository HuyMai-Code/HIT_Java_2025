package buoi6.hoc.bai1;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;
    private LopHoc lop;
    public SinhVien() {}
    public SinhVien(String maSV, String hoTen, double diemTB, LopHoc lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.lop = lop;
    }
    public String getMaSV() {
        return maSV;
    }
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public double getDiemTB() {
        return diemTB;
    }
    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    public LopHoc getLop() {
        return lop;
    }
    public void setLop(LopHoc lop) {
        this.lop = lop;
    }
    public void setDiemTB(int diemTB) {
        this.diemTB = diemTB;
    }
    public void inThongTin() {
        System.out.println("Ma sv: " + getMaSV() + ", Ho ten: " + getHoTen() + ", Diem TB: " + getDiemTB());
        lop.inThongTin();
        System.out.println("-----------------------------");
    }
}
