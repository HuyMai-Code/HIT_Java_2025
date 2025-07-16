package buoi2;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {

        int[] nums = new int[5];
        int sum = 0;
        int m = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mang: ");
        for (int i = 0; i < 5; i++) {
            nums[i] = scanner.nextInt(); 
        }
        m = nums[0];
        System.out.print("Mang vua nhap: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(nums[i] + ", ");
            sum += nums[i];
            if (nums[i] > m) {
                m = nums[i];
            }
        }
        System.out.println("\nTong cac phan tu trong mang: " + sum);
        System.out.println("Gia tri lon nhat trong mang: " + m);

        scanner.close();
    }
}
