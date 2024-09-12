class Person {
    String name;
    int age;

    // Creating the constructor
    // In a constructor there will be no return type
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Creating the copy constructor
    public Person(Person anotherPerson) {
        this.name = anotherPerson.name;
        this.age = anotherPerson.age;
    }

    // Method to display the details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String args[]) {
        // Creating the person object using the constructor
        Person person1 = new Person("Alice", 32);
        System.out.println("Person1 Details : ");
        person1.displayDetails();
        System.out.println();

        // creating the another person object ussing the copy constructor
        Person person2 = new Person(person1);
        // Display the details of person 2
        System.out.println("Details of person2 is the copy of person1 : ");
        person2.displayDetails();
    }
}