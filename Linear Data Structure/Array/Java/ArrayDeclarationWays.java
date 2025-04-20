public class ArrayDeclarationWays {
    public static void main(String[] args) {
        // Declaration with initialization
        int[] a = {1, 2, 3};

        // Declaration then initialization
        int[] b;
        b = new int[]{4, 5, 6};

        // Declaring with size, then assigning values
        int[] c = new int[3];
        c[0] = 7;
        c[1] = 8;
        c[2] = 9;

        // Printing all arrays
        System.out.println("Array a:");
        for (int val : a) System.out.print(val + " ");
        System.out.println("\nArray b:");
        for (int val : b) System.out.print(val + " ");
        System.out.println("\nArray c:");
        for (int val : c) System.out.print(val + " ");
    }
}
