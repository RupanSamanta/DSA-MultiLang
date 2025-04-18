import java.util.Stack;

public class StackUsingBuiltIn {

    public static void main(String[] args) {
        // Create a new Stack of Strings
        Stack<String> stringStack = new Stack<>();

        // Push (add) elements onto the stack
        stringStack.push("Apple");
        stringStack.push("Banana");
        stringStack.push("Cherry");

        System.out.println("Stack after pushes: " + stringStack); // Output: [Apple, Banana, Cherry]

        // Peek (view) the top element without removing it
        String topElement = stringStack.peek();
        System.out.println("Top element (peek): " + topElement);   // Output: Cherry
        System.out.println("Stack after peek: " + stringStack);  // Output: [Apple, Banana, Cherry]

        // Pop (remove) the top element
        String poppedElement = stringStack.pop();
        System.out.println("Popped element: " + poppedElement); // Output: Cherry
        System.out.println("Stack after pop: " + stringStack);   // Output: [Apple, Banana]

        // Check if the stack is empty
        boolean isEmpty = stringStack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);    // Output: false

        // Push another element
        stringStack.push("Date");
        System.out.println("Stack after another push: " + stringStack); // Output: [Apple, Banana, Date]

        // Search for an element (returns the 1-based position from the top, or -1 if not found)
        int position = stringStack.search("Banana");
        System.out.println("Position of 'Banana' (from top): " + position); // Output: 2

        int notFoundPosition = stringStack.search("Grape");
        System.out.println("Position of 'Grape': " + notFoundPosition);  // Output: -1

        // Pop the remaining elements
        while (!stringStack.isEmpty()) {
            System.out.println("Popped element: " + stringStack.pop());
        }
        System.out.println("Stack after all pops: " + stringStack); // Output: []
        System.out.println("Is the stack empty now? " + stringStack.isEmpty()); // Output: true
    }
}