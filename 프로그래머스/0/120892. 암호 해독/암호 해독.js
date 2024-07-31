const solution = (cipher, code) => {
    const arr = cipher.split('');
    let index = 0;

    return arr.reduce((prev, curr) => {
        index++;
        return index % code === 0 ? prev + curr : prev 
    }, '');
};