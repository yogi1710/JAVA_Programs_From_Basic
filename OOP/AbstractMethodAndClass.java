abstract class Shape {
    public abstract double calcualteArea();
}
// In Java, abstract methods are used to provide common method implementations
// to subclasses, or to provide default implementations. They are declared using
// the keyword "abstract" and do not have a body.
// Here are some other things to know about abstract methods in Java:
// Abstract classes
// Abstract classes can have abstract methods, but they are not required to. A
// class that has abstract methods must also be abstract.
// Inheritance
// Subclasses of an abstract class must implement all abstract methods, unless
// the subclass is also abstract.
// Interfaces
// An abstract class can implement interfaces without providing the
// implementation of the interface methods.
// Abstraction
// Abstraction is a central principle in Java's object-oriented programming. It
// helps hide complex implementation details and make systems easier to
// understand and manage.

class Circle extends Shape {
    private double radius;

    // constructutor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcualteArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double bredth;

    // constructor
    public Rectangle(double length, double bredth) {
        this.length = length;
        this.bredth = bredth;
    }

    public double calcualteArea() {
        return length * bredth;
    }
}

class AbstractMethodAndClass {
    // difference betwwen abstract method and class
    // if a class contain atleast 1 abstract mehtod then compulsary the
    // corresponding class should be declared with abstract modifier,because
    // implementation is not complete and hence we can't create the object for the
    // abstract class
    // as we know, we can create the object for the non-abstract class
    // -- even thought class does't contain any abstract methods still we can
    // declare that ckass as abstract thst is abstract class can contain zero
    // or more abstract methods
    public static void main(String args[]) {
        // we can't create the object for the abstract class
        // hence we create the objects for non abstract class that is circel and
        // rectangle classes
        Circle circle = new Circle(5.0);
        System.out.println("Area of circle is : " + circle.calcualteArea());

        Rectangle rectangle = new Rectangle(4.0, 2.0);
        System.out.println("Area of Rectangle is : " + rectangle.calcualteArea());
    }
}