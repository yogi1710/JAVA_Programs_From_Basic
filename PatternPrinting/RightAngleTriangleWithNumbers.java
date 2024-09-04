import java.util.Scanner;

// 1
// 2 3
// 4 5 6 
// 7 8 9 10

class RightAngleTriangleWithNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int value = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
    }
}

// A
// B C
// D E F
// G H I J

class RightAngleTriangleWithAlpha {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        char value = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
    }
}