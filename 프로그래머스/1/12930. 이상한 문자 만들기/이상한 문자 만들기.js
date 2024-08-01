// const solution = (s) => s.split(' ').map((e) => e.split('').map((value, index) => index % 2 === 0 ? value.toUpperCase() : value.toLowerCase()).join('')).join(' ');

const solution = (s) => s.split(' ').map((e) => {
   return e.split('').map((value, index) => {
       return index % 2 === 0 ? value.toUpperCase() : value.toLowerCase();
   }).join(''); 
}).join(' ');