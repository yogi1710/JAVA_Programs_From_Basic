import java.util.Scanner;

class AlphabetQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number : ");
        // n value is either 5 or 6 
        int n = 6;
        for (int i = 0; i < n / 2; i++) {
            if (i != 0 || i != n - 1)
                System.out.print("* ");
            else
                System.out.print("  ");
            for (int j = 0; j < n - 2; j++) {
                if (i == 0 || i == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            if (i != 0 || i != n - 1)
                System.out.print("* ");
            else
                System.out.print("  ");
            System.out.println();
        }
        for (int i = 0; i < n / 2; i++) {
            System.out.print("* ");
            System.out.print("  ");
            for (int j = 0; j < i; j++)
                System.out.print("  ");
            System.out.print("* ");
            for (int k = 0; k < n / 2 - i - 1; k++)
                System.out.print("  ");
            System.out.print("* ");
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int k = 0; k < n; k++)
            System.out.print("  ");
        System.out.print("* ");
    }
}