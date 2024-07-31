const solution = (my_string) => my_string.split('').filter((e) => {
   return e !== 'a' && e !== 'e' && e !== 'i' && e !== 'o' && e !== 'u';
}).join('');
