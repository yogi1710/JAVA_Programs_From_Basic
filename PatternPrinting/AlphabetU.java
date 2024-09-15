import java.util.Scanner;

class AlphabetU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            } else if (i == n - 1) {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1)
                        System.out.print("  ");
                    else
                        System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}