import java.util.Scanner;

class NameHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number of rows :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int k = 0; k < n - i - 1; k++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == 0 || i == n / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}