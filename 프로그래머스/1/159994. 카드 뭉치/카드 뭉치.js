const solution = (cards1, cards2, goal) => {
    let counter = 0;
    
    for (const word of goal) {
        if (cards1[0] === word) {
            cards1.shift();
            counter++;
        } else {
            if (cards2[0] === word) {
                cards2.shift();
                counter++;
            }
        }
    }
    return goal.length === counter ? 'Yes' : 'No';
}