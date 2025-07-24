package buoi3;

import java.util.Scanner;
import java.util.Random;

public class bai3 {

    public static String check(int a, int b, int c) {
        String kq;
        if (a + b == c) {
            kq = "dung";
        } else {
            kq = "sai";
        }
        
        return kq;
    }
    
    public static void result(String s, Scanner sc, String d) {
        System.out.print("Du doan ket qua cua phep toan (dung/sai): ");
        String result = sc.nextLine();
        if (result.equals(d)) {
            System.out.println("Ban du doan dung!!");
        } else {
            System.out.println("Ban du doan sai!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int a = rand.nextInt(0, 101);
        int b = rand.nextInt(0, 101);
        int c = rand.nextInt(0, 201);

        System.out.println("Phep toan cua ban la: ");
        System.out.println(a + " + " + b + " = " + c);

        String d = check(a, b, c);
        result(d, sc, d);

        
    }
}
