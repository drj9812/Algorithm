const solution = (n) => {
    let count = 0;
    
    while (n !== 1) {
        if (n % 2 === 0) {
            n = n / 2;
            count++;
        } else {
            n = n * 3 + 1;
            count ++;
        }
        
        if (count === 500) {
            return -1;
        }
    }
    return count;
};