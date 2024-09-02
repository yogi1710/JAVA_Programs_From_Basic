// Write a Program to print All Armstrong numbers between 1 to 1000

class ArmstrongNumberUpto1000 {
    static int count(int a) {
        int flag = 0;
        for (; a > 0;) {
            a = a / 10;
            flag++;
        }
        return flag;
    }

    static int power(int a, int b) {
        int ans = 1;
        for (; b > 0; b--) {
            ans = ans * a;
        }
        return ans;
    }

    public static void main(String args[]) {
        for (int i = 1; i <= 1000; i++) {
            int value = i;
            int sum = 0;
            int flag = count(i);
            for (; value > 0;) {
                int rem = value % 10;
                sum = sum + power(rem, flag);
                value = value / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}