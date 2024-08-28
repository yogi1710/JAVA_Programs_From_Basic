import java.util.Scanner;

class SimpleCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number : ");
        double num2 = sc.nextDouble();
        System.out.println("Enter the operator (+, -, *, /, %) : ");
        char op = sc.next().charAt(0);
        double result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
        }
        System.out.println("The result is : " + result);
    }
}