function reverseWords(sentence) {
    let words = sentence.split(' ');
    let reversedWords = words.map(word => reverseString(word));
    let reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

function reverseString(str) {
    return str.split('').reverse().join('');
}

let inputSentence = "Software Engineer";
let reversedSentence = reverseWords(inputSentence);

console.log("Original Sentence: " + inputSentence);
console.log("Reversed Sentence: " + reversedSentence);