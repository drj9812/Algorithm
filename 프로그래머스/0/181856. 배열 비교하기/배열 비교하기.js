const solution = (arr1, arr2) => {
    const total1 = arr1.reduce((prev, curr) => prev + curr);
    const total2 = arr2.reduce((prev, curr) => prev + curr);
    
    if (arr1.length > arr2.length) {
        return 1;
    } else if (arr1.length < arr2.length) {
        return -1;
    } else {
        
        if (total1 > total2) {
            return 1;
        } else if (total1 < total2) {
            return -1;
        } else {
            return 0;
        }
    }
}