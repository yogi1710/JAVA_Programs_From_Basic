// Write a program to print reverse alphabets from Z to A

import java.util.Scanner;

class AlphabetsPrintingReverse {
    public static void main(String[] args) {
        System.out.println("All alphabets from Z to A : ");
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
    }
}