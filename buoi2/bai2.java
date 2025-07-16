package buoi2;

import java.util.Scanner;

public class bai2 {
    
    public static void main(String[] agrs) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap ten hoc sinh: ");
        String name = scanner.nextLine();

        System.out.print("Nhap tuoi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap lop: ");
        String name_class = scanner.nextLine();

        System.out.print("Nhap diem trung binh (GPA): ");
        float Gpa = scanner.nextFloat();

        System.out.print("\nTen: " + name + " - Tuoi: " + age + " - Lop: " + name_class + " - GPA: " + Gpa);


        scanner.close();
    }
}
