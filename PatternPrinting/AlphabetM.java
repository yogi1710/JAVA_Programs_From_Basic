import java.util.Scanner;

class AlphabetM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1; j++)
                System.out.print("* ");
            for (int k = 0; k < i - 1; k++)
                System.out.print(" ");
            if (i != 0)
                System.out.print("* ");
            else if (i == 0)
                System.out.print(" ");
            for (int l = 0; l < 2 * (n - i - 1); l++)
                System.out.print(" ");
            if (i != 0)
                System.out.print("*");
            else if (i == 0)
                System.out.print(" ");
            for (int m = 0; m < i; m++)
                System.out.print(" ");
            System.out.print("* ");
            System.out.println();
        }
    }
}