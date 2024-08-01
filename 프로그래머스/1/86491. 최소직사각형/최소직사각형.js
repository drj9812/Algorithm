const solution = (sizes) => {
    let maxWidth = 0;
    let maxHeight = 0;
    
    sizes.forEach(size => {
        const [w, h] = size.sort((a, b) => b - a);
        if (w > maxWidth) maxWidth = w;
        if (h > maxHeight) maxHeight = h;
    });

    return maxWidth * maxHeight;
};