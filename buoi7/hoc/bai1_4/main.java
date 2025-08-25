package hoc.bai1_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("a: ");
                a = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Loi: khong dc nhap ki tu khac so");
                sc.nextLine();
            }
        }
        validInput = false;
        while (!validInput) {
            try {
                System.out.print("b: ");
                b = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Loi: khong dc nhap ki tu khac so");
                sc.nextLine();
            }
        }

        try {
            int r = a/b;
            System.out.println("a / b = " + r);
        } catch (Exception e) {
            System.out.println("Loi: khong chia dc cho 0");
        }

    }
}
