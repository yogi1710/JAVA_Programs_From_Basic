// wending machine program?

import java.util.Scanner;

class WendingMachine {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int value;
        do {
            System.out.println("Enter the number that you select?");
            System.out.println("1.Coffee.");
            System.out.println("2.Tea.");
            System.out.println("3.Cola.");
            System.out.println("4.Water.");
            System.out.println("5.Sprit.");
            System.out.println("6.To exit.");
            System.out.println();
            value = sc.nextInt();
            switch (value) {
                case 1:
                    System.out.println("Take the coffe and enjoy the day");
                    break;
                case 2:
                    System.out.println("Take the tea and enjoy the day");
                    break;
                case 3:
                    System.out.println("Take the cola and enjoy the day");
                    break;
                case 4:
                    System.out.println("Take the water and enjoy the day");
                    break;
                case 5:
                    System.out.println("Take the sprit and enjoy the day");
                    break;
                case 6:
                    System.out.println("Thank you for using the vending machine");
                    break;
                default:
                    System.out.println("The number you have entered is invalid, try again");
                    break;
             } 
        }while(value != 6);
        sc.close();
    }
}