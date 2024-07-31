const solution = (s) => {
    const arr = s.split('');
    const half = parseInt(arr.length / 2);

    return arr.length % 2 !== 0 ? arr[half] : arr.slice(half - 1, half + 1).join('');
};