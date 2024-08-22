
// Find the compound interest by taking input form the use?
import java.util.Scanner;
// import java.io.*;

public class CompoundInterest {
    public static void main(String args[]) {
        double principal, rate, time, interest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        principal = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        rate = sc.nextDouble();
        System.out.println("Enter the time period: ");
        time = sc.nextDouble();
        sc.close();
        interest = (principal * Math.pow((1 + rate / 100), time));
        System.out.println("Compound interest is : " + interest);
    }
}