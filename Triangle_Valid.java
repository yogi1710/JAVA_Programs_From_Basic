// 15. Write a program to input all sides of a triangle and check whether triangle is valid or not

import java.util.Scanner;

class Triangle_Valid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Angles of Triangle :");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        int sum = angle1 + angle2 + angle3;
        if (sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("Triangle is valid");
        } else {
            System.out.println("Triangle is not valid");
        }
        sc.close();
    }
}