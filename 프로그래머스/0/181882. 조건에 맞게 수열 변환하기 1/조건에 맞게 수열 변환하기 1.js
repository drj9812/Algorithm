const solution = (arr) => arr.map((value) => {
    if (value >= 50 && value % 2 === 0) {
        return value / 2;
    } else if (value < 50 && value % 2 !== 0) {
        return value * 2;
    } else {
        return value;
    }
});