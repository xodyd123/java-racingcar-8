package racingcar.domain.dto.reponse;

public class ResponseUserDto {
    private String[] carNames;
    private int attemptCount;

    protected ResponseUserDto(String[] carNames) {
        this.carNames = carNames;
    }

    protected ResponseUserDto(int attemptCount) {
        this.attemptCount = attemptCount ;
    }

    public String[] convertCarNames() {
        return carNames;
    }

    public int convertAttemptCount() {
        return this.attemptCount;
    }
}
