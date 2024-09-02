// Check if a number is duck number or not. A number which has zeros present in it ex:-402 280

import java.util.Scanner;

class DuckNumberOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int flag = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 0) {
                flag = 1;
                System.out.println("Duck Number");
                break;
            }
            n = n / 10;
        }
        if (flag == 0)
            System.out.println("Not a Duck Number");
    }
}