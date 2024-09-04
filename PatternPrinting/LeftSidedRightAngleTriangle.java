import java.util.Scanner;

// * * * * *
// * * * *
// * * *
// * *
// *

class LeftSidedRightAngleTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

class LeftSidedRightAngleTriangleNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }
}

// A B C D E
// A B C D
// A B C
// A B
// A

class LeftSidedRightAngleTriangleAlpha {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) (65 + j) + " ");
            }
            System.out.println();
        }
    }
}
