import java.util.Scanner;

class AlphabetP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Try to prefer odd numbers.");
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
            for (int j = 0; j < n - 2; j++) {
                if (i == 0 || i == n / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            if (i <= n / 2)
                System.out.print("* ");
            System.out.println();
        }
    }
}