import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String args[]) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        System.out.println(list1);
        list1.addFirst("First");
        System.out.println(list1);
        list1.addLast("Last");
        System.out.println(list1);
        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());
        list1.removeFirst();
        System.out.println(list1);
        list1.removeLast();
        System.out.println(list1);
        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());
    }
}