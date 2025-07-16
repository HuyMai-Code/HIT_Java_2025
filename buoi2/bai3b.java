package buoi2;
import java.util.Scanner;

public class bai3b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int num = 1;
        int l = 0;
        int t = 0;
        int r = n - 1;
        int b = n - 1;

        int[][] arr = new int[n][n];

        while (num <= n*n) {
            for(int i = l; i <= r; i++) arr[t][i] = num++;
            t++;
            for(int i = t; i <= b; i++) arr[i][r] = num++;
            r--;
            for(int i = r; i >= l; i--) arr[b][i] = num++;
            b--;
            for(int i = b; i >= t; i--) arr[i][l] = num++;
            l++;
        }
        
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        scanner.close();
    }
}
