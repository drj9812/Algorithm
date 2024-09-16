const solution = (N, stages) => {
    const stageFailureRates = [];
    const stageCounts = new Map();
    let remainingPlayers = stages.length;

    stages.sort((a, b) => a - b);
    for (const stage of stages) {
        stageCounts.get(stage) === undefined
            ? stageCounts.set(stage, 1)
            : stageCounts.set(stage, stageCounts.get(stage) + 1);
    }

    for (let stage = 1; stage <= N; stage++) {
        if (stageCounts.get(stage) !== undefined) {
            stageFailureRates.push([stage, stageCounts.get(stage) / remainingPlayers]);
            remainingPlayers -= stageCounts.get(stage);
        } else {
            stageFailureRates.push([stage, 0]);
        }
    }

    stageFailureRates.sort((a, b) => b[1] - a[1] || a[0] - b[0]);

    return stageFailureRates.map(([stage]) => stage);
};