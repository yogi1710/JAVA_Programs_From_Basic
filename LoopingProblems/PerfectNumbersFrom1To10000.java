class PerfectNumbersFrom1To10000 {
    public static void main(String args[]) {
        for (int i = 1; i <= 10000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}