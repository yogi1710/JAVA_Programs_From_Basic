import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;

public class StreamOfMethodInStream {
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
        // using stream.of() method in stream
        Stream<Integer> s1 = Stream.of(9, 99, 999, 9999, 99999);
        s1.forEach(System.out::println);
        // explaining about the stream.of method in words
        // stream.of() method is used to create a stream from a variable number of
        // arguments.
        // It is a static method of the Stream class in the java.util package.
        // It is used to create a stream from a variable number of arguments.
        // It is a shortcut for creating a stream from a variable number of arguments.
        // It is used to create a stream from a variable number of arguments.
        // It is a shortcut for creating a stream from a variable number of arguments.
    }
}
