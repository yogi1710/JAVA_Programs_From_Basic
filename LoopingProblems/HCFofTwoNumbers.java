// Write a program to calculate HCF of Two given number

import java.util.Scanner;

class HCFofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int flag = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                flag = i;
            }
        }
        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + flag);
        sc.close();
    }
}