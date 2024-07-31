const solution = (s) => {
    const mid = parseInt(s.length / 2);

    return s.length % 2 !== 0 ? s[mid] : s.slice(mid - 1, mid + 1);
};