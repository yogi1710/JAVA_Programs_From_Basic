import java.util.Scanner;

class Coordinates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();
        if (x >= 0 && y >= 0) {
            System.out.println("The point is in 1st Quardinate.");
        } else if (x >= 0 && y < 0) {
            System.out.println("The point is in 2nd Quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point is in 3rd Quadrant.");
        } else {
            System.out.println("The point is in 4th Quadrant.");
        }
        sc.close();
    }
}