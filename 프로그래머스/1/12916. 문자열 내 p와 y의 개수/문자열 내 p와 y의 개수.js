const solution = (s) => {
    const array = s.split('').map((str) => str.toUpperCase());

    let countP = 0;
    let countY = 0;
    
    array.forEach((e) => {
        if (e === 'P') {
            countP++;
        } else if (e === 'Y') {
            countY++;
        }
    })
    
    if (countP === 0 && countY === 0) {
        return true;
    }
    
    if (countP === countY) {
        return true;
    } else {
        return false;
    }
};