// package AssignmentOnePracticeSession;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num = sc.nextInt();
        if (num >= 0) {
            System.out.println("The numbers are Positive");
        } else {
            System.out.println("The numbers are not Positive.");
        }
        sc.close();
    }
}
