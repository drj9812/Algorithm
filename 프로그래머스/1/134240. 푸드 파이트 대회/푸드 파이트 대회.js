const solution = (food) => {
    let result = '';

    food.forEach((value, index) => {
        if (index > 0) {
            const count = Math.trunc(value / 2);
            result += (index + '').repeat(count);
        }
    });

    const reverse = result.split('').reverse().join('');
    return result + '0' + reverse;
};