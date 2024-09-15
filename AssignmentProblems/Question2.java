// 1 
// 1 2 1
// 1 2 3 2 1
// 1 2 3 4 3 2 1
class Question2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(j + " ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}