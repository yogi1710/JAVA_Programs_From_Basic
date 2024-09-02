// Print Harshad Numbers from 1 to 1000. A Number which divisible by the sum of its digits. ex:- 156=1+5+6=12

class HarshadNumbersFrom1000 {
    static int HarshadNumber(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        for (int i = 10; i <= 1000; i++) {
            int sum = HarshadNumber(i);
            if (i % sum == 0)
                System.out.print(i + " ");
        }
    }
}