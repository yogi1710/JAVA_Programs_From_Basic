import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find wither it is prime or not : ");
        int number = sc.nextInt();
        int flag = 0;
        if (number == 0 || number == 1) {
            System.out.println(number + " is not a prime number");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    flag++;
                }
            }
        }
        if (flag == 2) {
            System.out.println("The number is a prime number : ");
        } else {
            System.out.println("The number is not a prime number : ");
        }
    }
}