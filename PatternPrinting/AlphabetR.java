import java.util.Scanner;

class AlphabetR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Try using odd numbers");
        System.out.println();
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n / 2 + 1) {
                    if (i == 0 || i == n / 2 || j == 0 || j == n - 1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2; i++) {
            System.out.print("* ");
            for (int j = 0; j < i + n / 2; j++)
                System.out.print("  ");
            System.out.print("* ");
            System.out.println();
        }
    }
}