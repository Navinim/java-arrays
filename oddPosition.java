package ArrayList;

public class oddPosition {
	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Elements at odd positions: ");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
