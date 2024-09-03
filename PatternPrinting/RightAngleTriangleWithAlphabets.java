import java.util.Scanner;

class RightAngleTriangleWithAlphabets {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows values : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (97 + j) + " ");
            }
            System.out.println();
        }
    }
}