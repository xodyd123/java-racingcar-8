package racingcar.domain.dto.request;

public class AttemptCountDto extends UserDto {

    private String attemptCount;

    public AttemptCountDto(String attemptCount) {
        this.attemptCount = attemptCount;
    }

    public String getAttemptCount() {
        return attemptCount;
    }
}
