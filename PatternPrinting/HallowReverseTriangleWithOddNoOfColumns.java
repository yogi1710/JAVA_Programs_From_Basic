import java.util.Scanner;

class HallowReverseTriangleWithOddNoOfColumns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = 1; k <= 2 * i; k++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                if (i == 0 || i == n - 1 || j == 1 || j == 2 * (n - i) - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

class HallowReverseTriangleWithOddNoOfColumnsNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = 1; k <= 2 * i; k++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                if (i == 0 || i == n - 1 || j == 1 || j == 2 * (n - i) - 1)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

class HallowReverseTriangleWithOddNoOfColumnsAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = 1; k <= 2 * i; k++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                if (i == 0 || i == n - 1 || j == 1 || j == 2 * (n - i) - 1)
                    System.out.print((char) (65 + j - 1) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}