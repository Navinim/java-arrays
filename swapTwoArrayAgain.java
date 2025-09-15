package ArrayList;
import java.util.*;

public class swapTwoArrayAgain {
	public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] temp;

        temp = arr1;
        arr1 = arr2;
        arr2 = temp;

        System.out.println("Array1: " + Arrays.toString(arr1));
        System.out.println("Array2: " + Arrays.toString(arr2));
    }
}
