
// import map to use navigable map
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        // navigable map creation and usage
        NavigableMap<String, Integer> navigableMap = new NavigableMap<>();
        navigableMap.put("AAA", 10);
        navigableMap.put("BBB", 20);
        navigableMap.put("CCC", 120);
        navigableMap.put("DDD", 160);
        navigableMap.put("EEE", 80);
        navigableMap.put("FFF", 40);
        System.out.println(navigableMap);

    }
}
