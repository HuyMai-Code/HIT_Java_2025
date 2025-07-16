package buoi2;
import java.util.Scanner;

public class bai1b {
    public static void main(String[] args) {

        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble();

        System.out.println((2 * pi * r) + " " + (pi * Math.pow(r, 2)));

        scanner.close();
    }
}
