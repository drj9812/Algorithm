const solution = (n, arr1, arr2) => {
    const binarys1 = convertToBinary(n, arr1);
    const binarys2 = convertToBinary(n, arr2);
    const result = [];

    for (let i = 0; i < n; i++) {
        let char = '';

        for (let j = 0; j < binarys1[i].length; j++) {
            if (binarys1[i][j] === '1' || binarys2[i][j] === '1') {
                char += '#';
            } else {
                char += ' ';
            }
        }

    result.push(char);
    }
    return result;
}
const convertToBinary = (n, arr) => {
    const binarys = arr.map((e) => e.toString(2).length === n ? e.toString(2) : e.toString(2).padStart(n, '0'));
    
    return binarys;
}