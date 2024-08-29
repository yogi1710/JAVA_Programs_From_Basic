// Write a program to print the ASCII values

import java.util.Scanner;
class ASCIIvalues {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i + " " + "ASCII value is " + (int) i);
        }
        System.out.println();
        System.out.println("Character from user ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        System.out.println("ASCII value of " + ch + " is " + (int) ch);
    }
}
