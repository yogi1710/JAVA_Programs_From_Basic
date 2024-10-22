import java.util.ArrayList;
import java.util.stream.Stream;
// importing the list 
import java.util.List;
// Importing the collectors
import java.util.stream.Collectors;

public class CollectingEvenNumbersFromArrayListUsingStreams {
    public static void main(String args[]) {
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            l1.add(i);
        }
        System.out.println("Original List : " + l1);
        // Filter the condition keep only even nu mbers
        List<Integer> l2 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Numbers List : " + l2);
    }
}