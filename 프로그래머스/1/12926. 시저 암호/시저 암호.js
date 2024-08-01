const solution = (s, n) => {
    return s.split('').map((value) => {
        if (value === ' ') {
            return value;
        } else {

            const charCode = value.charCodeAt(0);
            
            if (charCode >= 65 && charCode <= 90) { // 대문자 범위(65 ~ 90)
                return String.fromCharCode((charCode - 65 + n) % 26 + 65);
                
            } else { // 소문자 범위(97 ~ 122)
                return String.fromCharCode((charCode - 97 + n) % 26 + 97);
            }
        }
    }).join('');
};