// Write Java program to Find addition of N integer numbers

import java.util.Scanner;

class AdditionOfNnumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is : " + sum);
        int choice = 1;
        for (;choice==1;) {
            System.out.println("Type 1 to enter number, 0 to exit : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number to be added : ");
                    int value = sc.nextInt();
                    sum = sum + value;
                    System.out.println("The sum is : " + sum);
                    break;
                case 0:
                    System.out.println("Exiting... Thank You...");
                    break;
                default:
                    System.out.println("The choice you have entered is invalid, please check.");
                    break;
            }
        }
    }
}