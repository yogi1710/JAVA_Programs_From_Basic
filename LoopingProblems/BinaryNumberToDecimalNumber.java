class BinaryNumberToDecimalNumber {

    static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {

        int binary = 1010;
        int count = 0;
        int mainValue = binary;
        int decimal = 0;
        System.out.println(binary);
        for (; binary > 0;) {
            count++;
            binary = binary / 10;
        }
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            int remainder = mainValue % 10;
            decimal = decimal + remainder * power(2, i);
            mainValue /= 10;
        }
        System.out.println(decimal);

    }
}