let arr = [5, 10, 15, 20, 25];

// 1. Traditional for loop
console.log("Using for loop:");
for (let i = 0; i < arr.length; i++) {
    console.log(`Element at index ${i}: ${arr[i]}`);
}

// 2. forEach (for-each loop)
console.log("\nUsing forEach loop:");
arr.forEach((value) => {
    console.log(value);
});

// 3. While loop
console.log("\nUsing while loop:");
let i = 0;
while (i < arr.length) {
    console.log(`Element at index ${i}: ${arr[i]}`);
    i++;
}
