public class ArrayDeclarations {

    public static void main(String[] args) {
        // 1. Declare an array of integers without initializing its size
        int[] numbers;

        // Now, you need to allocate memory for the array before using it
        numbers = new int[5]; // Creates an array that can hold 5 integers

        // You can then assign values to the elements:
        numbers[0] = 10;
        numbers[1] = 20;
        // ... and so on

        System.out.println("Array 'numbers' (declared first, then sized):");
        for (int num : numbers) {
            System.out.print(num + " "); // Output will include default values (0 for int)
        }
        System.out.println();

        // 2. Declare and initialize an array with a specific size in one step
        int[] scores = new int[3]; // Creates an array of 3 integers
        scores[0] = 95;
        scores[1] = 88;
        scores[2] = 92;

        System.out.println("\nArray 'scores' (declared and sized together):");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        // 3. Declare and initialize an array with initial values directly
        String[] names = {"Alice", "Bob", "Charlie"};

        // In this case, the size of the array is automatically determined by the number of initial values.

        System.out.println("\nArray 'names' (declared and initialized with values):");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        // 4. Another way to declare and initialize with values (less common but valid)
        double[] prices = new double[] {19.99, 25.50, 9.75};

        System.out.println("\nArray 'prices' (another way to declare and initialize):");
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}