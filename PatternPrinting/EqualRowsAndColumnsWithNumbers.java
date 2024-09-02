
// package PatternPrinting;
import java.util.Scanner;

public class EqualRowsAndColumnsWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(j + " ");
                // System.out.print ((char)(97+j)+" ");
                // To print the alphabets we need to typecase the j value by adding 97 to j value
                // for every iteration, we will add 97 that is asscii value of 'a', hance it will convert the vlaue into the alphabetical form
                // For capital values we use ascci value of 'A' that is 65

                // to print the alphabets in the reverse order that is form 'z', we use the ascci value of the 'z' that is 122
                // similarly we can start the values from any alphabets by using the assci values, the only thing we need to do is, we should be aware of assci values and should perform the type casting.
                // System.out.print((n-1-j)+" "); 
                // This will print the values from n-1 to 0
                // withput changing the loop values we can do this, short method
            }
            System.out.println();
        }
    }
}
