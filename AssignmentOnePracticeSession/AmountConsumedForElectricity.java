// 17. Write a program in Java to calculate and print the electricity bill of a given customer. The customer ID, name, and unit consumed by the user should be captured from the keyboard to display the total amount to be paid to the customer.

// The charge are as follow :

// Unit Charge/unit
// upto 199	@1.20 
// 200 and above but less than 400	 @1.50
// 400 and above but less than 600	 @1.80
// 600 and above	                 @2.00

import java.util.Scanner;

class AmountConsumedForElectricity {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Customer ID No : ");
        int custid = sc.nextInt();
        sc.nextLine();
        System.out.println("Customer Name : ");
        String custname = sc.nextLine();
        System.out.println("Electricity Units Consumed : ");
        int units = sc.nextInt();
        double amount;
        if (units < 200) {
            amount = units * 1.20;
        } else if (units >= 200 && units < 400) {
            amount = units * 1.50;
        } else if (units >= 400 && units < 600) {
            amount = units * 1.80;
        } else {
            amount = units * 2.00;
        }
        System.out.println("Customer ID NO : " + custid);
        System.out.println("Customer Name : " + custname);
        System.out.println("Electricity Units Consumed : " + units);
        System.out.println("Total Amount : " + amount);
        sc.close();
    }
}