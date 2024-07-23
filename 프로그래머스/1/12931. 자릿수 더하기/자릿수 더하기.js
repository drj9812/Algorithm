const solution = (N) => (N + '').split('').reduce((prev, curr) => {
    return prev + Number(curr); 
}, 0);