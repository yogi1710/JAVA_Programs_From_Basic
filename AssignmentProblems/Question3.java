// Pyramid with numbers
//      1 
//     2 3
//    4 5 6
//   7 8 9 10

class Question3 {
    public static void main(String args[]) {
        int n = 4;
        int num = 1;
        for (int i =0; i < n; i++) {
            for (int k = 0; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(num + " ");
                num ++;
            }
            System.out.println();
        }
    }
}