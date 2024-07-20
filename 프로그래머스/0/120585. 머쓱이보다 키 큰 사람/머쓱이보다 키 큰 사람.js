const solution = (array, height) => {
    return array.reduce((count, value) => value > height ? count +1 : +0, 0);   
}