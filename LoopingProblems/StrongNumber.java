// Write a program to check whether a number is a Strong Number or not

import java.util.Scanner;

class StrongNumber {
    static int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++)
            fact = fact * i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int value = n;
        int sum = 0;
        for (; n > 0;) {
            int rem = n % 10;
            sum = sum + factorial(rem);
            n = n / 10;
        }
        if (sum == value)
            System.out.println(value + " is a Strong Number");
        else
            System.out.println(value + " is not a Strong Number");
    }
}