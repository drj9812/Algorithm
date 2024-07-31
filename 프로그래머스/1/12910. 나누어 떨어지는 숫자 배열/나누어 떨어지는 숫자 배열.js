const solution = (arr, divisor) => {
    const result = arr.filter((e) => e % divisor === 0).sort((a, b) => a - b);
    
    return result.length === 0 ? [-1] : result;
}