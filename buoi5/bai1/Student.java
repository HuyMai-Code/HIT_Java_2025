package buoi5.bai1;

import java.util.Scanner;

public class Student {
    private String Name;
    private String Class;
    private Double Score;
    private Faculty y;
    public Student() {
        y = new Faculty();
    }
    public Student(String name, String class1, Double score, Faculty y) {
        this.Name = name;
        this.Class = class1;
        this.Score = score;
        this.y = y;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public String getClassName() {
        return Class;
    }
    public void setClassName(String class1) {
        this.Class = class1;
    }
    public Double getScore() {
        return Score;
    }
    public void setScore(Double score) {
        this.Score = score;
    }
    public Faculty getY() {
        return y;
    }
    public void setY(Faculty y) {
        this.y = y;
    }
    void Input() {
        Scanner sc = new Scanner(System.in);
        y.Input();
        System.out.print("Nhap ten sinh vien: ");
        this.Name = sc.nextLine();
        System.out.print("Nhap lop: ");
        this.Class = sc.nextLine();
        System.out.print("Nhap diem: ");
        this.Score = sc.nextDouble();
    }
    void Output() {
        y.Output();
        System.out.println("Ten: " + getName() + "\nLop: " + getClassName() + "\nDiem: " + getScore());
    }
}
