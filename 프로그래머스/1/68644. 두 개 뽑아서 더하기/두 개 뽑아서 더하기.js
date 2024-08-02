const solution = (numbers) => {
    const result = [];
    let sum = 0;

    for (let i = 0; i < numbers.length; i++) {
        for (let j = i + 1; j < numbers.length; j++) {
            
            sum = numbers[i] + numbers[j];
            result.includes(sum) ? null : result.push(sum);
        }
    }
    
    return result.sort((a, b) => a - b);
};