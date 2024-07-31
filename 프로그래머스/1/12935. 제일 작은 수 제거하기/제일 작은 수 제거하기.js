const solution = (arr) => {
    const copyArr = [...arr];
    // const copyArr = arr.slice();
    // const copyArr = Array.from(arr);

    const min = arr.sort((a, b) => a - b)[0];
    const index = copyArr.indexOf(min);
    
    copyArr.splice(index, 1);
    return copyArr.length !== 0 ? copyArr : [-1];
};