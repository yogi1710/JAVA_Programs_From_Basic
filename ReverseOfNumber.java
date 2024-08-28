import java.util.Scanner;

class ReverseOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int rem = 0;
        int reverseNumber = 0;
        while (n > 0) {
            rem = n % 10;
            reverseNumber = reverseNumber * 10 + rem;
            n = n / 10;
        }
        System.out.println("The reverse of a number : "+ reverseNumber);
        sc.close();
    }
}