import java.util.Scanner;

class AbsoluteValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int val = sc.nextInt();
        if (val < 0) {
            System.out.println("Absolute value of " + val + " is " + (-val));
        }
        sc.close();
    }
}