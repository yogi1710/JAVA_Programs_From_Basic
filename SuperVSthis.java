// Super() vs this() constructors in java
// https://www.geeksforgeeks.org/super-vs-this-in-java/

class Vechile {
    String brand;

    // constructor
    public Vechile(String brand) {
        this.brand = brand;
        System.out.println("Vechile constructor");
    }

    // Method to display the details
    public void displayBrand() {
        System.out.println("brand : " + brand);
    }
}

// sub-class named Sumo extends Vechile
class Sumo extends Vechile {
    int year;

    // Constructor of a class with brand year
    public Sumo(String brand, int year) {
        // call super class constructor to initilize the brand
        super(brand);
        this.year = year;
    }

    // call another constructor of same class
    public Sumo(String brand) {
        this(brand, 2022);
    }

    // Method to disply the Sumo details
    public void displayDetails() {
        System.out.println("year : " + year);
        // call super class method to display brand
        super.displayBrand();
    }
}

class SuperVSthis {
    public static void main(String args[]) {
        Sumo mySumo1 = new Sumo("toyota", 2022);
        Vechile mySumo2 = new Vechile("honda");
        // Display detials of the Sumo
        System.out.println("Sumo1 Detials : ");
        mySumo1.displayDetails();
        System.out.println("Sumo2 Detials : ");
        mySumo2.displayBrand();
    }
}