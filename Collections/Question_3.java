import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Question_3{
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(1, 2, 5, 6);
        List<Integer> common = findCommomElements(list1, list2);
        System.out.println(common);
    }
 
    public static List<Integer> findCommomElements(List<Integer> list1, List<Integer> list2){
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        return new ArrayList<>(set1);
    }
}