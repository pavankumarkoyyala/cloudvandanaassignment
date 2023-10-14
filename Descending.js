
let numbers = [3, 1, 9, 5, 7];

numbers.sort(function(a, b) {
    return b - a;
});

console.log("Sorted Array in Descending Order: " + numbers);