package buoi8.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        String s_new = "";
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (tmp == ' ') {
                count ++;
            }
            s_new = tmp + s_new;
        }
        System.out.println("Co " + count + " khoang trang");
        System.out.println("Chuoi dao nguoc la: " + s_new);
    }
}
