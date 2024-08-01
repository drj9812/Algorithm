const solution = (sizes) => {
    const walletSize = [0, 0];
    
    sizes.forEach(size => {
        size.sort((a, b) => b - a);
        
        if (size[0] > walletSize[0]) walletSize[0] = size[0];
        if (size[1] > walletSize[1]) walletSize[1] = size[1];
    });

    return walletSize[0] * walletSize[1];
};