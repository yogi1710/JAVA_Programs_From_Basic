// 13.Write a program to count total number of notes in given amount

import java.util.Scanner;

class NoOfNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = sc.nextInt();
        int n500, n100, n50, n20, n10, n5, n2, n1;
        n500 = n100 = n50 = n20 = n10 = n5 = n2 = n1 = 0;
        while (amount > 0) {
            if (amount >= 500) {
                n500 = amount / 500;
                amount = amount - n500 * 500;
            } else if (amount >= 100) {
                n100 = amount / 100;
                amount = amount - n100 * 100;
            } else if (amount >= 50) {
                n50 = amount / 50;
                amount = amount - n50 * 50;
            } else if (amount >= 20) {
                n20 = amount / 20;
                amount = amount - n20 * 20;
            } else if (amount >= 10) {
                n10 = amount / 10;
                amount = amount - n10 * 10;
            } else if (amount >= 5) {
                n5 = amount / 5;
                amount = amount - n5 * 5;
            } else if (amount >= 2) {
                n2 = amount / 2;
                amount = amount - n2 * 2;
            } else if (amount >= 1) {
                n1 = amount / 1;
                amount = amount - n1 * 1;
            }
        }
        System.out.println("Number of 500 Rs. notes: " + n500);
        System.out.println("Number of 100 Rs. notes: " + n100);
        System.out.println("Number of 50 Rs. notes: " + n50);
        System.out.println("Number of 20 Rs. notes: " + n20);
        System.out.println("Number of 10 Rs. notes: " + n10);
        System.out.println("Number of 5 Rs. notes: " + n5);
        System.out.println("Number of 2 Rs. notes: " + n2);
        System.out.println("Number of 1 Rs. notes: " + n1);
        sc.close();
    }
}