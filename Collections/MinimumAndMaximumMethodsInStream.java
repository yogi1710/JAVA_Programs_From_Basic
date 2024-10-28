import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;

public class MinimumAndMaximumMethodsInStream {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grape");
        String min = fruits.stream().min((s1, s2) -> s1.compareTo(s2)).get();
        System.out.println("Minimum element amoung the arrayList is : " + min);
        String max1 = fruits.stream().min((s1, s2) -> s2.compareTo(s1)).get();
        System.out.println("Maximum element amoung the arrayList is : " + max1);
        // Finding the maximum value using the - sign, it reverses the sorted values
        String max2 = fruits.stream().min((s1, s2) -> -s1.compareTo(s2)).get();
        System.out.println("Maximum element amoung the arrayList is : " + max2);
    }
}
