import java.util.Scanner;

class TrailDemo {
    public static void main(String args[]) {
        System.out.println(0.0 / 0);
        // 10/0 excepction
        // 10.0/0 infinity
        // -10/0 excepction
        // -10.0/0 -infinity
        // 0/0 excepction
        // 0.0/0 NaN
        System.out.println("__________________________________");

        // concatination operator
        int a = 10, b = 20, c = 30;
        String d = "yogi";
        System.out.println(a + b + c + d);// 60yogi
        System.out.println(b + c + d + a);// 50yogi10
        System.out.println(c + d + a + b);// 30yogi1020
        System.out.println(d + a + b + c);// yogi102030
        System.out.println("__________________________________");

        // Increment and Decrement Operators(++, --)
        int x = 10;
        System.out.println(x++); // 10
        System.out.println(++x); // 12
        System.out.println(x--); // 12
        System.out.println(--x); // 10

        System.out.println("__________________________________");
        // Bitwise operators
        // Bitwise and - &, bitwise or - |, bitwise exclusive OR - ^
        // exclusive or ----> if both arguments are different then it returns ture else
        // false

        x = 10;
        int y = 6;
        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(x ^ y);
        System.out.println("__________________________________");

        // Logical Operators
        // Logical and - &&, logical or - ||, logical not - !
        // logical and ----> if both arguments are true then it returns true else false
        // logical or ----> if any one argument is true then it returns true else false
        // logical not ----> it returns true if argument is false else false
        // syntax of logical operators
        // if (condition1 && condition2 && condition3)
        // if (condition1 || condition2 || condition3)
        // if (!condition)

        x = 10;
        y = 6;
        System.out.println(x > 5 && x < 15);
        System.out.println(x > 5 || x < 15);
        System.out.println(x != y);
        System.out.println("__________________________________");

        // Assignment Operators
        // =, +=, -=, *=, /=, %=, <<=, >>=, >>>=
        // = ------> assigns the value of right operand to left operand
        // += ------> adds the value of right operand to left operand and assigns the
        // example with syntax
        // variable = value;
        // += ------> adds the value of right operand to left operand and assigns the
        // result to left operand
        // example with syntax
        // variable += value;
        //

        // -= ------> subtracts the value of right operand from left operand and assigns
        // syntax
        //
        // variable -= value;
        // *= ------> multiplies the value of right operand with left operand and
        // assigns the result to left
        // syntax
        //
        // variable *= value;
        // /= ------> divides the value of left operand by right operand and assigns the
        // result to left
        // syntax
        // variable /= value;
        // %= ------> finds the remainder of left operand divided by right operand and
        // assigns the result to left
        // syntax
        //
        // variable %= value;
        // <<= ------> left shift operator, it shifts the left operand to left by the
        // syntax
        //
        // variable <<= value;
        // >>= ------> right shift operator, it shifts the left operand to right by the
        // value of right
        // syntax
        // variable >>= value;
        // >>>= ------> unsigned right shift operator, it shifts the left operand to right by the value
        // syntax
        // variable >>>= value;
        x = 10;
        y = 6;
        System.out.println(x + y);
        System.out.println(x += y);
        //
        System.out.println(x -= y);
        //
        //
        System.out.println(x *= y);
        System.out.println("__________________________________");

        // ternary Operators
        // ? : ------> if the condition is true then it returns the value of first
        // operand else it returns the value of second operand
        // syntax
        // variable = (condition) ? value_if_true : value_if_false;
        x = 10;
        y = 6;
        System.out.println(x > y ? "x is greater than y" : "x is not greater than y");
        System.out.println("__________________________________");

        // nested ternary operator
        // syntax
        // variable = (condition1) ? (condition2) ? value_if_true : value_if
        // example problem
        // find the maximum of three numbers
        // int a = 10;
        // int b = 20;
        // int c = 30;
        System.out.println("Greatest number is : " + ((a > b) ? (a > c ? a : c) : (b > c ? b : c)));

        // A person goes to a shopping, if he purchase more than or equal to 100 rupee
        // then he should get 50 percent discount, if he purchase less than 100 and more
        // than 50 he will get 10% discount and if the purchase value is less than 50/-
        // then he will not get any discount?
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount the person purchased : ");
        amount = sc.nextInt();
        double discountValue;
        discountValue = (amount >= 100) ? (amount * 0.5) : (amount > 50 && amount < 100 ? amount * 0.1 : 0);
        System.out.println("Amount the person has to pay :" + (amount - discountValue));

    }
}