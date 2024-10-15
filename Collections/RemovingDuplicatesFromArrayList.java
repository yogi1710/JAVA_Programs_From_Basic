import java.util.Scanner;
import java.util.ArrayList;

class RemovingDuplicatesFromArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList<String> array1 = new ArrayList<String>();
        ArrayList<Integer> array1 = new ArrayList<>();
        while (sc.hasNextInt()) {
            array1.add(sc.nextInt());
        }
        System.out.println();
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("ArrayList after removing duplicates: ");
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int i : array1) {
            if (!array2.contains(i)) {
                array2.add(i);
            }
        }
        for (int num : array2) {
            System.out.print(num + " ");
        }
    }
}