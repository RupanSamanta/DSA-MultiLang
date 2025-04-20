import java.util.Arrays;
import java.util.List;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int[] arr2 = {5, 2, 9, 1, 5, 6};
        int[] arr3 = {1, 2, 3, 4};

        // 1. Arrays.toString() → Convert array to readable string
        System.out.println("toString(): " + Arrays.toString(arr));

        // 2. Arrays.equals() → Compare two arrays
        System.out.println("equals(): " + Arrays.equals(arr, arr2)); // true
        System.out.println("equals(): " + Arrays.equals(arr, arr3)); // false

        // 3. Arrays.copyOf(original, newLength)
        int[] copy = Arrays.copyOf(arr, 10); // adds 0s to make length 10
        System.out.println("copyOf(): " + Arrays.toString(copy));

        // 4. Arrays.copyOfRange(original, from, to)
        int[] rangeCopy = Arrays.copyOfRange(arr, 2, 5); // index 2 to 4
        System.out.println("copyOfRange(): " + Arrays.toString(rangeCopy));

        // 5. Arrays.fill(array, value)
        int[] filled = new int[5];
        Arrays.fill(filled, 7); // fill all elements with 7
        System.out.println("fill(): " + Arrays.toString(filled));

        // 6. Arrays.setAll(array, generator)
        int[] squares = new int[5];
        Arrays.setAll(squares, i -> i * i); // fills array with squares of indices
        System.out.println("setAll(): " + Arrays.toString(squares));

        // 7. Arrays.sort() - ascending sort
        int[] sortArray = {9, 2, 8, 1};
        Arrays.sort(sortArray);
        System.out.println("sort(): " + Arrays.toString(sortArray));

        // 8. Arrays.sort(array, fromIndex, toIndex)
        int[] partialSort = {10, 9, 5, 4, 7};
        Arrays.sort(partialSort, 1, 4); // sort only index 1 to 3
        System.out.println("Partial sort(): " + Arrays.toString(partialSort));

        // 9. Arrays.parallelSort() - multi-threaded sorting (faster for large arrays)
        int[] parallel = {6, 2, 9, 4, 1};
        Arrays.parallelSort(parallel);
        System.out.println("parallelSort(): " + Arrays.toString(parallel));

        // 10. Arrays.binarySearch() - use only on sorted arrays
        int[] sorted = {1, 3, 5, 7, 9};
        int idx = Arrays.binarySearch(sorted, 5);
        System.out.println("binarySearch(5): index = " + idx);

        // 11. Arrays.hashCode()
        System.out.println("hashCode(): " + Arrays.hashCode(arr));

        // 12. Arrays.deepToString() → for multi-dimensional arrays
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("deepToString(): " + Arrays.deepToString(matrix));

        // 13. Arrays.deepEquals() → for comparing 2D arrays
        int[][] mat2 = {{1, 2}, {3, 4}};
        System.out.println("deepEquals(): " + Arrays.deepEquals(matrix, mat2));

        // 14. Arrays.stream() → convert array to Stream
        System.out.println("stream().sum(): " + Arrays.stream(arr3).sum()); // sum = 10

        // 15. Arrays.asList() → convert array to List (for reference type only)
        String[] names = {"Google", "Microsoft", "Meta"};
        List<String> nameList = Arrays.asList(names);
        System.out.println("asList(): " + nameList);

        // 16. Arrays.mismatch() → returns first index where two arrays differ
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {1, 2, 0, 4};
        int mismatchIndex = Arrays.mismatch(a1, a2);
        System.out.println("mismatch(): index = " + mismatchIndex); // 2
    }
}
