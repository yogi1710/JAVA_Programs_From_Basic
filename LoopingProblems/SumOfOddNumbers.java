// Write a program to find sum of all odd numbers between 1 to n

import java.util.Scanner;

class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("Sum of all odd numbers between 1 to n is " + sum);
        sc.close();
    }
}