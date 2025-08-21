package btvn.bai1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        int count = 0;
        int count2 = 0;
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
                tmp += c;
                count ++;
            }
            if (c >= 'A' & c <= 'Z') {
                count2 ++;
            }
        }
        System.out.println("Co " + count + " phan tu nguyen am");
        System.out.print("Cac phan tu nguyen am: ");
        for (int i = 0; i < tmp.length(); i++) {
            System.out.print(tmp.charAt(i) + " ");
        }
        System.out.println();
        System.out.println("Co " + count2 + " ki tu in hoa");
    }
}
