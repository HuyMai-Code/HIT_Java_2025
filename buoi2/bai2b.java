package buoi2;
import java.util.Scanner;


public class bai2b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < n; i += 2) {
            int tmp;
            if (i + 1 < n) {
                tmp = Math.abs(arr[i - 1] - arr[i + 1]);
            } else {
                tmp = Math.abs(arr[i - 1] - 0);
            }
            arr[i] += tmp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
