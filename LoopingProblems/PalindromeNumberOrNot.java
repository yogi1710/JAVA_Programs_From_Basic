// Write a Program to Check Given Number is a Palindrome or Not

import java.util.Scanner;

class PalindromeNumberOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check either the number is palindrome number or not : ");
        int num = sc.nextInt();
        int n = num;
        int result = 0;
        for (; num > 0;) {
            int rem = num % 10;
            result = result * 10 + rem;
            num = num / 10;
        }
        if (n == result) {
            System.out.println("The number you have entered is a palindrome");
        } else {
            System.out.println("The number you have entered is not a palindrome");
        }
    }
}