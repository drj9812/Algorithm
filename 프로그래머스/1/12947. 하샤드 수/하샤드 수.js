const solution = (x) => {
    const sumOfDigits = (x + '').split('').reduce((acc, digit) => acc + Number(digit), 0);
    return x % sumOfDigits === 0;
};