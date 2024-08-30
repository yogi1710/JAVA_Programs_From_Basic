// Write a program to calculate HCF of Two given number

// To find LCM we use GCD(HCF), as per the formula, 
// num1 * num2 = GCD * LCM
// LCM = num1 * num2 / GCD gives us LCM
// USe this in furtue , just for reference....

import java.util.Scanner;

class HCFofTwoNumbers1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int flag = num2;
        while (num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        System.out.println("The HCF of " + num1 + " and " + flag + " is " + num2);
        sc.close();
    }
}