// 21. Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:

// For first 50 units Rs. 0.50/unit
// For next 150 units Rs. 0.75/unit
// For next 250 units Rs. 1.20/unit
// For unit above 250 Rs. 1.50/unit
// An additional surcharge of 20% is added to the bill

import java.util.Scanner;

class ElectricityBill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units");
        int units = sc.nextInt();
        double bill = 0.0;
        if (units <= 50) {
            bill = units * 0.50;
        } else if (units <= 150) {
            bill = 50 * 0.5 + (units - 50) * 0.75;
        } else if (units <= 250) {
            bill = 0.5 * 50 + (units - 50) * 0.75 + (units - 150) * 1.20;
        } else {
            bill = 0.5 * 50 + (units - 50) * 0.75 + (units - 150) * 1.20 + (units - 250) * 1.50;
        }
        System.out.println("The total electricity bill including addictional charges is : " + (bill + (bill * 0.2)));
        sc.close();
    }
}