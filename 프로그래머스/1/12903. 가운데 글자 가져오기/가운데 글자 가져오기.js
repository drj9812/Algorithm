const solution = (s) => {
    const arr = s.split('');
    const mid = parseInt(arr.length / 2);

    return arr.length % 2 !== 0 ? arr[mid] : arr.slice(mid - 1, mid + 1).join('');
};