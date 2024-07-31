// const solution = (price, money, count) => Array.from({ length: count }, (_, i) => {
//     return price * (i + 1);
// }).reduce((prev, curr) => prev + curr);

const solution = (price, money, count) => {
    const cost = Array.from({ length: count }, (_, i) => price * (i + 1)).reduce((prev, curr) => prev + curr);
    
    return cost - money > 0 ? cost - money : 0;
}