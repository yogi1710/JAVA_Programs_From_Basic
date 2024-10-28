import java.util.function.Function;

class FunctionChaining {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = i -> i * i;
        Function<Integer, Integer> f2 = i -> i * i * i;
        // Here we apply function chaining
        System.out.println(f1.andThen(f2).apply(2));// method 1
        System.out.println(f1.compose(f2).apply(3));// method 2
    }
}

// 1. f1.andThen(f2).apply(2)
// This statement uses andThen, which means the result of f1 will be passed as input to f2.

// Let's break it down:

// f1.apply(2):
// f1 squares the input, so 2 * 2 = 4.
// f2.apply(4):
// f2 cubes the result of f1, so 4 * 4 * 4 = 64.


// 2. f1.compose(f2).apply(3)
// This statement uses compose, which means the second function (f2) will be applied first, and then the result of f2 will be passed to f1.

// Let's break it down:

// f2.apply(3):
// f2 cubes the input, so 3 * 3 * 3 = 27.
// f1.apply(27):
// f1 squares the result of f2, so 27 * 27 = 729.