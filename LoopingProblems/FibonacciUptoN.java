// Write a program to print fibonacci series upto n terms

import java.util.Scanner;

class FibonacciUptoN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n term : ");
        int n = sc.nextInt();
        sc.close();
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        int c = a + b;
        for (; n >= c;) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}