// 29. If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to determine the youngest of the three

import java.util.Scanner;

public class YoungestAmoungAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of Ram : ");
        int ram = sc.nextInt();
        System.out.println("Enter the age of Shyam : ");
        int shyam = sc.nextInt();
        System.out.println("Enter the age of Ajay : ");
        int ajay = sc.nextInt();
        if (ram < shyam) {
            if (ram < ajay) {
                System.out.println("Ram is the youngest");
            } else {
                System.out.println("ajay is youngest");
            }
        } else {
            if (shyam < ajay) {
                System.out.println("shyam is youngest");
            } else {
                System.out.println("ajay is youngest");
            }
        }
        sc.close();
    }
}
