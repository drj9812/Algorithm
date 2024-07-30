const solution = (a, b) => {
    let sum = 0;
    
    if (a < b) {
        sum = a;
        
        for (let i = a + 1; i <= b; i++) {
            sum += i;
        }
    } else {
        sum = b;
        
        for (let i = b + 1; i <= a; i++) {
            sum += i;
        }
    }
    return sum;
};
