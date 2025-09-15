package ArrayList;
import java.util.*;

public class swapThreeArrays {
	public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        int[] arr3 = {5, 6};
        int[] temp;

        temp = arr1;
        arr1 = arr2;
        arr2 = arr3;
        arr3 = temp;

        System.out.println("Array1: " + Arrays.toString(arr1));
        System.out.println("Array2: " + Arrays.toString(arr2));
        System.out.println("Array3: " + Arrays.toString(arr3));
    }
}
