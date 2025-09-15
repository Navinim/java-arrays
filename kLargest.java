package ArrayList;
import java.util.*;
public class kLargest {
	public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;

        Arrays.sort(arr);
        System.out.print(k + " largest elements: ");
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
