// Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9

// import java.util.Scanner;

class SumOfDivisibleIntegers {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                sum += i;
                System.out.println(i + " ");
                count++;
            }
        }
        System.out.println("Sum of all integers between 100 and 200 which are divisible by 9 is: " + sum);
        System.out.println("Number of integers between 100 and 200 which are divisible by 9 : " + count);
    }
}