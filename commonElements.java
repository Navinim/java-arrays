package ArrayList;

public class commonElements {
	public static void main(String[] args) {
        String[] arr1 = {"apple", "banana", "cherry"};
        String[] arr2 = {"banana", "cherry", "date"};

        System.out.println("Common elements:");
        for (String s1 : arr1) {
            for (String s2 : arr2) {
                if (s1.equals(s2)) {
                    System.out.println(s1);
                }
            }
        }
    }
}
