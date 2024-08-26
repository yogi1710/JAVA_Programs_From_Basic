import java.util.Scanner;

// 11. Write a program to input week number and print week day

class WeekName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter week number");
        int week = sc.nextInt();
        String weekName = null;
        switch (week) {
            case 1:
                weekName = "Monday";
                break;
            case 2:
                weekName = "Tuesday";
                break;
            case 3:
                weekName = "Wednesday";
                break;
            case 4:
                weekName = "Thursday";
                break;
            case 5:
                weekName = "Friday";
                break;
            case 6:
                weekName = "Saturday";
                break;
            case 7:
                weekName = "Sunday";
                break;
            default:
                weekName = "Invalid week number";
        }
        System.out.println("Week day is " + weekName);
        sc.close();
    }
}