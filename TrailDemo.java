class TrailDemo {
    public static void main(String args[]) {
        System.out.println(0.0 / 0);
        // 10/0 excepction
        // 10.0/0 infinity
        // -10/0 excepction
        // -10.0/0 -infinity
        // 0/0 excepction
        // 0.0/0 NaN

        // concatination operator
        int a = 10, b = 20, c = 30;
        String d = "yogi";
        System.out.println(a + b + c + d);// 60yogi
        System.out.println(b + c + d + a);// 50yogi10
        System.out.println(c + d + a + b);// 30yogi1020
        System.out.println(d + a + b + c);// yogi102030

        // Increment and Decrement Operators(++, --)
        int x = 10;
        System.out.println(x++); // 10
        System.out.println(++x); // 12
        System.out.println(x--); // 12
        System.out.println(--x); // 10
    }
}