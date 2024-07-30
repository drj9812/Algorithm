const solution = (s1, s2) => {
    let count = 0;

    s1.forEach(item1 => {
        s2.forEach(item2 => {

            if (item1 === item2) {
                count++;
            }
        });
    });

    return count;
};