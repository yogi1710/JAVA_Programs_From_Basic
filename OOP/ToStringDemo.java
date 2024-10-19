class ClassName {
    int id;
    String name;

    ClassName(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Id= " + this.id + " Name= " + this.name;
    }
}

public class ToStringDemo {
    public static void main(String[] args) {
        ClassName c1 = new ClassName(10, "Hari");
        ClassName c2 = new ClassName(20, "Siddu");
        System.out.println(c1);
        // without toString method, the above sop prints the address of the object
        // If the toString method is written then the object overrides the reference varible, that is the above sop diverts to the toString
        // method
        // As we can see the toString methods returns the String type, now the above sop
        // prints the Id= 10 Name= Hari
        System.out.println(c2);
        // similarly the c2 return the toString method of the given values.
    }
}