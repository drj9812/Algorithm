function solution(n, k) {
    var answer = (n * 12000) + ((k - ~~(n / 10)) * 2000);
    return answer;
}