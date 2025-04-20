// Declaration with initialization
let a = [1, 2, 3];

// Declaration then assignment
let b = [];
b = [4, 5, 6];

// Declaring with fixed size using default values (using Array constructor)
let c = new Array(3).fill(0);
c[0] = 7;
c[1] = 8;
c[2] = 9;

console.log("Array a:", a);
console.log("Array b:", b);
console.log("Array c:", c);
