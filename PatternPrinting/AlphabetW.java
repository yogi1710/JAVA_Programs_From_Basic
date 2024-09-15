import java.util.Scanner;

class AlphabetW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++)
                System.out.print(" ");
            System.out.print("*");
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 0; k < 2 * i; k++)
                System.out.print(" ");
            System.out.print("*");
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
