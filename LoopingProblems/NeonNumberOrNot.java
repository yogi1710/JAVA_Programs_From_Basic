// Check if a number is Neon Number or Not. Where sum of digits of square of the number is equal to the number ex:- 9, 9*9=81,9=8+1

import java.util.Scanner;

class NeonNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        int square = num * num;
        while (square > 0) {
            sum = sum + square % 10;
            square = square / 10;
        }
        if (num == sum) {
            System.out.println("Square " + "(" + num + "," + num + ") = " + (num * num) + ", " + "Sum = " + sum);
            System.out.println(num + " is a Neon Number");
        } else
            System.out.println(num + " is not a Neon Number");
    }
}