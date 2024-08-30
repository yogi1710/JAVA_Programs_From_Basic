// Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered

import java.util.Scanner;

class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (;;) {
            System.out.println("Enter a number : ");
            num = sc.nextInt();
            if (num > max) {
                max = num;
            } else if (num <= min) {
                min = num;
            }
            System.out.println("Do you want to enter another number (1/0)");
            int choice = sc.nextInt();
            if (choice == 0) {
                break;
            }
        }
        System.out.println("The maximum number amoung the given numbers is : " + max);
        System.out.println("The minimum number amoung the given numbers is : " + min);
        sc.close();
    }
}