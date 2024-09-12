const solution = (answers) => {
    const first = [1, 2, 3, 4, 5];
    const second = [2, 1, 2, 3, 2, 4, 2, 5];
    const third = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

    const firstScore = answers.filter((v, i) => v === first[i % first.length]).length;
    const secondScore = answers.filter((v, i) => v === second[i % second.length]).length;
    const thirdScore = answers.filter((v, i) => v === third[i % third.length]).length;
    const maxScore = Math.max(firstScore, secondScore, thirdScore);
    
    const scores = [
        { person: 1, score: firstScore },
        { person: 2, score: secondScore },
        { person: 3, score: thirdScore }
    ];

    const result = scores
        .filter((s) => s.score === maxScore)
        .map((s) => s.person)
        .sort((a, b) => a - b);

    return result;
};