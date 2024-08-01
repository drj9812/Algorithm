// process.stdin.setEncoding('utf8');
// process.stdin.on('data', data => {
//     const n = data.split(" ");
//     const a = Number(n[0]), b = Number(n[1]);

//     let star = '';

//     for (let i = 0; i < b; i++) {
//         for (let j = 0; j < a; j++) {
//             star += '*';
//         }
//         star += '\n';
//     }
    
//     process.stdin.setEncoding('utf8');
// process.stdin.on('data', data => {
//     const n = data.trim().split(" ");
//     const a = Number(n[0]), b = Number(n[1]);

//     let star = '';

//     for (let i = 0; i < b; i++) {
//         for (let j = 0; j < a; j++) {
//             star += '*';
//         }
//         star += '\n';
//     }

//     process.stdout.write(star);
// });

process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    // 입력 데이터 처리
    const n = data.trim().split(" ");
    const a = Number(n[0]), b = Number(n[1]);

    let star = '';

    // 별 모양 생성
    for (let i = 0; i < b; i++) {
        for (let j = 0; j < a; j++) {
            star += '*';
        }
        star += '\n';
    }

    // 결과 출력
    process.stdout.write(star);
});
