import java.util.Scanner;

class HallowDiamondPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n - 1; i++) {
            for (int k = 0; k < 2 * (n - i); k++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * (i) - 1; j++) {
                if (j == 1 || j == 2 * (i) - 1 || i == n || i == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < 2 * (i); k++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                if (i == n - 1 || j == 1 || j == 2 * (n - i) - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

class HallowDiamondPrintingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n - 1; i++) {
            for (int k = 0; k < 2 * (n - i); k++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * (i) - 1; j++) {
                if (j == 1 || j == 2 * (i) - 1 || i == n || i == 1)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < 2 * (i); k++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                if (i == n - 1 || j == 1 || j == 2 * (n - i) - 1)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

class HallowDiamondPrintingAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n - 1; i++) {
            for (int k = 0; k < 2 * (n - i); k++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * (i) - 1; j++) {
                if (j == 1 || j == 2 * (i) - 1 || i == n || i == 1)
                    System.out.print((char) (65 + j - 1) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < 2 * (i); k++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                if (i == n - 1 || j == 1 || j == 2 * (n - i) - 1)
                    System.out.print((char) (65 + j - 1) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}