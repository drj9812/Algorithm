const solution = (phone_number) => Array.from(phone_number, (_, i) => {
    return phone_number.length - 4 > i ? '*' : _;    
}).join('');