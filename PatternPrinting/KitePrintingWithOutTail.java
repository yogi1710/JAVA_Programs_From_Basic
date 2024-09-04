import java.util.Scanner;

//          *
//        * * *
//      * * * * * 
//    * * * * * * *
//  * * * * * * * * *
//    * * * * * * *
//      * * * * *  
//        * * * 
//          *

class KitePrintingWithOutTail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int val = 2 * n - 1;
        for (int i = 0; i < n - 1; i++) {
            for (int k = 0; k < val; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
            val = val - 2;
        }

        int value = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < value; j++) {
                System.out.print("* ");
            }
            System.out.println();
            value = value - 2;
        }
    }
}

//          1 
//        1 2 3
//      1 2 3 4 5
//    1 2 3 4 5 6 7 
//  1 2 3 4 5 6 7 8 9
//    1 2 3 4 5 6 7
//      1 2 3 4 5
//        1 2 3
//          1

class KitePrintingWithOutTailNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int val = 2 * n - 1;
        for (int i = 0; i < n - 1; i++) {
            for (int k = 0; k < val; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
            val = val - 2;
        }

        int value = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < value; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
            value = value - 2;
        }
    }
}

//          A 
//        A B C
//      A B C D E
//    A B C D E F G
//  A B C D E F G H I 
//    A B C D E F G
//      A B C D E
//        A B C
//          A

class KitePrintingWithOutTailAlpha {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int val = 2 * n - 1;
        for (int i = 0; i < n-1; i++) {
            for (int k = 0; k < val; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
            val = val - 2;
        }

        int value = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < value; j++) {
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
            value = value - 2;
        }
    }
}