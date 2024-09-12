public class OOP {
    // It is the another way to provide solution for client problems.

    // Classes:
    // 1. Class is a blueprint or template for creating objects.
    // 2. Class is a collection of variables and methods.
    // 3. Class is a template for creating objects.
    // 4. Class is a blueprint for creating objects.

    // Objects:
    // 1. Objects are instances of classes.
    // 2. Objects have properties and methods.
    // 3. Objects are created from classes.
    // Ex:
    // class Car {
    // color = "red";
    // speed = 100;
    // }
    // let car = new Car();
    // console.log(car.color); // Output: red
    // console.log(car.speed); // Output: 100
    // console.log(car); // Output: Car { color: 'red', speed: 100

    // What are the differences between classes and objects?
    // 1. Class is a group of elements having common properties and behaviour.
    // Object is individual elements in the group of elements having physical
    // properties and physical behaviour.

    // 2. Class is Virtual
    // Object is Real/physical

    // 3. class is a virtual encapsulation of properties and behaviours
    // Object is a real/physical encapsulation of properties and behaviours

    // 4. Class is genralization
    // Object is specialization

    // 5. class is a model/blueprint for objects
    // Object is an instance of a class

    // Syntax of a class
    // class class_name {
    // // Objects
    // // modifiers
    // // properties
    // // methods
    // }

    // Syntax of an object
    // let object_name = new class_name();
    // console.log(object_name);

    public static void main(String[] args) {
        // Creating an object for a class
        Car car = new Car("Suziki", "Swift", 2021);
        // Accessing properties of the object
        car.displayDetails();
        Car car1 = new Car("Honda", "Accord", 2020);
        car1.displayDetails();
    }
}

class Car {
    String brand;
    String model;
    int year;

    // available Modifiers
    // public, private, protected & default
    // public: Accessible from any where
    // private: Accessible only within the class
    // protected: Accessible within the class and its subclasses
    // default: Accessible within the class and its package

    // Constructor(parametarized Constructors)
    public Car(String brand, String model, int year) {
        this.brand = brand;
        // this keyword is used to refer to the current object
        this.model = model;
        this.year = year;
        // super keyword:
        // super() is used to call the constructor of the superclass
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}