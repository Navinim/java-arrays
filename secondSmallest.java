package ArrayList;

public class secondSmallest {
	public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num < second && num != first) {
                second = num;
            }
        }

        System.out.println("Second smallest element: " + second);
    }

}
