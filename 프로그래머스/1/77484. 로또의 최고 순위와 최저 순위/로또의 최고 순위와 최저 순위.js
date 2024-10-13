const solution = (lottos, win_nums) => {
    let unknownNumbers = 0;
    let matchedNumbers = 0;

    for (let i = 0; i < lottos.length; i++) {
        if (lottos[i] === 0) {
            unknownNumbers++;
        } else if (win_nums.includes(lottos[i])) {
            matchedNumbers++;
        }
    }
    
    const maxPossibleMatches = unknownNumbers + matchedNumbers;
    const minPossibleMatches = matchedNumbers;
    
    const rank = (count) => {
        if (count === 6) return 1;
        if (count === 5) return 2;
        if (count === 4) return 3;
        if (count === 3) return 4;
        if (count === 2) return 5;
        return 6;
    };
    
    return [rank(maxPossibleMatches), rank(minPossibleMatches)];
};