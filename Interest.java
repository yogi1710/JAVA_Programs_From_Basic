// Find the Simple interest ?

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double principle, rate, time, interest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        principle = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        rate = sc.nextDouble();
        // time is in the year format
        System.out.println("Enter the time period in years: ");
        time = sc.nextDouble();
        interest = (principle * rate * time) / 100;
        System.out.println("The interest is: " + interest);
        sc.close();
    }
}