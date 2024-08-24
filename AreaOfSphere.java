import java.util.Scanner;

class AreaOfSphere {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere:");
        double r = sc.nextDouble();
        double area = 4 * Math.PI * Math.pow(r, 2);
        System.out.println("The area of the sphere is: " + area);
        sc.close();
    }
}