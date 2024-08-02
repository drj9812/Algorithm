const solution = (s) => { // foobar, banana
    const alphabet = new Array(26).fill(false);
    const result = [];
    
    for (let i = 0; i < s.length; i++) {
        const charCode = s[i].charCodeAt(0) - 97;

        if (alphabet[charCode] === false) {
            alphabet[charCode] = true;
            result.push(-1);
        
        } else {            
            const temp = s.slice(0, i);
            result.push(i - temp.lastIndexOf(s[i]));
        }
    }
    
    return result;
};