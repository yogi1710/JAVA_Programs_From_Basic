import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 4, 2, 1, 4, 6, 7, 8, 6, 5, 8, 4, 5 };
        Arrays.sort(arr);
        for (int number : arr) {
            System.out.print(number + " ");
        }
        int frequency = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                frequency++;
            } else {
                System.out.println("\n" + arr[i - 1] + " occurs " + frequency + " times");
                frequency = 1;
            }
        }
        System.out.println("Element: " + arr[arr.length - 1] + ", Frequency: " + frequency);
    }
}
