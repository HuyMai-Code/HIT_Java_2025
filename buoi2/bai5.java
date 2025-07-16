package buoi2;
import java.util.Scanner;

public class bai5 {
    
    public static void main(String[] args) {

        int sum_even = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bang cuu chuong?: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        for (int i = 0; i <= 100; i += 2) {
            sum_even += i;
        }
        System.out.print("Tong cac so chan tu 1 -> 100: " + sum_even);

        scanner.close();
    }
}
