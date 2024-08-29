
import java.util.Scanner;

class TablesPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print tables :");
        int n = sc.nextInt();
        System.out.println("Enter the multiple values you want : ");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
        sc.close();
    }
}