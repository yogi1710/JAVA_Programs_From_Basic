// Write a program to print All Strong numbers 1 to 100000

class StrongNumberUpto100000 {
    static int count(int a) {
        int flag = 0;
        for (; a > 0;) {
            a = a / 10;
            flag++;
        }
        return flag;
    }

    static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String args[]) {
        for (int i = 1; i <= 100000; i++) {
            int sum = 0;
            int strong = i;
            int num = i;
            // System.out.println(strong);
            for (; num > 0;) {
                int rem = num % 10;
                sum = sum + factorial(rem);
                num = num / 10;
            }
            // System.out.println(sum);
            if (sum == strong) {
                System.out.print(strong + " ");
            }
        }
    }
}