const solution = (number, limit, power) => {
    let sum = 0;

    for (let i = 1; i <= number; i++) {
        getDivisorsCount(i) > limit ? sum += power : sum += getDivisorsCount(i); 
    }
    
    return sum;
}

const getDivisorsCount = (n) => {
    let count = 1;
    let divisor = 2;

    while (n > 1) {
        let exponent = 0;

        while (n % divisor === 0) {
            n /= divisor;
            exponent++;
        }

        count *= (exponent + 1);
        divisor++;
    }

    return count;
};