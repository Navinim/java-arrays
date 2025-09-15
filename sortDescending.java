package ArrayList;
import java.util.*;

public class sortDescending {
	public static void main(String[] args) {
        Integer[] arr = {5, 2, 8, 7, 1};
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Descending order: " + Arrays.toString(arr));
    }
}
