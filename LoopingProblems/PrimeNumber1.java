import java.util.Scanner;

class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int flag = 0;
        if (number == 0 || number == 1) {
            System.out.println(number + " is not a prime number");
        } else {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    flag++;
                    System.out.println("The number is not a prime number");
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("The number is a prime number.");
        }
        sc.close();
    }
}