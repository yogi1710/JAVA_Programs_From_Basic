// Write a program to convert Hexadecimal to Binary number system

import java.util.Scanner;

class HexaDecimalToBinaryNumber {
    static int ToNumber(int n) {
        int num = 0;
        switch (n) {
            case 'a':
                num = 10;
                return num;
            case 'b':
                num = 11;
                return num;
            case 'c':
                num = 12;
                return num;
            case 'd':
                num = 13;
                return num;
            case 'e':
                num = 14;
                return num;
            case 'f':
                num = 15;
                return num;
            default:
                num = n - '0';
                return num;
        }
    }

    static String ToBinary(int num) {
        String binary = "";
        System.out.print(num + " ");
        while (num > 0) {
            int rem = num % 2;
            binary = rem + binary;
            num = num / 2;
        }
        if (binary.length() != 4) {
            switch (4 - binary.length()) {
                case 1:
                    binary = "0" + binary;
                    break;
                case 2:
                    binary = "00" + binary;
                    break;
                case 3:
                    binary = "000" + binary;
                    break;
                case 4:
                    binary = "0000";
                    break;
            }
        }
        System.out.println(binary);
        return binary;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hexadecimal Value : ");
        String hexaDecimal = sc.nextLine();
        int len = hexaDecimal.length();
        String result = "";
        for (int i = len - 1; i >= 0; i--) {
            char ch = hexaDecimal.charAt(i);
            int num = ToNumber(ch);
            String binaryVlaue = ToBinary(num);
            result = binaryVlaue + result;
        }
        System.out.println(result);
    }
}