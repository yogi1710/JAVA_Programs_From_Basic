import java.util.Scanner;

class AlphabetD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the rows : ");
        int n = 5;
        for (int i = 0; i <= n / 2; i++) {
            if (i == 0) {
                for (int l = 0; l < n / 2; l++)
                    System.out.print("* ");
                // System.out.println();
            } else {
                for (int j = 0; j < n / 2 + i + 1; j++) {
                    if (j == 0 || j == n / 2 + i)
                        System.out.print("* ");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2 + 1; i++) {
            if (i == n / 2) {
                for (int j = 0; j < n / 2; j++)
                    System.out.print("* ");
            } else {
                for (int j = 0; j < n - i; j++) {
                    if (j == n - i - 1 || j == 0)
                        System.out.print("* ");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}