public class ArrayTraversalWays {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};

        // 1. Traditional for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + ": " + arr[i]);
        }

        // 2. Enhanced for loop
        System.out.println("\nUsing for-each loop:");
        for (int value : arr) {
            System.out.println("Value: " + value);
        }

        // 3. While loop
        System.out.println("\nUsing while loop:");
        int i = 0;
        while (i < arr.length) {
            System.out.println("Element: " + arr[i]);
            i++;
        }
    }
}
