
// importing array in the java
import java.util.Arrays;
import java.util.Scanner;

interface ArrayImplementation {
    public void create();

    public void select(int[] array);

    public void delete(int[] array);

    public void update(int[] array);
}

// The task is to create an array in the main method and by using the interface
// we should update, delete and select the data accordingly
public class ArraysDemo implements ArrayImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating an array of integers
        int[] array = { 1, 2, 3, 4, 5 };
        // System.out.println("Original array: " + Arrays.toString(array));
        ArraysDemo obj = new ArraysDemo();
        // Taking the inputs from the user and performing the operations
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Select 1 to Create the Array.");
            System.out.println("Select 2 to Select the Array.");
            System.out.println("Select 3 to Delete the element from the Array.");
            System.out.println("Select 4 to Update the index value in the Array.");
            System.out.println("Select 5 to exit");
            System.out.println();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj.create();
                    break;
                case 2:
                    obj.select(array);
                    break;
                case 3:
                    obj.delete(array);
                    break;
                case 4:
                    obj.update(array);
                    break;
                case 5:
                    isExit = true;
                    break;
                default:
                    System.out.println("Enter the valid input.");
                    break;
            }
        }
    }

    public void create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array created successfully");
        System.out.println();
    }

    public void select(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("selecting array: ");
        // for (int i : array) {
        // System.out.print(i + " ");
        // }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public void delete(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deleting data from array");
        System.out.println("Enter the index postion of the array to delete the element");
        int index = sc.nextInt();
        int[] arr_new = new int[array.length - 1];
        // Creating a new array and updating with the deleted values
        // for (int i = 0, k = 0; i < array.length; i++) {
        // if (i != index) {
        // arr_new[k] = array[i];
        // k++;
        // }
        // }

        // Without creating a new array, deleting the element and setting the last value
        // as default value or 0 (for integers)
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        System.out.println("Array after deletion: ");
        // for (int i : array) {
        // System.out.print(i + " ");
        // }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public void update(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index postion of the array to update the element");
        int index = sc.nextInt();
        System.out.println("Enter the element value : ");
        int val = sc.nextInt();
        array[index] = val;
        System.out.println("Array after deletion: " + Arrays.toString(array));
        System.out.println();
    }
}