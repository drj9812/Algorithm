const solution = (myString) => myString.split('').map((word) => {
    return word === 'a' ? 'A' : word !== 'A' ? word.toLowerCase() : word;
}).join('');