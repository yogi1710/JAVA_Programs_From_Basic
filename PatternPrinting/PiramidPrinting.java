import java.util.Scanner;

class PiramidPrinting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows value : ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}