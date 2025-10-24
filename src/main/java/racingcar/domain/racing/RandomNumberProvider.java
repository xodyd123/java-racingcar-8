package racingcar.domain.racing;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberProvider implements NumberProvider {
    @Override
    public int generateNumbers() {

        return Randoms.pickNumberInRange(0, 9);
    }
}
