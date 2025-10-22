package racingcar.domain.dto.reponse;

public class ResponseCarNameDto extends ResponseUserDto {

    public ResponseCarNameDto(String[] carNames) {
        super(carNames);
    }

    @Override
    public String[] convertCarNames() {
        return super.convertCarNames();
    }
}
