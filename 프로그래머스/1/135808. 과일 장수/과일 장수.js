// const solution = (k, m, score) => {
//     return score.sort((a, b) => a - b)
//         .reduce((acc, curr, i) => {
//             if (i >= score.length % m && i % m === 0) acc += curr * m;
        
//             return acc;
//         }, 0);
// };

const solution = (k, m, score) => {
    // 사과 점수를 내림차순으로 정렬
    score.sort((a, b) => b - a);
    
    let total = 0;
    // 상자를 포장할 수 있는 개수
    const numBoxes = Math.floor(score.length / m);
    
    // 각 상자에 대해 최저 점수를 계산하여 총 이익을 계산
    for (let i = 0; i < numBoxes; i++) {
        // 현재 상자의 최저 점수는 현재 점수 배열의 (i * m + m - 1) 인덱스에 위치
        const minScore = score[i * m + m - 1];
        total += minScore * m;
    }
    
    return total;
};
