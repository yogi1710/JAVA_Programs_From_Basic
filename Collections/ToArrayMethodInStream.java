import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;

public class ToArrayMethodInStream {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grape");
        System.out.println(fruits);
        // using toarray method in stream
        String[] array = fruits.stream().toArray(String[]::new);
        System.out.println(array);
        for(String s:array){
            System.out.println(s);
        }
    }
}
