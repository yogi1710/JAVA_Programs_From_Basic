class Main {
    int a = 10, b = 20;
    static int x = 20;

    void disp() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
    }

    static void disp1() {
        Main huu = new Main();
        System.out.println(huu.a);
        System.out.println(huu.b);
        System.out.println(x);
    }
}

class FinalMain {
    public static void main(String args[]) {
        Main obj = new Main();
        obj.disp();
        Main.disp1();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(Main.x);
        C var = new C();
        var.disp();
        C.disp1();
    }
}

class C {
    void disp() {
        Main obj1 = new Main();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(Main.x);
    }

    static void disp1() {
        Main obj1 = new Main();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj1.x);
    }
}