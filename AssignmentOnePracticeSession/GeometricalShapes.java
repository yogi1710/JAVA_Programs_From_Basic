
// 10. Write a Java program which computes the area of various geometrical shapes using a menu-driven approach.
// Test Data :
// 1
// 5
// Expected Output :
// The area is : 78.500000
import java.util.Scanner;

public class GeometricalShapes {
    public static void main(String[] args) {
        int choice, radius, length, breadth, height;
        double area, volume;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Geometrical Shapes Menu");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Cube");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    radius = sc.nextInt();
                    area = 3.14 * radius * radius;
                    System.out.println("The area is : " + area);
                    break;
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    length = sc.nextInt();
                    System.out.print("Enter the breadth of the rectangle: ");
                    breadth = sc.nextInt();
                    area = length * breadth;
                    System.out.println("The area is : " + area);
                    break;
                case 3:
                    System.out.print("Enter the length of the cube: ");
                    height = sc.nextInt();
                    volume = height * height * height;
                    System.out.println("The volume is : " + volume);
                    break;
                case 4:
                    System.out.println("Exiting.....Thank you..");
                    break;
            }
        } while (choice != 4);
        sc.close();
    }
}