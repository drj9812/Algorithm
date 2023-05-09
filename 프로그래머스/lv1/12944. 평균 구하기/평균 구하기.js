function solution(arr) {
    let sum = 0;
    for (element of arr) {
        sum += element;
    }
    var avg = sum / arr.length;
    return avg;
}