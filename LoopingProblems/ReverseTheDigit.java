// write a program to reverse the given Digits

import java.util.Scanner;

class ReverseTheDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int reverse = 0;
        for (; n > 0;) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        System.out.println("Reverse of the number is " + reverse);
    }
}