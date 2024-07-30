const solution = (x) => {
    const sum = (x + '').split('').reduce((prev, curr) => Number(prev) + Number(curr));
    
    return x % sum === 0;
};