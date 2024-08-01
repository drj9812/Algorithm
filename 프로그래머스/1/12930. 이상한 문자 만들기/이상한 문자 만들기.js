// const solution = (s) => s.toLowerCase().split(' ').map((e) => e.split('').map((value, index) => index % 2 === 0 ? value.toUpperCase() : value).join('')).join(' ');

const solution = (s) => s.toLowerCase().split(' ').map((e) => {
   return e.split('').map((value, index) => {
       return index % 2 === 0 ? value.toUpperCase() : value;
   }).join(''); 
}).join(' ');