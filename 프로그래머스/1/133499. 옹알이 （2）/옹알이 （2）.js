const solution = (babbling) => {
    const possibleSounds = ['aya', 'ye', 'woo', 'ma'];

    const isValidBabbling = (str) => {
        let prevSound = '';

        while (str.length > 0) {
            let matched = false;

            for (const sound of possibleSounds) {
                if (!str.startsWith(sound)) continue;
                if (sound === prevSound) return false;

                prevSound = sound;
                str = str.slice(sound.length);
                matched = true;

                break;
            }
            if (!matched) return false;
        }
        return true;
    };
    return babbling.filter(isValidBabbling).length;
}