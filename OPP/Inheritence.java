// ANimal class - super class.
class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

// Dog class (sub class of animal)
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }

    public void fetch() {
        System.out.println("Fetching a ball");
    }
}

// Cat class(Sub class of Animal)
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }

    public void scratch() {
        System.out.println("Scratching fruniture");
    }
}

public class Inheritence {
    // 1. what ever the parent class has by default available to the child class but
    // what the child class by default not available to the parent.
    // Hence on the child reference we can call both parent and child class methods.
    // but the parent reference we call only on the parent class methods available
    // in the parent class and we can't call child specific methods.

    // 2. parent class reference can be used to hold class object but by using that
    // reference we can call only methods available in the parent class and child
    // specific methods we can't call.

    public static void main(String args[]) {
        // upcasting
        // parent obj = new child
        Animal animal1 = new Dog();// upcasting dog to animal
        Animal animal2 = new Cat();// upcasting cat to animal
        animal1.makeSound();
        animal2.makeSound();
        // downcasting
        // child obj = new parent
        Dog dog = (Dog) animal1;// downcasting animal to dog
        Cat cat = (Cat) animal2;
        dog.fetch();
        cat.scratch();
        // method 2 for downcasting
        // InstanceOf operator
        // * we can't use the Animal class while douncasting because Dog is not
        // instanceof
        // Animal class
        // * if we use instanceof operator then it will return false for Animal
        // * But we have Dog instance in animal1
        if (animal1 instanceof Dog) {
            Dog dog1 = (Dog) animal1;
            dog1.fetch();
        }
    }
}
