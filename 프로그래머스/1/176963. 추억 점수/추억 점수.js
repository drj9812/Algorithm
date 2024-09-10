const solution = (name, yearning, photo) => {
    let result = [];

    return photo.reduce((prev, curr) => {
        let total = 0;
        
        curr.reduce((prev1, curr1) => {
            name.includes(curr1) ? total += yearning[name.indexOf(curr1)] : null;
            
            return total;
        }, total);

        result.push(total);

        return prev;
    }, result);
}