// const solution = (x) => (x + '').split('').reduce((prev, curr) => {
// //    const sum = (Number(prev) + Number(curr));
   
// //    return x % sum === 0 ? true : false;
//    return x % (Number(prev) + Number(curr)) ? false : true;
// })

// // const solution = (x) => (x + '').split('').reduce((prev, curr) => {
// //    return x % (Number(prev) + Number(curr)) === 0 ? true : false;
// // })

const solution = (x) => {
    const sumOfDigits = (x + '').split('').reduce((prev, curr) => Number(prev) + Number(curr));
    
    return x % sumOfDigits === 0;
};