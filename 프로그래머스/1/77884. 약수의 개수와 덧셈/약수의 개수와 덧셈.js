const solution = (left, right) => {
    return Array.from({ length: right - left + 1 }, (_, i) => left + i)
        .reduce((prev, curr) => {
            let count = 0;
            
            for (let i = 1; i * i <= curr; i++) {
                if (curr % i === 0) {
                    count += (i * i === curr) ? 1 : 2; // i와 curr / i를 쌍으로 세기
                }
            }
            
            return count % 2 === 0 ? prev + curr : prev - curr;
        }, 0); // 초기값 0 설정
};