const solution = (my_string) => {

    return my_string.split('').map((e) => {

        return e === e.toUpperCase() && e !== e.toLowerCase() ? e.toLowerCase() : e.toUpperCase();
    }).join('');
};