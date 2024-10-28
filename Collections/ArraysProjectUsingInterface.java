import java.util.Arrays;
import java.util.Scanner;

interface ArrayInterface {
    public int[] create(int size);

    public void select(int[] array);

    public void delete(int[] array);

    public void update(int[] array);
}

public class ArraysProjectUsingInterface implements ArrayInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = null; // Array is initialized to null to handle uninitialized cases
        ArraysDemo obj = new ArraysDemo();
        boolean isExit = false;

        while (!isExit) {
            System.out.println("Select 1 to Create the Array.");
            System.out.println("Select 2 to Select the Array.");
            System.out.println("Select 3 to Delete the element from the Array.");
            System.out.println("Select 4 to Update the index value in the Array.");
            System.out.println("Select 5 to Exit");
            System.out.println();

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the size of an array: ");
                    int size = sc.nextInt();
                    array = obj.create(size); // Create and assign array
                    break;
                case 2:
                    if (array == null) {
                        System.out.println("Array not created yet. Please create the array first.");
                    } else {
                        obj.select(array);
                    }
                    break;
                case 3:
                    if (array == null) {
                        System.out.println("Array not created yet. Please create the array first.");
                    } else {
                        obj.delete(array);
                    }
                    break;
                case 4:
                    if (array == null) {
                        System.out.println("Array not created yet. Please create the array first.");
                    } else {
                        obj.update(array);
                    }
                    break;
                case 5:
                    isExit = true;
                    break;
                default:
                    System.out.println("Enter a valid input.");
                    break;
            }
        }
    }

    @Override
    public int[] create(int size) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array created successfully");
        return array;
    }

    @Override
    public void select(int[] array) {
        System.out.println("Array elements: " + Arrays.toString(array));
    }

    @Override
    public void delete(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of the element to delete: ");
        int index = sc.nextInt();
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index.");
            return;
        }
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1]; // Shift elements left
        }
        array[array.length - 1] = 0; // Set last element to 0
        System.out.println("Array after deletion: " + Arrays.toString(array));
    }

    @Override
    public void update(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index to update: ");
        int index = sc.nextInt();
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index.");
            return;
        }
        System.out.println("Enter the new value: ");
        int newValue = sc.nextInt();
        array[index] = newValue;
        System.out.println("Array after update: " + Arrays.toString(array));
    }
}
