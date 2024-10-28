import java.util.ArrayList;
import java.util.stream.Stream;

public class CountMethodExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grape");

        long count = fruits.stream().filter(s -> s.length() == 5).count();
        System.out.println("The number of fruits with string lenght 5 : " + count);
    }
}