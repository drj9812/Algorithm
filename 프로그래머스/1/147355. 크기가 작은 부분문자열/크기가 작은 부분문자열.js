const solution = (t, p) => t.split('').reduce((count, curr, index) => {
    const arr = t.split('').slice(index, index + p.length);

    if (arr.length !== p.length) {
        return count;
    }
    
    Number(arr.join('')) <= Number(p) ? count++ : count;

    return count;
}, 0);