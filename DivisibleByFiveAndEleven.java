import java.util.Scanner;

// 4. Write a program to check whether a number is divisible by 5 and 11 or not

class DivisibleByFiveAndEleven {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible by 5 and 11");
        } else {
            System.out.println(num + " is not divisible by 5 and 11");
        }
        sc.close();
    }
}