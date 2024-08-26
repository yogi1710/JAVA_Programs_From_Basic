import java.util.Scanner;
// 1. Write a program to find maximum between two numbers

class MaxNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter the Second number : ");
        int number2 = sc.nextInt();
        if (number1 > number2) {
            System.out.println(number1 + " is maximum");
        } else if (number1 < number2) {
            System.out.println(number2 + " is maximum");
        } else if (number1 == number2) {
            System.out.println("Both are equal");
        }
        sc.close();
    }
}