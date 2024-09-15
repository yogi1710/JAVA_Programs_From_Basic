class AlphabetG {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++)
                    System.out.print("* ");
            } else if (i == n / 2) {
                for (int j = 0; j < n; j++) {
                    if (j > n / 2 || j == 0)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            } else if (i >= n / 2) {
                for (int j = 0; j <= n; j++) {
                    if (j == 0 || j == n)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (j == 0)
                        System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}