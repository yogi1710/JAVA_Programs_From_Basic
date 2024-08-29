// Write a program to find the value of one number raised to the power of another

import java.util.Scanner;

class PowerOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int base = sc.nextInt();
        System.out.println("Enter the power: ");
        int power = sc.nextInt();
        double result = Math.pow(base, power);
        System.out.println(base + " raised to the power of " + power + " is " + result);

        double result1 = 1;
        for (int i = 1; i <= power; i++) {
            result1 = result1 * base;
        }
        System.out.println(base + " raised to the power of " + power + " is " + result1);
    }
}