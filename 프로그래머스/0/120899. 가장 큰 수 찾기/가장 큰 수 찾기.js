const solution = (array) => {
    let max = 0;
    
    for (e of array) {
        if (e > max) {
            max = e;
        } 
    }
    
    return [max, array.indexOf(max)];
};