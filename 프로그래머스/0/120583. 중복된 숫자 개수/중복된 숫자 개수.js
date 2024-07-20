const solution = (array, n) => {
    
    const result = array.filter((value) => value === n);
    return result.length;
}