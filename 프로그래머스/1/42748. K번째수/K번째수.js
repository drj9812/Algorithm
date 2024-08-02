const solution = (array, commands) => commands.map((value) => {
    return array.slice(value[0] - 1, value[1]).sort((a, b) => a - b)[value[2] - 1];
});
