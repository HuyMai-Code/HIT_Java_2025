package buoi3;

import java.util.Scanner;

public class bai1 {

    static final String s = "Square";
    static final String t = "Triangle";
    static final String c = "Circle";
    static final double PI = 3.14;

    public static double dienTichVuong(double canh) {
        double dt = canh * canh;
        return dt;
    }
    public static double dienTichTamGiac(double cc, double cd) {
        double dt = (cc * cd) / 2;
        return dt;
    }
    public static double dienTichTron(double r) {
        double dt = r * r * PI;
        return dt;
    }

    public static void check(String type, Scanner sc) {
        if (type.equalsIgnoreCase(s)) {
            System.out.print("Canh cua hinh vuong: ");
            double canh = sc.nextDouble();
            System.out.println("Dien tich cua hinh vuong: " + dienTichVuong(canh) + " cm²");
        } else if (type.equalsIgnoreCase(t)) {
            System.out.print("Chieu cao cua hinh tam giac: ");
            double cc = sc.nextDouble();
            System.out.print("Canh day cua hinh tam giac: ");
            double cd = sc.nextDouble();
            System.out.println("Dien tich cua hinh tam giac: " + dienTichTamGiac(cc, cd) + " cm²");
        } else if (type.equalsIgnoreCase(c)) {
            System.out.print("Ban kinh cua hinh tron: ");
            double r = sc.nextDouble();
            System.out.println("Dien tich cua hinh tron: " + dienTichTron(r) + " cm²");
        } else {
            System.out.println("Hinh dang khong hop le!!!");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Type: ");
        String type = sc.nextLine();

        check(type, sc);

    }
}
