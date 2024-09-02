//  Write a Program to check Armstrong numbers or Not

import java.util.Scanner;

class ArmstrongNumber {
    static int power(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }

    static int count(int n) {
        int count = 0;
        for (; n > 0;) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int value = n;
        int sum = 0;
        int flag = count(n);
        for (; n > 0;) {
            int r = n % 10;
            sum = sum + power(r, flag);
            n = n / 10;
        }
        if (sum == value) {
            System.out.println(value + " is an Armstrong number");
        } else {
            System.out.println(value + " is not an Armstrong number");
        }
        sc.close();
    }
}