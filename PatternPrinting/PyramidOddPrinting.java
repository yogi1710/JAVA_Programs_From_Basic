import java.util.Scanner;

//           *

//         * * *
//       * * * * *
//     * * * * * * *
//   * * * * * * * * * 

class PyramidOddPrinting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int val = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= val; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            val = val - 2;
            System.out.println();
        }
    }
}

// 1 2 3
// 1 2 3 4 5
// 1 2 3 4 5 6 7
// 1 2 3 4 5 6 7 8 9

class PyramidOddPrintingNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int val = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= val; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(j + 1 + " ");
            }
            val = val - 2;
            System.out.println();
        }
    }
}

//           A
//         A B C
//       A B C D E 
//     A B C D E F G
//   A B C D E F G H I

class PyramidOddPrintingAlpha {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int val = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= val; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print((char) (65 + j) + " ");
            }
            val = val - 2;
            System.out.println();
        }
    }
}