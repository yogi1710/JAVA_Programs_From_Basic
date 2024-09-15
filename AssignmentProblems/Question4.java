// Frequency of each number in an array
import java.util.Arrays;

class Question4 {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 2, 4, 6, 2, 1, 4, 2 };
        Arrays.sort(arr);
        int frequency = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                frequency++;
            } else {
                System.out.println("Frequeny of " + arr[i - 1] + " arr " + frequency);
                frequency = 1;
            }
        }
        System.out.println("Frequeny of " + arr[arr.length - 1] + " arr " + frequency);// arr[i]-mistake in paper
    }
}