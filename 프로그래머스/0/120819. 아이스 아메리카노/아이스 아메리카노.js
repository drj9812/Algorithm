const solution = (money) => {
    const result = [];
    const maxCoffee = Math.trunc(money / 5500);
    
    result.push(maxCoffee);
    result.push(money - maxCoffee * 5500);
    
    return result;
}