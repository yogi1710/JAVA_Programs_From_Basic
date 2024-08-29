// 4. Write a program to print reverse tables

import java.util.Scanner;

class TablePrintingReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number : ");
        int n = sc.nextInt();
        System.out.println("Enter upto how many multiples you want : ");
        int m = sc.nextInt();
        for(int i = m;i>0;i--){
            System.out.println(n+" X "+i+" = "+n*i);
        }
        sc.close();
    }
}