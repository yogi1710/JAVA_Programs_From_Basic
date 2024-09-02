// 45. Write a Program to print Prime factors in java

import java.util.Scanner;

class PrimeFactorsOfNumber {
    static void printPrimeFactors(int num) {
        for (; num % 2 == 0;) {
            System.out.print("2 ");
            num = num / 2;
        }
        for (int i = 3; i * i <= num; i += 2) {
            for (; num % i == 0;) {
                System.out.print(i + " ");
                num = num / i;
            }
        }
        if (num > 2)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Prime factors of " + num + " are: ");
        printPrimeFactors(num);
    }
}