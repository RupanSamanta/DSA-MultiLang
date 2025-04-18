public class ArrayBasics {

    public static void main(String[] args) {
        // Declaration and initialization of an integer array
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing array elements using their index (starting from 0)
        System.out.println("Element at index 0: " + numbers[0]); // Output: 10
        System.out.println("Element at index 2: " + numbers[2]); // Output: 30

        // Iterating through the array using a for loop
        System.out.println("\nAll elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Another way to iterate using an enhanced for loop (for-each loop)
        System.out.println("\nAll elements using enhanced for loop:");
        for (int number : numbers) {
            System.out.println("Element: " + number);
        }

        // Update the third element
        numbers[2] = 99;
        System.out.println("\nUpdated 3rd element: " + numbers[2]);

        // Demonstrating the linear nature - elements are stored sequentially
        System.out.println("\nArray length: " + numbers.length); // Output: 5
    }
}