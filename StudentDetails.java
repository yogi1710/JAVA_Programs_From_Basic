// Student details, ask the use to enter the details of the person?

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] yogi) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter your grade:");
        int grade = sc.nextInt();
        System.out.println();
        System.out.println("Enter your college:");
        String college = sc.nextLine();
        System.out.println("Enter your course:");
        String course = sc.nextLine();
        System.out.println("Your details are below:");
        // String details = sc.next();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("College: " + college);
        System.out.println("Course: " + course);
        // System.out.println("Details: " + details);
        sc.close();
    }
}