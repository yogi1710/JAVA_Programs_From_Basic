class FinalKeyword {
    public static void main(String[] args) {
        // - final keyword in java
        // - final keyword in java is used to declare a constant variable, a method that
        // cannot be overridden
        // and a class that cannot be inherited.
        // ---Final variables--
        // - final variables are declared with the final keyword and cannot be changed
        // once they are initialized.
        // -Ex:
        final int x = 10;
        // x = 20; // This will give a compilation error
        System.out.println("Value of x: " + x);
        // ---Final methods---
        // - final methods are declared with the final keyword and cannot be overridden.
        // - creating an object for deer and using Final method
        Deer deer = new Deer();
        deer.eat(); // This will call the eat() method of the Deer class
    }
}

// ---Final methods--
// - final methods are declared with the final keyword and cannot be overridden.
// - Ex:
class Animal1 {
    public final void eat() {
        System.out.println("Eating");
    }
}

class Deer extends Animal {
    public void eat() {
        System.out.println("Deer is eating");
    }
}

// - final class
// - final class is a class that cannot be inherited.
// - Ex:
final class Animal2 {
    public void eat() {
        System.out.println("Eating");
    }
}
// the type Rat can't subclass the final class Animal2
// We can't extend the fi nal classes to the subclass
// class Rat extends Animal2{
// public void eat(){
// System.out.println("Rats eats");
// }
// }