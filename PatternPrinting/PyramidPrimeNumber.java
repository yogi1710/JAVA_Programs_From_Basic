import java.util.Scanner;

class PyramidPrimeNumber {
    static boolean isPrime(int pri) {
        boolean flag = true;
        for (int l = 2; l <= pri / 2; l++) {
            if (pri % l == 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();
        int pri = 2;
        int count = 0;
        // boolean flag = true;
        for (int i = 1; i <= n; i++) {
            count = 0;
            for (int k = 0; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; count < i; j++) {
                boolean prime = isPrime(pri);
                if (prime == true) {
                    count++;
                    System.out.print(pri + " ");
                }
                pri++;
            }
            System.out.println();
        }
    }
}