const solution = (s) => {
    const numbers = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
    
    for (const number of numbers) {

        if (s.includes(number)) {
            s = s.replaceAll(number, numbers.indexOf(number));
        }
    }
    
    return Number(s);
};