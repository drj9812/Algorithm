const solution = (k, m, score) => {
    return score.sort((a, b) => b - a)
        .reduce((acc, curr, i) => {
            if (i % m === m - 1) {
                acc += curr * m;
            }
            return acc;
    }, 0);
};