let arr = [11, 22, 33, 44, 55];

// Access using index
console.log("First Element:", arr[0]);

// Access using loop
for (let i = 0; i < arr.length; i++) {
    console.log(`Index ${i}: ${arr[i]}`);
}

// Access using forEach (for-each loop)
console.log("Using forEach:");
arr.forEach((element) => {
    console.log(element);
});

// Access using at method (ES2022)
console.log("Using at(0):", arr.at(0)); // First element
console.log("Using at(-1):", arr.at(-1)); // Last element