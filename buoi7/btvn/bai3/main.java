package btvn.bai3;

import java.util.Scanner;

import btvn.bai2.Student;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager students = new StudentManager();
        int choose;
        do {
            System.out.println("===== QUAN LY HOC SINH =====");
            System.out.println("0.Them hoc sinh");
            System.out.println("1.In danh sach hoc sinh");
            System.out.println("2.Sap xep theo diem giam dan");
            System.out.println("3.Sap xep theo diem tang dan");
            System.out.println("4.Tim hoc sinh theo ten");
            System.out.println("5.Thoat");
            System.out.print("Chon thao tac: ");
            choose = sc.nextInt();
            if (choose == 1) {
                students.printStudents();
            } else if (choose == 2) {
                students.sortByScoreDesc();
            } else if (choose == 3) {
                students.sortByScoreAsc();
            } else if (choose == 4) {
                sc.nextLine();
                System.out.print("Nhap ten muon tim: ");
                String name = sc.nextLine();
                System.out.println(students.findByName(name).printInfo());
            } else if (choose == 5) {
                System.out.println("Da thoat!!!");
            } else if (choose == 0) {
                sc.nextLine();
                System.out.print("Id: ");
                String id = sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Score: ");
                double score = sc.nextDouble();
                System.out.print("Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Class: ");
                String class_name = sc.nextLine();
                System.out.print("Address: ");
                String address = sc.nextLine();
                students.addStudent(new Student(id, name, score, age, email, class_name, address));
            } else {
                System.out.println("Khong co thao tac nay!!!");
            }
        } while(choose != 5);
    }
}
