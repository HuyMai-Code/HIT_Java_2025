package buoi2;
import java.util.Scanner;

public class bai3 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (count < 5) {
            System.out.print("a = ");
            int a = scanner.nextInt();
            System.out.print("b = ");
            int b = scanner.nextInt();

            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
            if (a == b) {
                System.out.println("2 so thuc bang nhau");
            } else {
                System.out.println("2 so thuc khong bang nhau");
            }
            count++;
        }

        scanner.close();
    }
}
