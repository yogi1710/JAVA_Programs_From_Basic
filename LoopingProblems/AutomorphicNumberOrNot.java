// Check if a number is Automorphic Number or Not. It is number which is contained in the last digit(s) of its square:- eX:- 25 in 625

import java.util.Scanner;

class AutomorphicNumberOrNot {
    static int count(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static int power(int count) {
        int result = 1;
        for (int i = 1; i <= count; i++) {
            result = result * 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp = n;
        int square = n * n;
        int flag = count(n);
        int divisibleCount = power(flag);
        int last = square % divisibleCount;
        if (last == temp) {
            System.out.println(n + " is an Automorphic Number");
        } else {
            System.out.println(n + " is not an Automorphic Number");
        }
    }
}