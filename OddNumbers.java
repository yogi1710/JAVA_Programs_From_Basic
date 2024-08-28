import java.util.Scanner;

class OddNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int i = 1;
        while (i <= number) {
            System.out.print(i + " ");
            i = i + 2;
        }
        sc.close();
    }
}