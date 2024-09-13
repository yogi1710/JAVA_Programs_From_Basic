import java.util.Scanner;

class SideBySideTrianglesInReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++)
                System.out.print("* ");
            for (int k = 0; k < 2 * i; k++)
                System.out.print("  ");
            for (int l = 0; l < n - i; l++)
                System.out.print("* ");
            System.out.println();
        }
    }
}