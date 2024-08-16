function solution(a, b, n) { 
    let total = 0;
    
    while (n >= a) {
        const exchange = Math.floor(n / a) * b;
        total += exchange;
        n = n % a + exchange;
    }
    
    return total;
}