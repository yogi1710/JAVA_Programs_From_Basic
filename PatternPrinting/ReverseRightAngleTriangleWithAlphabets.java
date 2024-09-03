import java.util.Scanner;

public class ReverseRightAngleTriangleWithAlphabets {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row value : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                // to print the alphabets in decending order that is from (char)(97+j) to a
                System.out.print((char) (97 + j - 1) + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            int alpha = 97;
            for (int j = n - i; j > 0; j--) {
                // to print the alphabets from a to so on
                System.out.print((char) alpha + " ");
                alpha++;
            }
            System.out.println();
        }
    }
}
