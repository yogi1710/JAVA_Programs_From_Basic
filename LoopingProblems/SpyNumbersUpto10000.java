// print spy numbers upto 10000. Means sum its digits equal to product of its digits-->123-->1+2+3=1*2*3

class SpyNumbersUpto10000 {
    static void spyNumberCheck(int a) {
        int sum = 0;
        int product = 1;
        int value = a; // to keep the original value of a

        for (; a > 0;) {
            int rem = a % 10;
            sum = sum + rem;
            product = product * rem;
            a = a / 10;
        }
        if (product == sum)
            System.out.print(value+" ");
    }

    public static void main(String args[]) {
        for (int i = 1; i < 10000; i++) {
            spyNumberCheck(i);
        }
    }
}