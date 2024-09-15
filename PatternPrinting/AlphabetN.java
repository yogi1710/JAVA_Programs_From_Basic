import java.util.Scanner;

class AlphabetN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1; j++)
                System.out.print("* ");
            for (int k = 0; k < i; k++)
                System.out.print(" ");
            System.out.print("*");
            for (int l = 0; l < n - i; l++)
                System.out.print(" ");
            System.out.print("* ");
            System.out.println();
        }
    }
}