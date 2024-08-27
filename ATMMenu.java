import java.util.Scanner;

class ATMMenu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int mypin = 123;
        System.out.println("Enter Your PIN?");
        int pin = sc.nextInt();
        if (pin == mypin) {
            do {
                System.out.println("Select the options below?");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");
                System.out.println();
                System.out.println("Enter your choice?");
                choice = sc.nextInt();
                int CurrentBalance = 20000;
                int withdraw = 0;
                int depositAmount = 0;
                switch (choice) {
                    case 1:
                        System.out.println("Your Balance is: " + CurrentBalance);
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw?");
                        withdraw = sc.nextInt();
                        if (CurrentBalance >= withdraw) {
                            System.out.println("Withdrawal Successful");
                            CurrentBalance -= withdraw;
                            System.out.println("Your Balance is: " + CurrentBalance);
                        } else {
                            System.out.println("Insufficient Balance!!!");
                        }
                        break;
                    case 3:
                        System.out.println("Enter amout to deposit?");
                        depositAmount = sc.nextInt();
                        System.out.println("Deposit Successful");
                        CurrentBalance += depositAmount;
                        System.out.println("Your Balance is: " + CurrentBalance);
                        break;
                    case 4:
                        System.out.println("Thank you for visting...");
                        break;
                    default:
                        System.out.println("The coice you have entered is invalid, please try again");
                        break;
                }
            }  while (choice != 4);
        }else{
            System.out.println("The PIN you have entered is Invalid.. Please try again!!!");
        }
        sc.close();
    }
}