// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered

import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (;;) {
            System.out.println("Enter a number :");
            int num = sc.nextInt();
            if (num == 0)
                zero++;
            else if (num > 0)
                positive++;
            else if (num < 0)
                negative++;

            System.out.println("Do you want to enter another number (1/0)");
            int choice = sc.nextInt();
            if (choice == 0) {
                break;
            }
            // if (!choice.equalsIgnoreCase("yes")) {
            // break; // Exit the loop if the user does not want to continue
            // }
        }
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zero numbers: " + zero);
        sc.close();
    }
}