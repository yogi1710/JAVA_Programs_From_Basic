// Super() vs this() constructors in java
// https://www.geeksforgeeks.org/super-vs-this-in-java/

// what are the differences between super(), this() and super,this :
// super(), this()
// ----------------
// 1.There are the constructor calls.
// 2. we can use these to invoke superclass and current constructor directly
// 3. we should use only inside constructors of the first line, if we are using outside of constructor we get compile time error.

// super, this
// --------------
// 1.These are the keywords.
// 2. we can use refer parent and current calss 
// 3. we can use anywhere except static area we get compile time error.

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
        System.out.println("Sumo constructor.");
    }

    // call another constructor of same class
    public Sumo(String brand) {
        this(brand, 2022);
    }

    // Method to disply the Sumo details
    public void displayDetails() {
        // call super class method to display brand
        super.displayBrand();
        System.out.println("year : " + year);
    }
}

class SuperVSthis {
    public static void main(String args[]) {
        Sumo mySumo1 = new Sumo("toyota", 2022);
        Sumo mySumo2 = new Sumo("honda");
        // Display detials of the Sumo
        System.out.println("Sumo1 Detials : ");
        mySumo1.displayDetails();
        System.out.println("Sumo2 Detials : ");
        mySumo2.displayDetails();
    }
}