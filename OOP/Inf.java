interface Imp {
    int a = 20;// By default it is comsidered as static final variable
    // As it is final variable, we can't modify it

    void add();// defaultly function/method is considered as abstract in interface

    void sub();

}

class A implements Imp {
    public void add() {
        System.out.println("Addition");
    }

    public void sub() {
        System.out.println("Substraction");
    }
}

public class Inf {
    public static void main(String[] args) {
        A a = new A();
        a.add();
        a.sub();
        System.out.println(Imp.a);
        System.out.println(a.a);
        // Imp.a = 30;
        // This gives us error as : cannot assign a value to static final variable a
    }
}