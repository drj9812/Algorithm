const solution = (absolutes, signs) => {

    return absolutes.reduce((prev, curr, index) => {

        return signs[index] ? prev + curr : prev - curr;
    }, 0);
};
