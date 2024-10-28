import java.util.function.Consumer;

class ConsumerExample {
    public static void main(String args[]) {
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Hello World!");
    }
}