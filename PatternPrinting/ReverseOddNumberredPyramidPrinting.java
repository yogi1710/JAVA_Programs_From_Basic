import java.util.Scanner;

//  * * * * * * * * *
//    * * * * * * *
//      * * * * *
//        * * * 
//          *

class ReverseOddNumberredPyramidPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int val = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < val; j++) {
                System.out.print("* ");
            }
            val = val - 2;
            System.out.println();
        }
    }
}

//  1 2 3 4 5 6 7 8 9
//    1 2 3 4 5 6 7
//      1 2 3 4 5 
//        1 2 3
//          1

class ReverseOddNumberredPyramidPrintingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int val = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < val; j++) {
                System.out.print((j + 1) + " ");
            }
            val = val - 2;
            System.out.println();
        }
    }
}

//  A B C D E F G H I
//    A B C D E F G
//      A B C D E
//        A B C 
//          A

class ReverseOddNumberredPyramidPrintingAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n umb e r  :  ");
        int n = sc.nextInt();
        int val = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < val; j++) {
                System.out.print((char)(65+j)+" ");
            }
            val = val - 2;
            System.out.println();
        }
    }
}