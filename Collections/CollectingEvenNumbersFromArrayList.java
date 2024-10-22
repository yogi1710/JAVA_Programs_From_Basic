import java.util.ArrayList;

public class CollectingEvenNumbersFromArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            l1.add(i);
        }
        System.out.println(l1);
        ArrayList<Integer> l2 = new ArrayList<>();
        for (Integer l : l1) {
            if (l % 2 == 0) {
                l2.add(l);
            }
        }
        System.out.println(l2);
    }
}