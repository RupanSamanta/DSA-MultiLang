let arr = [10, 20, 30, 40, 50];

// ➤ Basic Modifiers
arr.push(60);                   // Adds to end
arr.unshift(0);                 // Adds to beginning
console.log("After push & unshift:", arr);

arr.pop();                      // Removes from end
arr.shift();                    // Removes from beginning
console.log("After pop & shift:", arr);

// ➤ Access & Search
console.log("Includes 30?", arr.includes(30));    // true
console.log("Index of 30:", arr.indexOf(30));     // 2
console.log("Last index of 30:", arr.lastIndexOf(30)); // 2

// ➤ Transformation
let joined = arr.join(" - ");   // Joins array into string
console.log("Joined:", joined);

let sliced = arr.slice(1, 4);   // Returns shallow copy (1 to 3)
console.log("Sliced (1-3):", sliced);

let spliced = arr.splice(2, 1, 99); // Removes 1 item at index 2, inserts 99
console.log("Splice result:", spliced);
console.log("Array after splice:", arr);

let reversed = arr.slice().reverse(); // Reverse without modifying original
console.log("Reversed:", reversed);

let sorted = arr.slice().sort((a, b) => a - b);   // Numeric sort
console.log("Sorted:", sorted);

// ➤ Iteration & Functional Ops
arr.forEach((val, idx) => {
    console.log(`Index ${idx}: ${val}`);
});

let mapped = arr.map((x) => x * 2);    // Returns new array with elements * 2
console.log("Mapped (x2):", mapped);

let filtered = arr.filter((x) => x > 25); // Elements > 25
console.log("Filtered >25:", filtered);

let reduced = arr.reduce((acc, val) => acc + val, 0); // Sum
console.log("Reduced (sum):", reduced);

let allAbove10 = arr.every((x) => x > 10); // Check if all > 10
let someAbove30 = arr.some((x) => x > 30); // Check if any > 30
console.log("All >10?", allAbove10);
console.log("Any >30?", someAbove30);

let found = arr.find((x) => x > 25);    // First element > 25
console.log("First >25:", found);

// ➤ Other utilities
let flatArr = [1, 2, [3, 4, [5, 6]]].flat(2);  // Flattens nested array
console.log("Flattened:", flatArr);

let filledArr = new Array(4).fill(7);  // Creates array with all 7
console.log("Filled Array:", filledArr);

let concatArr = arr.concat([70, 80]); // Merge arrays
console.log("Concatenated:", concatArr);
