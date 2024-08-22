import java.util.Scanner;

public class SumCalculator {
    // Console (i/o):
    // - readLine(): reads a line from the user
    // - print(): prints a message to the user
    // - println(): prints a message to the user, followed by a newline
    // import java.util.Scanner;
    // Scanner scanner = new Scanner(System.in);
    // String input = scanner.nextLine();
    // scanner.close();
    // System.out.println("Hello, " + input);

    // 1.Scanner.next();
    // 2.Scanner.nextLine();
    // 3.Scanner.nextInt();
    // 4.Scanner.nextDouble();
    // 5.Scanner.nextBoolean();
    // 6.Scanner.nextByte();
    // 7.Scanner.nextShort();
    // 8.Scanner.nextLong();
    // 9.Scanner.nextFloat();
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();
        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);
    }

}
