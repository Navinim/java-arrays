package ArrayList;

public class maxMinArray {
	 public static void main(String[] args) {
	        int[] arr = {15, 7, 25, 3, 9};
	        int max = arr[0], min = arr[0];

	        for (int num : arr) {
	            if (num > max) max = num;
	            if (num < min) min = num;
	        }

	        System.out.println("Max: " + max + ", Min: " + min);
	    }
}
