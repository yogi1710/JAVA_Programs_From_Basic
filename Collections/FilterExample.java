import java.util.stream.Stream;
// importing the arraylist
import java.util.ArrayList;

class FilterExample {
    public static void main(String arga[]) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        // initilizing the stream
        Stream<Integer> s = numbers.stream();
        // Applying filter method
        Stream<Integer> evenNumbers = s.filter(i -> i % 2 == 0);
        // printing the filtered values
        System.out.println(evenNumbers);// It prints the reference variable of the evenNumbers
        evenNumbers.forEach(System.out::println);
    }
}