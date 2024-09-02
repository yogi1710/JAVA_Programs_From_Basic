// Check if a number is spy number or not. Means sum its digits equal to product of its digits-->123-->1+2+3=1*2*3

import java.util.Scanner;

class SpyNumberOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check weather the number is a Spy number or not : ");
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            product = product * rem;
            num = num / 10;
        }
        if (sum == product)
            System.out.println("The number you have entered is a Spy number.");
        else
            System.out.println("The number you have entered is not a Spy number.");
    }
}