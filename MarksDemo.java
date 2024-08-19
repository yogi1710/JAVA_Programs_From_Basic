public class MarksDemo{
    public static void main(String[] yogi){
        int marks1 = 90;
        int marks2 = 50;
        int marks3 = 87;
        // average of the 3 numbers
        double avg = (marks1+marks2+marks3)/3;

        if(avg >= 40){
            System.out.print("pass");
        }
        else{
            System.out.print("Not pass");
        }
    }
}