const solution = (n) => {
    let pairCount = 0;
    if (n === 1) {
        pairCount = 1;
    } else {
        pairCount = 2;
    }
    
    for (let i = 2; i < n; i++) {
        if (n % i === 0) {
            pairCount++;
        }
    }
    
    return pairCount;
}