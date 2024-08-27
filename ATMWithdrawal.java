import java.util.Scanner;

// take the withdrawal amount input from the user and print the remaining balance on the console if withdrawal possible?
class ATMWithdrawal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Available Balance : ");
        int accountBalance = sc.nextInt();
        System.out.println("Enter the amount to withdraw");
        int withdrawAmount = sc.nextInt();
        int n500, n100, n50, n20, n10, n5, n2, n1;
        n500 = n100 = n50 = n20 = n10 = n5 = n2 = n1 = 0;
        if (withdrawAmount <= accountBalance) {
            int remainingBalance = accountBalance - withdrawAmount;
            System.out.println("The remaning balance is : " + remainingBalance);

            while (withdrawAmount > 0) {
                if (withdrawAmount >= 500) {
                    n500 = withdrawAmount / 500;
                    withdrawAmount = withdrawAmount - n500 * 500;
                } else if (withdrawAmount >= 100) {
                    n100 = withdrawAmount / 100;
                    withdrawAmount = withdrawAmount - n100 * 100;
                } else if (withdrawAmount >= 50) {
                    n50 = withdrawAmount / 50;
                    withdrawAmount = withdrawAmount - n50 * 50;
                } else if (withdrawAmount >= 10) {
                    n10 = withdrawAmount / 10;
                    withdrawAmount = withdrawAmount - n10 * 10;
                } else if (withdrawAmount >= 5) {
                    n5 = withdrawAmount / 5;
                    withdrawAmount = withdrawAmount - n5 * 5;
                } else if (withdrawAmount >= 2) {
                    n2 = withdrawAmount / 2;
                    withdrawAmount = withdrawAmount - n2 * 2;
                } else if (withdrawAmount >= 1) {
                    n1 = withdrawAmount / 1;
                    withdrawAmount = withdrawAmount - n1 * 1;
                }

                System.out.println("No.of 500 notes : " + n500);
                System.out.println("No.of 100 notes : " + n100);
                System.out.println("No.of 50 notes : " + n50);
                System.out.println("No.of 20 notes : " + n20);
                System.out.println("No.of 10 notes : " + n10);
                System.out.println("No.of 5 notes : " + n5);
                System.out.println("No.of 2 notes : " + n2);
                System.out.println("No.of 1 notes : " + n1);
        } 
    }
    else{
        System.out.println("Insufficient balance");
    }
    sc.close();
}
}