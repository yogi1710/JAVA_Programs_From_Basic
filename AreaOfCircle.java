
// calculate the area of a circle
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double radius, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        radius = sc.nextDouble();
        area = 3.14 * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}