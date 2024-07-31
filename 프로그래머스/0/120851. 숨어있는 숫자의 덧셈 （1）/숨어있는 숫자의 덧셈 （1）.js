const solution = (my_string) => {

    return my_string.split('').reduce((prev, curr) => {
        let num = Number(curr);

        return Number.isInteger(num) ? prev + num : prev;
    }, 0);
};