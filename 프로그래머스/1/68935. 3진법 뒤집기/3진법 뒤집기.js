const solution = (n) => {
    const reversedBase3 = n.toString(3).split('').reverse().join('');
    const result = parseInt(reversedBase3, 3);
 
    return result;
}
