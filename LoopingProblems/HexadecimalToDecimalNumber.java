
// Write a program to convert Hexadecimal to Decimal number system
import java.util.Scanner;

class HexadecimalToDecimalNumber {

    static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    static int ToDecimal(char n, int len) {
        int decimal = 0;
        // System.out.println(n);
        switch (n) {
            case 'a':
                decimal = 10;
                break;
            case 'b':
                decimal = 11;
                break;
            case 'c':
                decimal = 12;
                break;
            case 'd':
                decimal = 13;
                break;
            case 'e':
                decimal = 14;
                break;
            case 'f':
                decimal = 15;
                break;
            default:
                return n - 48;
            // doubt!!
            // should calrify!...for every interger value number 48 is additionally added
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hexa Decimal Value ranges(0-9, a-e) use small letters only : ");
        String hexaDecimal = sc.nextLine();
        int count = 0;
        // int sum =0;
        // String mainValue = hexaDecimal;
        int decimal = 0;
        System.out.println(hexaDecimal);
        int len = hexaDecimal.length();
        for (int i = len - 1; i >= 0; i--) {
            char ch = hexaDecimal.charAt(i);
            int value = ToDecimal(ch, len);
            decimal += value * power(16, count);
            // System.out.println(i + " " + ch + " " + value + " " + decimal);
            count++;
        }
        System.out.println("The Decimal Value is : " + decimal);
    }
}