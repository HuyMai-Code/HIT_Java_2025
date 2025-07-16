package buoi2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten cua ban: ");
        String name = scanner.nextLine();

        System.out.print("Nhap tuoi cua ban: ");
        int age = scanner.nextInt();

        System.out.print("Nhap chieu cao cua ban: ");
        float height = scanner.nextFloat();
        
        System.out.print("Xin chao " + name + ", ban " + age + " tuoi và cao " + height + " met");

        scanner.close();
    }
}
