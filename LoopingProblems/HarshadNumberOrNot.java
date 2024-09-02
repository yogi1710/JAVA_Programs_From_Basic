// Check if a number is Harshad Number or not. A Number which divisible by the sum of its digits. ex:- 156=1+5+6=12

import java.util.Scanner;

class HarshadNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + rem;
            temp /= 10;
        }
        if (n % sum == 0)
            System.out.println(n + " is a Harshad Number");
        else
            System.out.println(n + " is not a Harshad Number");
    }
}