import java.util.stream.Stream;
import java.util.ArrayList;

public class MappingExample {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        Stream<Integer> s = numbers.stream();
        Stream<Integer> newNumber = s.map(i -> i + 10);
        newNumber.forEach(System.out::println);
        // printing the reference variable
        System.out.println(newNumber);
    }
}