import java.util.Scanner;

// 10. Write a program to check whether a character is uppercase or lowercase alphabet

class UpperLower {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z'){
            System.out.println("\""+ch+"\""+" is Uppercase");
            }
            else if (ch >= 'a' && ch <= 'z'){
                System.out.println("\""+ch+"\""+" is Lowercase");
                }
                sc.close();
    }
}