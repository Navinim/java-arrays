package ArrayList;
import java.util.Arrays;

public class removeElements {
	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int remove = 30;
        int[] newArr = new int[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != remove) {
                newArr[j++] = arr[i];
            }
        }

        System.out.println("Array after removing " + remove + ": " + Arrays.toString(newArr));
    }
}
