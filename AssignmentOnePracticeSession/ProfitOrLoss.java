// 16. Write a Java program to calculate profit and loss on a transaction.
// selling price of product:100
// original Cost:200

import java.util.Scanner;

class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original price of the product: ");
        int originalPrice = sc.nextInt();
        System.out.println("Enter the selling price of the product: ");
        int sellingPrice = sc.nextInt();
        int profit = sellingPrice - originalPrice;
        if (profit > 0) {
            System.out.println("Profit is: Rs." + profit);
        } else if (profit < 0) {
            System.out.println("Loss is: Rs." + Math.abs(profit));
        } else {
            System.out.println("No profit and no loss");
        }
        sc.close();
    }
}