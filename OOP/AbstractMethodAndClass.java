abstract class Shape {
    public abstract double calcualteArea();
}

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