import java.util.Scanner;

class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();
        int number;
        for (int i = 0; i < n; i++) {
            number = 1;
            for (int k = 1; k <= n - i - 1; k++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);// calculate next number in the row
            }
            System.out.println();
        }
    }
}