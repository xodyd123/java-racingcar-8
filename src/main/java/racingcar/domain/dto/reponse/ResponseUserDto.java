package racingcar.domain.dto.reponse;

import java.util.List;

public class ResponseUserDto {
    private List<String> carNames;
    private int attemptCount;

    protected ResponseUserDto(List<String> carNames) {
        this.carNames = carNames;
    }

    protected ResponseUserDto(int attemptCount) {
        this.attemptCount = attemptCount ;
    }

    public List<String> convertCarNames() {
        return carNames;
    }

    public int convertAttemptCount() {
        return this.attemptCount;
    }
}
