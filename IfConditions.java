import java.util.Scanner;

class IfConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println("Number " + n + " is Positive");
        } else {
            System.out.println("Number " + n + " is Negative");
        }
        sc.close();
    }
}