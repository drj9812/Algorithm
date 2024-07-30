const solution = (my_string, letter) => {
    const arr = my_string.split('');
    
    return arr.reduce((prev, curr) => {
        if (curr !== letter) {
            prev.push(curr);
        }
        return prev;
    }, []).join('');
};