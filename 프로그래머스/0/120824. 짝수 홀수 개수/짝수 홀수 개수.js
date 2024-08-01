const solution = (num_list) => {
    const arr = [];
    let count = 0;
    
    for (let i = 0; i < num_list.length; i++) {
        if (num_list[i] % 2 === 0) {
            count++;
        }
    }
    
    arr.push(count);
    arr.push(num_list.length - count);
    
    return arr;
}