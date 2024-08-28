// 28. A five-digit number is entered through the keyboard. Write a program to obtain the reversed number and to determine whether the original and reversed numbers are equal or not

import java.util.Scanner;

class PalindromeNumberCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int count = n;
        int flag = 0;
        int rem = 0;
        int reverseNumber = 0;
        int originalNumber = n;
        while (count > 0) {
            // int div = count % 10;
            flag++;
            count = count / 10;
        }

        if (flag == 5) {
            while (n > 0) {
                rem = n % 10;
                reverseNumber = reverseNumber * 10 + rem;
                n = n / 10;
            }
            if (originalNumber == reverseNumber) {
                System.out.println("The number is a palindrome number");
            } else {
                System.out.println("The number is not a palindrome number");
            }
        } else {
            System.out.println("The number you have entered is not equal to 5 digts, please enter five digit number");
        }
        sc.close();
    }
}