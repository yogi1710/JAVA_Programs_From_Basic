class PatternTrial {
    static boolean isPrime(int pri) {
        boolean flag = true;
        for (int l = 2; l <= pri / 2; l++) {
            if (pri % l == 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int count = 0;
        int i = 4;
        int pri = 2;
        for (int j = 1; count < i; j++) {
            boolean prime = isPrime(pri);
            if (prime == true) {
                count++;
                System.out.print(pri + " ");
            }
            pri++;
        }
    }
}