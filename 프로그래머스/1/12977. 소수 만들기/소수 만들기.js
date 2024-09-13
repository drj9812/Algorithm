const solution = (nums) => {
    let count = 0;

    for (let i = 0; i < nums.length; i++) {
        
        if (i > nums.length - 3) return count;

        for (let j = i + 1; j < nums.length; j++) {
            for (let k = j + 1; k < nums.length; k++) {
                let sum = nums[i] + nums[j] + nums[k];

                if (isPrime(sum)) count++;
            }
        }
    }
}

const isPrime = (num) => {
    if (num < 2) return false;
    
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) return false;
    }
    
    return true;
};