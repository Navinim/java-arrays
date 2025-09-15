package ArrayList;

public class evenPosition {
	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Elements at even positions: ");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
