import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;

public class SortingOrderOfListUsingSortedMethodInStreamProcessing {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grape");
        // default sorted method
        List<String> l2 = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println("Default sorting order : " + l2);
        // Sorted method for accending order - s1.compareTo(s2).
        List<String> l3 = fruits.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(l3);
        // Sorted method for decending order - s2.compareTo(s1).
        List<String> l4 = fruits.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println(l4);
    }
}