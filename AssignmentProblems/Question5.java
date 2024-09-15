// Sum of even and odd numbers in an array

class Question5 {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 3, 9, 8, 4, 12, 14 };
        int sumOdd = 0;
        int sumEven = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        System.out.println("Even sum : " + sumEven);
        System.out.println("Odd sum : " + sumOdd);
    }
}