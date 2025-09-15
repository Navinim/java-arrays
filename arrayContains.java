package ArrayList;

public class arrayContains {
	public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 10;
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        System.out.println("Array contains " + target + ": " + found);
    }
}
