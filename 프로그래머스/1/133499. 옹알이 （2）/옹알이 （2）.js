function solution(babbling) {
    const possibleSounds = ['aya', 'ye', 'woo', 'ma'];

    const isValidBabbling = (str) => {
        let prevSounds = '';

        while (str.length > 0) {
            let matched = false;

            for (const sound of possibleSounds) {
                if (!str.startsWith(sound)) continue;
                // 같은 발음이 연속된 경우
                if (sound === prevSounds) return false;
                prevSounds = sound;
                str = str.slice(sound.length);
                matched = true;
                break;
            }
            // 발음할 수 없는 문자열이 포함된 경우
            if (!matched) return false;
        }
        return true;
    };

    // babbling 배열에서 유효한 발음 문자열의 개수 계산
    return babbling.filter(isValidBabbling).length;
}