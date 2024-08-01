const solution = (myString, pat) => {
    const result = myString.split('').map((e) => e === 'A' ? 'B' : 'A').join('');
    
    return result.includes(pat) ? 1 : 0;
}