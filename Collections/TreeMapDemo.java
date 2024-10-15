import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String args[]) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Date", 40);
        map.put("Banana", 20);
        map.put("Apple", 10);
        map.put("Cherry", 30);
        System.out.println(map);// prints the sorted order
    }
}

// class MyComparator implements Comparator{
// public int compare(Object o1, Object o2) {
// String s1 = (String) o1;
// String s2 = o2.toString();
// return s1.compareTo(s2);
// }
// }