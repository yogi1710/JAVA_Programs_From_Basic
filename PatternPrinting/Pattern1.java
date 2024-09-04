import java.util.Scanner;

// *
// * *
// * * *
// * * * *
// * * * * *

class Pattern1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of to print : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int k = 0; k < 2 * (num - i); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

class Pattern1Num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of to print : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int k = 0; k < 2 * (num - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// A
// A B
// A B C
// A B C D
// A B C D E

class Pattern1Aplha {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of to print : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int k = 0; k < 2 * (num - i); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) (65 + j) + " ");
            }
            System.out.println();
        }
    }
}