package ArrayList;
import java.util.*;
public class separateEvenOdd {
	public static void main(String[] args) {
        int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};
        int[] result = new int[arr.length];
        int index = 0;

        for (int num : arr) if (num % 2 == 0) result[index++] = num;
        for (int num : arr) if (num % 2 != 0) result[index++] = num;

        System.out.println("Even first, then odd: " + Arrays.toString(result));
    }
}
