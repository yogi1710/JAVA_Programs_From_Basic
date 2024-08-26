// 15. Write a program to sc all sides of a triangle and check whether triangle is valid or not

import java.util.Scanner;

class All_Side_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Sides of Triangle :");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if ((side1 + side2) > side3)
            if ((side2 + side3) > side1)
                if ((side1 + side3) > side2)
                    System.out.println("Triangle is valid.");
                else
                    System.out.println("Triangle is not valid.");
            else
                System.out.println("Triangle is not valid.");
        else
            System.out.println("Triangle is not valid.");
        sc.close();
    }
}