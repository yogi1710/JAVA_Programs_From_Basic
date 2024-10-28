import java.util.function.Function;

class FunctionExampleUsingFunction {
    public static void main(String args[]) {
        Function<Integer, Integer> f = n -> n * n;
        System.out.println("The square of 4 is : " + f.apply(4));
        System.out.println("The square of 11 is : " + f.apply(11));
    }

}