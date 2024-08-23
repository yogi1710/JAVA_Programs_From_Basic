class A {
    int a = 10;
    static int b = 20;
    static int c;

    public static void main(String atgs[]) {
        int d = 63;
        A ob1 = new A();
        System.out.println(ob1.a);
        System.out.println(A.b);
        A.c = d;
    }
}

class B {
    public static void main(String args[]) {
        A ob1 = new A();
        System.out.println(ob1.a);
        System.out.println(A.b);
        System.out.println(A.c);
    }
}