import java.util.Scanner;

class SideBySideTriangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 0; k < 2 * (n - i - 1) - 1; k++)
                System.out.print("  ");
            if (i != n - 1) {
                for (int l = 0; l <= i; l++) {
                    System.out.print("* ");
                }
            } else {
                for (int l = 0; l <= i - 1; l++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}