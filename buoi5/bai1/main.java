package buoi5.bai1;

import java.util.Scanner;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Student s = new Student();
            System.out.println("Nhap thong tin sv thu " + (i + 1) + ": ");
            s.Input();
            students.add(s);
        }
        int i = 1;
        for (Student student : students) {
            System.out.println();
            System.out.println("Sinh vien " + i + ": ");
            student.Output();
            i++;
        }
    }
}