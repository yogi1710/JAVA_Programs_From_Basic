import java.util.Scanner;

class AlphabetJ {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                for (int j = 0; j < n / 2; j++) {
                    if (j == 0 || j == n / 2)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            for (int k = 0; k < i; k++)
                System.out.print(" ");
            for (int j = 0; j < i + 1; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}