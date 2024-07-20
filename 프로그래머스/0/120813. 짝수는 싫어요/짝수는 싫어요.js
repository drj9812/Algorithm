const solution = (n) => {
    const result = [];
    
    for (let i = 0; i <= n; i++) {
        if (i % 2 != 0) {
            result.push(i);
        }
    }
    
    return result;
}