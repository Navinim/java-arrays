package ArrayList;
import java.util.*;
public class kSmallest {
	public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;

        Arrays.sort(arr);
        System.out.print(k + " smallest elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
