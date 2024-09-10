const solution = (k, score) => {
    const hallOfFame = [];
    
    for (let i = 1; i <= score.length; i++) {
        
        if (i <= k) {
            hallOfFame.push(score.slice(0, i).sort((a, b) => a - b)[0]);        
        } else {
            hallOfFame.push(score.slice(0, i).sort((a, b) => b - a)[k - 1]);
        }
    }
    
    return hallOfFame;
}