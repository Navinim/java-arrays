package ArrayList;
import java.util.*;
public class removeDuplicates {
	public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) set.add(num);

        System.out.println("Array after removing duplicates: " + set);
    }
}
