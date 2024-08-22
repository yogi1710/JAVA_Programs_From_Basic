
// Write a java program to calculate the area of a triangle, base and height are taken from the user?
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String args[]) {
        double base, height, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of a triangle");
        base = sc.nextDouble();
        System.out.println("Enter the height of a triangle");
        height = sc.nextDouble();
        area = 0.5 * base * height;
        System.out.println("The area of a triangle is " + area);
        sc.close();
    }
}