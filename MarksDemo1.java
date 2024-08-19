public class MarksDemo1 {
    public static void main(String[] yogi) {
        int marks1 = 90;
        int marks2 = 50;
        int marks3 = 87;
        // average of the 3 numbers
        double avg = (marks1 + marks2 + marks3) / 3;
        System.out.println("Average Marks    :  " + avg);
        if (avg <= 40) {
            System.out.print("Fail");
        } else if (avg > 40 && avg <= 60) {
            System.out.print("pass");
        } else if (avg > 60 && avg <= 80) {
            System.out.print("Average");
        } else {
            System.out.print("Top");
        }
    }
}