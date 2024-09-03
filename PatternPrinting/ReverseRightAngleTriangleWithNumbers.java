import java.util.Scanner;

public class ReverseRightAngleTriangleWithNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row value : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
