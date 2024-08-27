import java.util.Scanner;

// write a program to check whether the triangle is equilateral, isosoles or scalene triangle?

class Triangle_Check {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First side of a triangle : ");
        int side1 = sc.nextInt();
        System.out.println("Enter the Second side of a triangle : ");
        int side2 = sc.nextInt();
        System.out.println("Enter the Third side of a triangle : ");
        int side3 = sc.nextInt();
        if (side1 == side2 && side2 == side3) {
            System.out.println("The Triangle is Equilateral trinagle.");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("The Triangle is Isosoles Triangle.");
        } else {
            System.out.println("The Triangle is Scalene Triangle.");
        }
        sc.close();
    }
}