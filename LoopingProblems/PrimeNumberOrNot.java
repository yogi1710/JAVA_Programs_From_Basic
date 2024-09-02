// Write a Program to check Prime numbers or Not

import java.util.Scanner;

class PrimeNumberOrNot {
    static void printPrime(int n) {
        int flag = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 0;
                break;
            }
        }
        if (flag == 1)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        printPrime(n);
        sc.close();
    }
}