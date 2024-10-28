import java.util.*;

public class Question_3_model_2 {
    public static void main(String args[]) {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);
        array2.add(1);
        array2.add(2);
        array2.add(3);
        ArrayList<Integer> common = new ArrayList<>();
        for (int i : array1) {
            if (array2.contains(i)) {
                common.add(i);
            }
        }
        for (int val : common) {
            System.out.println(val);
        }
        System.out.println(common);
    }
}
