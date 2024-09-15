import java.util.Scanner;

class AlphabetY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the odd values only ");
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (i <= n / 2) {
                for (int j = 0; j < n; j++) {
                    if (i == j || i + j == n - 1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            } else {
                for (int j = 0; j < n / 2 + 1; j++) {
                    if (j == n / 2)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}