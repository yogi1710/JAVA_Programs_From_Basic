import java.util.Scanner;

class HallowPyramidWithOddNoOfValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 1 || i == n || j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class HallowPyramidWithOddNoOfValuesNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 1 || i == n || j == 1 || j == 2 * i - 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class HallowPyramidWithOddNoOfValuesAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 1 || i == n || j == 1 || j == 2 * i - 1) {
                    System.out.print((char) (65 + j - 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}