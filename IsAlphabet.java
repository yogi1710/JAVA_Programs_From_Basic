import java.util.Scanner;
// Write a program to check whether a character is an alphabet or not?

class IsAlphabet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character value : ");
        char characterValue = sc.next().charAt(0);
        if (characterValue >= 'a' && characterValue <= 'z' || characterValue >= 'A' && characterValue <= 'Z') {
            System.out.println("The \"" + characterValue + "\" is a alphabet.");
        } else {
            System.out.println("The \"" + characterValue + "\" is not a alphabet.");
        }
        sc.close();
    }
}