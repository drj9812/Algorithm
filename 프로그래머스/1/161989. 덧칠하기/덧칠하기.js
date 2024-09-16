const solution = (n, m, section) => {
    const wall = new Array(n).fill(true);
    let count = 0;

    for (const number of section) {
        wall[number - 1] = false;
    }
    
    while (wall.indexOf(false) !== -1) {
        const start = wall.indexOf(false);
        
        for (let i = start; i < start + m && i < wall.length; i++) {
            wall[i] = true;
        }
        count++;
    }
    return count;
}

