import java.util.Scanner;

//9. Write a program to input any character and check whether it is alphabet, digit or special character

class CharacterCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a small alphabet");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is a capital alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println("\""+ch +"\"" +" is a special character");
        }
        sc.close();
    }
}