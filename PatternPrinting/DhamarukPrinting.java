import java.util.Scanner;

// 5
//  * * * * * * * * *
//    * * * * * * *
//      * * * * *
//        * * *
//          * 
//        * * *
//      * * * * *
//    * * * * * * *
//  * * * * * * * * *

class DhamarukPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value : ");
        int n = sc.nextInt();
        int val = 2 * n - 1;
        for (int i = 0; i < n - 1; i++) {
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < val; j++) {
                System.out.print("* ");
            }
            System.out.println();
            val = val - 2;
        }

        val = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < val; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
            val = val - 2;
        }
    }
}

// /5
// 1 2 3 4 5 6 7 8 9
// 1 2 3 4 5 6 7
// 1 2 3 4 5
// 1 2 3
// 1
// 1 2 3
// 1 2 3 4 5
// 1 2 3 4 5 6 7
// 1 2 3 4 5 6 7 8 9

class DhamarukPrintingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value : ");
        int n = sc.nextInt();
        int val = 2 * n - 1;
        for (int i = 0; i < n - 1; i++) {
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < val; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
            val = val - 2;
        }

        val = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < val; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
            val = val - 2;
        }
    }
}

// 5
// A B C D E F G H I
// A B C D E F G
// A B C D E
// A B C
// A
// A B C
// A B C D E
// A B C D E F G
// A B C D E F G H I

class DhamarukPrintingAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value : ");
        int n = sc.nextInt();
        int val = 2 * n - 1;
        for (int i = 0; i < n - 1; i++) {
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < val; j++) {
                System.out.print((char) (65 + j) + " ");
            }
            System.out.println();
            val = val - 2;
        }

        val = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < val; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print((char) (65 + j) + " ");
            }
            System.out.println();
            val = val - 2;
        }
    }
}