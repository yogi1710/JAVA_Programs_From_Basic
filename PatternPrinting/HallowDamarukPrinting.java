import java.util.Scanner;

class HallowDamarukPrinting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int k = 1; k <= 2 * (i); k++)
                System.out.print(" ");
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                if (j == 0 || j == 2 * (n - i) - 2 || i == 0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int k = 1; k <= 2 * (n - i - 1); k++)
                System.out.print(" ");
            for (int j = 0; j < 2 * (i) + 1; j++) {
                if (j == 0 || j == 2 * i || i == n - 1 || i == 0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

class HallowDamarukPrintingNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int k = 1; k <= 2 * (i); k++)
                System.out.print(" ");
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                if (j == 0 || j == 2 * (n - i) - 2 || i == 0)
                    System.out.print((j + 1) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int k = 1; k <= 2 * (n - i - 1); k++)
                System.out.print(" ");
            for (int j = 0; j < 2 * (i) + 1; j++) {
                if (j == 0 || j == 2 * i || i == n - 1 || i == 0)
                    System.out.print((j + 1) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

class HallowDamarukPrintingAlpha {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int k = 1; k <= 2 * (i); k++)
                System.out.print(" ");
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                if (j == 0 || j == 2 * (n - i) - 2 || i == 0)
                    System.out.print((char) (65 + j) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int k = 1; k <= 2 * (n - i - 1); k++)
                System.out.print(" ");
            for (int j = 0; j < 2 * (i) + 1; j++) {
                if (j == 0 || j == 2 * i || i == n - 1 || i == 0)
                    System.out.print((char) (65 + j) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}