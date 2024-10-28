import java.util.function.Function;

class FindingLengthUsingFunction {
    public static void main(String args[]) {
        Function<String, Integer> f = s -> s.length();
        System.out.println("Length of word \"malli\" : " + f.apply("malli"));
        System.out.println("Length of word \"Function calling\" : " + f.apply("Function calling"));
    }
}