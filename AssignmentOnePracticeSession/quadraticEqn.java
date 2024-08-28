// package AssignmentOnePracticeSession;

import java.util.Scanner;

class quadraticEqn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients of the quadratic equation");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double determinant = b * b - 4 * a * c;
        double root1, root2;
        if (determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / 2 * a;
            root2 = (-b - Math.sqrt(determinant)) / 2 * a;
            System.out.format("The roots of the quadratic equation are %.2f and %.2f", root1, root2);
        } else if (determinant == 0) {
            root1 = root2 = -b / 2 * a;
            System.out.format("The roots of the quadratic equation are %.2f and %.2f", root1, root2);
        } else {
            double real = -b / (2 * a);
            double img = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, img);
            System.out.format("\nroot2 = %.2f-%.2fi", real, img);
        }
        sc.close();
    }
}