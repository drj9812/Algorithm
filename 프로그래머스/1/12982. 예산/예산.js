const solution = (d, budget) => {
    d.sort((a, b) => a - b);

    return d.reduce((count, curr) => {
        if (budget >= curr) {
            budget -= curr;
            count++;
        }
        return count;
    }, 0);
};