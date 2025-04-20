public class ArrayAccessWays {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        // Access using index
        System.out.println("First Element: " + arr[0]);

        // Access using loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }

        // Access using for-each loop
        System.out.println("Using for-each:");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
