public class Method {
    // IN java method is a blockof code that performs a specific task
    // The main advantage of methods are reusability of code.

    // calling method
    // This is a static method
    // if the specifier is public then it is called as instance method
    // Instance method is created inside the class and outside the main method.
    // if the return type is nothing then while creating the method we use the void
    // If the return type is any datatype then we specify the return type such as
    // int, boolean, string etc..
    // Syntax for creating method
    // public static returntype methodName(parameters)
    // example:
    // public static void main(String[] args)
    // This is the method which we use in every program
    // This is called as main method
    // when we run the code the compiler executes the main method first
    // The main method is the entry point of the program
    // Method without return tyoe and parameters
    public void greet() {
        System.out.println("Hello, how are you?");
    }

    // method without return type and with paramters
    public void multiply(int a, int b) {
        int result = a * b;
        System.out.println("The result is: " + result);
    }

    // Method with return type and without parameters
    public int sum() {
        int a = 10;
        int b = 20;
        int result = a + b;
        return result;
    }

    // Method with return type and with parameters
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Method obj = new Method();
        obj.greet();
        obj.multiply(5, 6);
        System.out.println(obj.sum());
        System.out.println(add(5, 6));
        System.out.println(Method.add(5, 6));
        // We can call the static method directlywith in the same class or with the
        // class name in which the method exists
        // we can not acess the static method using the objects
    }
}
