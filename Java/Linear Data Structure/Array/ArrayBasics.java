public class ArrayBasics {
    public static void main(String[] args) {
        // ✅ Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // ✅ Accessing elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // ✅ Traversing using for loop
        System.out.print("All elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // ✅ Traversing using enhanced for loop
        System.out.print("Enhanced for loop: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        // ✅ Updating an element
        numbers[2] = 99;
        System.out.println("Updated 3rd element: " + numbers[2]);
    }
}
