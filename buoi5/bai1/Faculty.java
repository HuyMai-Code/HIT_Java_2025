package buoi5.bai1;

import java.util.Scanner;

public class Faculty {
    private String Name;
    private String Date;
    private School x;
    public Faculty() {
        x = new School();
    }
    public Faculty(String name, String date, School x) {
        this.Name = name;
        this.Date = date;
        this.x = x;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public String getDate() {
        return Date;
    }
    public void setDate(String date) {
        this.Date = date;
    }
    public School getX() {
        return x;
    }
    public void setX(School x) {
        this.x = x;
    }
    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten truong: ");
        String nameSchool = sc.nextLine();
        System.out.print("Nhap ngay vao truong: ");
        String dateSchool = sc.nextLine();
        x.setName(nameSchool);
        x.setDate(dateSchool);
        System.out.print("Nhap ten khoa: ");
        this.Name = sc.nextLine();
        System.out.print("Nhap ngay vao khoa: ");
        this.Date = sc.nextLine();
    }
    void Output() {
        System.out.println("Truong: " + x.getName() + "\nNgay vao truong: " + x.getDate() + "\nKhoa: " + getName() + "\nNgay vao khoa: " + getDate());
    }

}
